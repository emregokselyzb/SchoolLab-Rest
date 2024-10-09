package com.cydeo.schoollab.service;

import com.cydeo.schoollab.dto.StudentDTO;

import java.util.List;

public interface StudentService {

    List<StudentDTO> findAll();

    StudentDTO findById(Long id) throws Exception;
}
