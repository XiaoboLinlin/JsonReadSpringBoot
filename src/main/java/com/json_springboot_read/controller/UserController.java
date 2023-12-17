package com.json_springboot_read.controller;

import com.json_springboot_read.services.UserCombService;
import com.json_springboot_read.model.user_comb.UserComb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserCombService userCombService;

    public void UserCombController(UserCombService userCombService) {
        this.userCombService = userCombService;
    }
    @GetMapping("/list")
    public List<UserComb> listUserCombs() {
        return userCombService.getUserCombs();
    }
}
