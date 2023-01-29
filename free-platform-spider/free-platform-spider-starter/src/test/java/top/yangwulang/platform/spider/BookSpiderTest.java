package top.yangwulang.platform.spider;

import com.alibaba.druid.pool.DruidDataSource;
import org.babyfish.jimmer.sql.JSqlClient;
import org.babyfish.jimmer.sql.meta.SequenceIdGenerator;
import org.babyfish.jimmer.sql.meta.UserIdGenerator;
import org.babyfish.jimmer.sql.runtime.ConnectionManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import top.yangwulang.platform.entity.book.BookInfo;
import top.yangwulang.platform.entity.book.BookInfoTable;
import top.yangwulang.platform.utils.SnowflakeKey;

import java.util.List;

public class BookSpiderTest {

    public static void main(String[] args) {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/jeesite?serverTimezone=UTC");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("tq26556570");
        JSqlClient jSqlClient = JSqlClient.newBuilder()
                .setConnectionManager(ConnectionManager.simpleConnectionManager(druidDataSource))
                .setIdGenerator(new SnowflakeKey())
                .build();
        List<BookInfo> execute = jSqlClient.createQuery(BookInfoTable.$).select(BookInfoTable.$).execute();
        System.out.println(execute);
    }

}
