package com.techacademy.entity;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

@Data
public class Posts {
    private Integer id;
    private String userId;
    private String postContent;
    private byte[] postImg;
    private String perentId;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private Boolean deleteFlg;


    private Users users;
//    private List<Users> users;
}
