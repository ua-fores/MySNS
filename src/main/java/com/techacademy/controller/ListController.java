package com.techacademy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techacademy.service.UsersService;

@Controller
@RequestMapping("contents")
public class ListController {

    private final UsersService usersService;

    @Autowired
    public ListController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/list")
    public String List(Model model) {

        model.addAttribute("usersList", usersService.findAll());
        return "contents/list";
    }


}
