package com.cydeo.schoollab.dto;

import com.cydeo.schoollab.enums.Status;
import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StudentDTO {

    @JsonIgnore
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String userName;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private LocalDate birthday;

    private Status status;
    @JsonManagedReference(value = "student-address-reference")
    private AddressDTO address;

    private ParentDTO parent;


}
