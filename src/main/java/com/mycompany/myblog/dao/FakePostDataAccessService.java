package com.mycompany.myblog.dao;

import com.mycompany.myblog.model.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Repository("fakeDao")
public class FakePostDataAccessService implements PostDao{
    private static List <Post> DB = new ArrayList<>();

    @Override
    public int insertPost(UUID id, Post post) {
        DB.add(new Post(id,
                post.getTitle()));

        return 1;
    }


    @Override
    public List<Post> selectAllPost() {
        return DB;
    }

}

