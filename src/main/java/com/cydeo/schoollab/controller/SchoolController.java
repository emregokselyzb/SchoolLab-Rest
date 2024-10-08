package com.cydeo.schoollab.controller;

import com.cydeo.schoollab.service.AddressService;
import com.cydeo.schoollab.service.ParentService;
import com.cydeo.schoollab.service.StudentService;
import com.cydeo.schoollab.service.TeacherService;

public class SchoolController {

    private final TeacherService teacherService;
    private final StudentService studentService;

    private final ParentService parentService;
    private final AddressService addressService;

    public SchoolController(TeacherService teacherService, StudentService studentService, ParentService parentService, AddressService addressService) {
        this.teacherService = teacherService;
        this.studentService = studentService;
        this.parentService = parentService;
        this.addressService = addressService;
    }
}
