package com.techacademy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.techacademy.entity.Users;

@Mapper
public interface UsersDao {

    //1件検索
    Users findById(Users users);

    //全件検索
    List<Users> findAll();
}
