package com.cydeo.schoollab.dto;

import com.cydeo.schoollab.enums.Status;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TeacherDTO {

    @JsonIgnore
    private Long id;
    @NotBlank(message = "First Name cannot be empty")
    @Size(min = 2,max = 50,message = "Last Name should be between 2 and 50 characters")
    private String firstName;

    @NotBlank(message = "Last Name cannot be empty")
    @Size(min = 2,max = 50,message = "Last Name should be between 2 and 50 characters")
    private String lastName;

    @NotBlank(message = "Phone number cannot be empty")
    @Pattern(regexp = "\\d{10}",message = "Phone number should be 10 digits long")
    private String phoneNumber;

    @NotBlank(message = "Email cannot be empty")
    @Email(message = "Email should be valid")
    private String email;
    @NotBlank(message = "UserName cannot be null")
    @Size(min = 4,max = 20,message = "UserName cannot be empty")
    private String userName;
    @NotBlank(message = "Password can not be null")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Size(min = 6,message = "Password should be minimum 6 character")
    private String password;
    @Past(message = "Birthday should be in past")
    private LocalDate birthday;
    @NotNull(message = "Status cannot be null")
    private Status status;
    @NotNull(message = "Education level cannot be null")
    private EducationLevel educationLevel;
    @NotNull(message = "Address in general cannot be null")
    @Valid
    @JsonManagedReference(value = "teacher-address-reference")
    private AddressDTO address;
}
