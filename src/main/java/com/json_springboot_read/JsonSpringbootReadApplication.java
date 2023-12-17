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
        System.out.println("hello");
    }
//
//    @Bean
//    CommandLineRunner runner(UserCombService userCombService) {
//        return args -> {
//            ObjectMapper mapper = new ObjectMapper();
//            List<UserComb> userCombs = new ArrayList<>();
//
//            try (InputStream inputStream1 = TypeReference.class.getResourceAsStream("/Json/file1.json");
//                 InputStream inputStream2 = TypeReference.class.getResourceAsStream("/Json/file2.json")) {
//
//                // Read the files
//                TypeReference<List<User>> typeRefUser = new TypeReference<>() {
//                };
//                List<User> users = mapper.readValue(inputStream1, typeRefUser);
//
//                TypeReference<List<userAppend>> typeRefUserAppend = new TypeReference<>() {
//                };
//                List<userAppend> usersAppend = mapper.readValue(inputStream2, typeRefUserAppend);
//
//                // Combine data
//                for (int i = 0; i < users.size(); i++) {
//                    User user = users.get(i);
//                    userAppend userappend = usersAppend.get(i * 10); // Ensure that this does not cause IndexOutOfBoundsException
//                    UserComb userComb = new UserComb(user, userappend); // Assuming such a constructor exists
//                    userCombs.add(userComb);
//                }
//                userCombService.setUserCombs(userCombs);
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//            // Use the combined list 'userCombs' as needed
//        };
//    }
}
