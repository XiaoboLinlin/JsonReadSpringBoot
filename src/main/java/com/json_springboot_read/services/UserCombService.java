package com.json_springboot_read.services;

import com.json_springboot_read.model.user_comb.UserComb;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserCombService {
    private final List<UserComb> userCombs = new ArrayList<>();
    public List<UserComb> getUserCombs() {
        return userCombs;
    }
    public void setUserCombs(List<UserComb> userCombs) {
        this.userCombs.addAll(userCombs);
    }
}
