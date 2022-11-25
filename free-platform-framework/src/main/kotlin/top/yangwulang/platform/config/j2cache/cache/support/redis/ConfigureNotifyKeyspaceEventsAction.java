package top.yangwulang.platform.config.j2cache.cache.support.redis;

import org.springframework.data.redis.connection.RedisConnection;

public class ConfigureNotifyKeyspaceEventsAction {
    static final String CONFIG_NOTIFY_KEYSPACE_EVENTS = "notify-keyspace-events";


    public void config(RedisConnection connection) {
/*        String a;
        String a = a = this.catch(connection);
        if (!a.contains(GhostedDragImage.catch("\u0001"))) {
            a = (new StringBuilder()).insert(0, a).append(SqlMap.catch("a")).toString();
        }

        boolean a;
        if (!(a = a.contains("A")) && !a.contains(GhostedDragImage.catch("#"))) {
            a = (new StringBuilder()).insert(0, a).append(SqlMap.catch("C")).toString();
        }

        if (!a && !a.contains(GhostedDragImage.catch("<"))) {
            a = (new StringBuilder()).insert(0, a).append(SqlMap.catch("\\")).toString();
        }

        if (!a.equals(a)) {
            connection.setConfig("notify-keyspace-events", a);
        }*/

    }

    public ConfigureNotifyKeyspaceEventsAction() {
    }
}