package com.mycompany.myblog.service;

import com.mycompany.myblog.dao.PostDao;
import com.mycompany.myblog.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class PostService {
    private final PostDao postDao;
    @Autowired
    public PostService(@Qualifier("fakeDao") PostDao postDao){
        this.postDao = postDao;
    }
    public int addPost(Post post){
        return postDao.insertPost(post);
    }
    public List<Post> getAllPost(){
        return postDao.selectAllPost();
    }
}
