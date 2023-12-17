package com.json_springboot_read.model.user;
import lombok.AllArgsConstructor;
import lombok.Data;

import jakarta.persistence.*;
@Data
@AllArgsConstructor
@Embeddable
public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;

    @Embedded
    private Geo geo;

    public Address() {}
}
