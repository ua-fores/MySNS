package com.techacademy.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Users {
    private String userId;
    private String userPw;
    private String userName;
    private String email;
    private byte[] iconImg;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private boolean deleteFlg;
}
