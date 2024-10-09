package com.cydeo.schoollab.service;

import com.cydeo.schoollab.dto.CourseDTO;

import java.util.List;

public interface CourseService {

    List<CourseDTO> findAll();

    CourseDTO findById(Long id) throws Exception;
}
