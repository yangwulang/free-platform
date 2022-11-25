package top.yangwulang.platform.config.j2cache.cache.support.redis;
/*

import net.oschina.j2cache.cluster.ClusterPolicy;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

*/
/**
 * @author yangwulang
 *//*

public class SpringRedisActiveMessageListener implements MessageListener {
    private final String namespace;
    private final ClusterPolicy clusterPolicy;

    SpringRedisActiveMessageListener(ClusterPolicy clusterPolicy, String namespace) {
        this.clusterPolicy = clusterPolicy;
        this.namespace = namespace;
    }

    @Override
    public void onMessage(Message message, byte[] pattern) {
        String messageString = message.toString();
        if (messageString != null) {
            String suffix = ":";
            if (messageString.startsWith(this.namespace+ suffix)) {
                String replaceFirst = messageString.replaceFirst(this.namespace + suffix, "");
                String[] split = replaceFirst.split(suffix, 2);
                if (split.length != 2) {
                    return;
                }
                this.clusterPolicy.evict(split[0], split[1]);
            }
        }
    }
}
*/
