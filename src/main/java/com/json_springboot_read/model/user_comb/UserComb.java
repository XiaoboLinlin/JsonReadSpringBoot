package com.json_springboot_read.model.user_comb;

import com.json_springboot_read.model.user.Address;
import com.json_springboot_read.model.user.AddressNew;
import com.json_springboot_read.model.user.Company;
import com.json_springboot_read.model.user.User;
import com.json_springboot_read.model.user_app.userAppend;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
//@Entity
public class UserComb {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @Embedded
    private AddressNew address;
    @Embedded
    private Company company;

    private String title;
    private String body;

    // Constructor to create UserAppend from User
    public UserComb(User user, userAppend userApp) {
        this.id = user.getId();
        this.name = user.getName();
        this.address = new AddressNew();
        this.address.setGeo(user.getAddress().getGeo());
        this.company = user.getCompany();
        this.title = userApp.getTitle();
        this.body = userApp.getBody();
    }
    public UserComb() {}
}