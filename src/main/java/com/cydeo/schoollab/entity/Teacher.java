package com.cydeo.schoollab.entity;

import com.cydeo.schoollab.enums.EducationLevel;
import com.cydeo.schoollab.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Setter
@Getter
@Table(name="teacher")
@NoArgsConstructor
@AllArgsConstructor
public class Teacher extends BaseEntity {

    private String firstName;
    private String lastName;
    private String phoneNumber;

    private String email;
    private String userName;
    private String password;

    @Column(columnDefinition = "DATE")
    private LocalDate birthday;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private EducationLevel educationLevel;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;



}
