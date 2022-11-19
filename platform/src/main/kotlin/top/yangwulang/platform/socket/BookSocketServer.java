package top.yangwulang.platform.socket;

import cn.hutool.core.map.MapUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * 书籍推送消息的websocket接口
 *
 * @author : yangwulang
 */
@Component
@Slf4j
@EqualsAndHashCode
@ServerEndpoint("/book/websocket/{id}")
public class BookSocketServer {
    private static int onlineCount = 0;
    private static final CopyOnWriteArraySet<BookSocketServer> WRITE_ARRAY_SET = new CopyOnWriteArraySet<>();

    private Session session;

    private String id;
    private final static ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    /**
     * 连接建立成功调用的方法
     */
    @OnOpen
    public void onOpen(Session session, @PathParam("id") String id) {
        this.session = session;
        WRITE_ARRAY_SET.add(this);
        this.id = id;
        addOnlineCount();
        try {
            Map<Object, Object> map = MapUtil.builder().put("type", "test").put("message", "连接成功").map();
            sendMessage(OBJECT_MAPPER.writeValueAsString(map));
            log.info("有新窗口开始监听: {},当前在线人数为: {}", id, getOnlineCount());
        } catch (IOException e) {
            log.error("websocket IO Exception");
        }
    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose() {
        WRITE_ARRAY_SET.remove(this);
        subOnlineCount();
        log.info("id为：{} 断开连接", id);
        //这里写你 释放的时候，要处理的业务
        log.info("有一连接关闭！当前在线人数为" + getOnlineCount());

    }

    /**
     * 收到客户端消息后调用的方法
     *
     * @ Param message 客户端发送过来的消息
     */
    @OnMessage
    public void onMessage(String message, Session session) {
        log.info("收到来自窗口 {} 的信息: {}", id, message);
        //群发消息
/*        for (BookSocketServer item : WRITE_ARRAY_SET) {
            try {
                item.sendMessage(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
    }

    @OnError
    public void onError(Session session, Throwable error) {
        log.error("发生错误");
        error.printStackTrace();
    }

    /**
     * 实现服务器主动推送
     */
    public void sendMessage(String message) throws IOException {
        if (this.session.isOpen()) {
            this.session.getBasicRemote().sendText(message);
        }
    }

    /**
     * 群发自定义消息
     */
    public static void sendInfo(String message, String id) throws IOException {
        log.info("推送消息到窗口 {}，推送内容: {}", id, message);
        for (BookSocketServer item : WRITE_ARRAY_SET) {
            if (item.id.equals(id)) {
                item.sendMessage(message);
            }
        }
    }

    public static void sendInfo(Object message) throws IOException {
        for (BookSocketServer bookSocketServer : WRITE_ARRAY_SET) {
            bookSocketServer.sendMessage(OBJECT_MAPPER.writeValueAsString(message));
        }
    }

    public static synchronized int getOnlineCount() {
        return onlineCount;
    }

    public static synchronized void addOnlineCount() {
        BookSocketServer.onlineCount++;
    }

    public static synchronized void subOnlineCount() {
        BookSocketServer.onlineCount--;
    }

    public static CopyOnWriteArraySet<BookSocketServer> getWebSocketSet() {
        return WRITE_ARRAY_SET;
    }
}