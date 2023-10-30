package top.yangwulang.platform.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.yangwulang.platform.entity.sys.Post;
import top.yangwulang.platform.repository.sys.PostRepository;
import top.yangwulang.platform.services.PostService;

/**
 * @author yangwulang
 */
@Service
public class PostServiceImpl
        extends BaseServiceImpl<Post, String, PostRepository>
        implements PostService {
    public PostServiceImpl(@Autowired PostRepository repository) {
        super(repository);
    }
}
