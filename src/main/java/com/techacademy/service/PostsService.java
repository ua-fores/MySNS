package com.techacademy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techacademy.entity.Posts;
import com.techacademy.entity.Users;
import com.techacademy.mapper.PostsMapper;

@Service
public class PostsService {

    private final PostsMapper postsMapper;

    @Autowired
    public PostsService(PostsMapper postsMapper) {
        this.postsMapper = postsMapper;
    }

    //1件検索
    public Posts findById(Integer id) {
        Posts posts = new Posts();
        posts.setId(id);
        return this.postsMapper.findById(posts);
    }

    //全件取得
    public List<Posts> findAll(){
        return this.postsMapper.findAll();
    }

    //投稿一覧全件表示（usersテーブルと結合）
    public List<Posts> findListAll(){
        return this.postsMapper.findListAll();
    }



}
