package com.techacademy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techacademy.dao.UsersDao;
import com.techacademy.entity.Users;

@Service
public class UsersService {

    @Autowired
    UsersDao usersDao;

    public UsersService(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    //1件検索
    public Users findById(String userId) {
        Users users = new Users();
        users.setUserId(userId);
        return this.usersDao.findById(users);
    }

    //全件取得
    public List<Users> findAll(){
        return this.usersDao.findAll();
    }
}
