package com.techacademy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.techacademy.entity.Users;

@Mapper
public interface UsersMapper {

    //1件検索
    Users findById(Users users);

    //全件検索
    List<Users> findAll();
}
