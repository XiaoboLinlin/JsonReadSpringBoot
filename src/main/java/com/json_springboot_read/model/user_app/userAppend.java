package com.json_springboot_read.model.user_app;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
//@Entity
public class userAppend {
    private Long userId;
    private Long id;
    private String title;
    private String body;
    public userAppend(){};
}
