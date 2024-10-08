package com.cydeo.schoollab.dto;


import com.cydeo.schoollab.enums.Status;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ParentDTO {

    @JsonIgnore
    private Long id;

    private String name;
    private String lastName;
    private String profession;
    private String phoneNumber;

    private String userName;
    private String email;
    private String password;

    private LocalDate birthdate;

    private Status status;

    private AddressDTO address;



}
