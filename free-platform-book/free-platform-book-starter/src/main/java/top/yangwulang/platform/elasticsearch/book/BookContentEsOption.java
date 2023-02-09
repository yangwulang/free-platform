package top.yangwulang.platform.elasticsearch.book;


import co.elastic.clients.elasticsearch.ElasticsearchClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class BookContentEsOption {

    public static final String INDEX_NAME = "book_info";
    @Autowired
    private ElasticsearchClient client;

    public boolean exists() throws IOException {
        return client.indices().exists(request -> request.index(INDEX_NAME)).value();
    }

    public boolean createIndex() throws IOException {
        return client.indices().create(request -> request.index(INDEX_NAME)).acknowledged();
    }

    public ElasticsearchClient getClient() {
        return client;
    }


}
