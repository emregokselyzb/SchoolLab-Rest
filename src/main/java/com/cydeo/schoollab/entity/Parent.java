package com.cydeo.schoollab.entity;

import com.cydeo.schoollab.enums.Status;

import javax.persistence.*;
import java.time.LocalDate;

public class Parent extends BaseEntity{

    private String firstName;
    private String lastName;
    private String profession;
    private String phoneNumber;


    private String email;
    private String userName;
    private String password;

    @Column(columnDefinition = "DATE")
    private LocalDate birthday;

    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

}
