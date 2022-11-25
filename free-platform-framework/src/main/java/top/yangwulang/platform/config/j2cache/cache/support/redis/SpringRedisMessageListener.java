package top.yangwulang.platform.config.j2cache.cache.support.redis;
/*

import net.oschina.j2cache.Command;
import net.oschina.j2cache.cluster.ClusterPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

*/
/**
 * @author yangwulang
 *//*

public class SpringRedisMessageListener implements MessageListener {
    private ClusterPolicy clusterPolicy;
    private static Logger logger = LoggerFactory.getLogger(SpringRedisMessageListener.class);
    private String channel;
    private int LOCAL_COMMAND_ID = Command.genRandomSrc();

    SpringRedisMessageListener(ClusterPolicy clusterPolicy, String channel) {
        this.clusterPolicy = clusterPolicy;
        this.channel = channel;
    }

    @Override
    public void onMessage(Message message, byte[] pattern) {
        byte[] channel = message.getChannel();
        byte[] body = message.getBody();
        if (channel != null && body!= null) {

        }
        */
/*byte[] a = message.getChannel();
        byte[] a = message.getBody();
        if (a != null && a != null) {
            try {
                Command a;
                if ((a = Command.parse(String.valueOf(SerializationUtils.deserialize(a)))) != null && !this.catch(a)) {
                    switch(a.getOperator()) {
                    case 1:
                        Logger var10000 = logger;

                        var10000.info((new StringBuilder()).insert(0, IiiiiiiiIiiI.catch("Q0{:2")).append(a.getSrc()).append(SqlMap.catch("\u0004[KXJT@\u0011P^\u0004")).append(this.channel).toString());
                        return;
                    case 2:
                        this.clusterPolicy.evict(a.getRegion(), a.getKeys());
                        logger.debug((new StringBuilder()).insert(0, IiiiiiiiIiiI.catch("M:|:v)z;?<~<w:?:i6|+?2z,l>x:3\u007fm:x6p1\"")).append(a.getRegion()).append(SqlMap.catch("\u001d\u0004ZAH\u0019")).append(String.join(IiiiiiiiIiiI.catch("3"), a.getKeys())).toString());
                        return;
                    case 3:
                        this.clusterPolicy.clear(a.getRegion());
                        logger.debug((new StringBuilder()).insert(0, SqlMap.catch("vTGTMGAU\u0004RERLT\u0004RHTEC\u0004\\ABWPCT\b\u0011VTCXK_\u0019")).append(a.getRegion()).toString());
                        return;
                    case 4:
                        logger.info((new StringBuilder()).insert(0, IiiiiiiiIiiI.catch("Q0{:2")).append(a.getSrc()).append(SqlMap.catch("\u0004@QXP\u0011P^\u0004")).append(this.channel).toString());
                        return;
                    default:
                        logger.warn((new StringBuilder()).insert(0, IiiiiiiiIiiI.catch("J1t1p(q\u007fr:l,~8z\u007fk&o:?b?")).append(a.getOperator()).toString());
                    }
                }
            } catch (Exception var6) {
                logger.error(SqlMap.catch("bPM]AU\u0004EK\u0011LPJUHT\u0004CARAXRT@\u0011IBC"), var6);
            }
        }*//*

    }
}
*/
