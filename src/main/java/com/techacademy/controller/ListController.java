package com.techacademy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techacademy.service.PostsService;
import com.techacademy.service.UsersService;

@Controller
@RequestMapping("contents")
public class ListController {

//    private final UsersService usersService;
    private final PostsService postsService;

    @Autowired
    public ListController(UsersService usersService, PostsService postsService) {
//        this.usersService = usersService;
        this.postsService = postsService;
    }

    @GetMapping("/list")
    public String List(Model model) {
        model.addAttribute("postsList", postsService.findListAll());
        return "contents/list";
    }


}
