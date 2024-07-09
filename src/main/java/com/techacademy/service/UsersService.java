package com.techacademy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techacademy.entity.Users;
import com.techacademy.mapper.UsersMapper;

@Service
public class UsersService {

    private final UsersMapper usersMapper;

    @Autowired
    public UsersService(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    //1件検索
    public Users findById(String userId) {
        Users users = new Users();
        users.setUserId(userId);
        return this.usersMapper.findById(users);
    }

    //全件取得
    public List<Users> findAll(){
        return this.usersMapper.findAll();
    }
}
