package com.example.springjpaexample;


import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Builder
public class Account {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    private String password;

    private String email;

    @OneToMany(mappedBy = "owner")
    private Set<Study> studies;



//    private Study study;

//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name = "street", column = @Column(name = "home_street")),
//            @AttributeOverride(name = "city", column = @Column(name = "home_city")),
//            @AttributeOverride(name = "zipCode", column = @Column(name = "home_zipCode"))
//    })
//    private Address homeAddress;
//
//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name = "street", column = @Column(name = "office_street"))
//    })
//    private Address officeAddress;
}
