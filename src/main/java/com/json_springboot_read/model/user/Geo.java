package com.json_springboot_read.model.user;
import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.persistence.*;
@Data
@AllArgsConstructor
@Embeddable
public class Geo {

    private String lat;
    private String lng;
    public Geo() {}
}
