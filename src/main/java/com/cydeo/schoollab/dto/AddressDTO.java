package com.cydeo.schoollab.dto;


import com.cydeo.schoollab.enums.AddressType;
import com.fasterxml.jackson.annotation.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressDTO {


    @JsonIgnore
    private Long id;

    private String street;

    private String country;

    private String state;

    private String city;

    private String postalCode;
    private String flag;

    private AddressType addressType;

    private Integer currentTemperature;

    private TeacherDTO teacher;

    private ParentDTO parent;

    private StudentDTO student;







}
