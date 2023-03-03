package com.mycompany.myblog.dao;

import com.mycompany.myblog.model.Post;

import java.util.List;
import java.util.UUID;


public interface PostDao {
    int insertPost(UUID id, Post post );

    default int insertPost(Post post){
        UUID id = UUID.randomUUID();
        return insertPost(id, post);
    }

    List<Post> selectAllPost();
}
