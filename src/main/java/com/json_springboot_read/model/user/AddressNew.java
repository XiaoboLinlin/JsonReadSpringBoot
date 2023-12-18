package com.json_springboot_read.model.user;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
public class AddressNew {

    @Embedded
    private Geo geo;

    public AddressNew() {}
}
