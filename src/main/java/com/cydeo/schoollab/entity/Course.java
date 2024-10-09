package com.cydeo.schoollab.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="course")
public class Course extends BaseEntity{

    private String courseName;

    @Column(columnDefinition = "text")
    private String description;
}
