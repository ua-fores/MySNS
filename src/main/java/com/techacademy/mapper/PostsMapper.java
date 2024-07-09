package com.techacademy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.techacademy.entity.Posts;
import com.techacademy.entity.Users;

@Mapper
public interface PostsMapper {

    //1件検索
    Posts findById(Posts posts);

    //全件検索
    List<Posts> findAll();

    //投稿一覧全件表示（usersテーブルと結合）
    List<Posts> findListAll();

}
