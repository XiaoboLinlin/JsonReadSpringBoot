package com.json_springboot_read;

import com.json_springboot_read.model.user_comb.UserComb;
import com.json_springboot_read.services.UserCombService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class JsonSpringbootReadApplicationTests {
    @Autowired
    private UserCombService userCombService;
    @Test
    void contextLoads() {
    }

    @Test
    void testGetUserCombs() {
        List<UserComb> userCombs = userCombService.getUserCombs();
        System.out.println("hello");

    }

}
