package com.json_springboot_read;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.json_springboot_read.services.UserCombService;
import com.json_springboot_read.model.user.User;
import com.json_springboot_read.model.user_app.userAppend;
import com.json_springboot_read.model.user_comb.UserComb;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JsonSpringbootReadApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsonSpringbootReadApplication.class, args);
        System.out.println("hello1");
    }
}
