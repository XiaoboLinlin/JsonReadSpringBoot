package com.json_springboot_read.model.user;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.persistence.*;
@Data
@AllArgsConstructor
@Embeddable
public class Company {
//    @Column( name = "company_name")
    private String name;
    private String catchPhrase;
    private String bs;

    public Company() {}

}
