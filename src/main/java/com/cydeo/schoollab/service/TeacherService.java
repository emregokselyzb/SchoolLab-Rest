package com.cydeo.schoollab.service;

import com.cydeo.schoollab.dto.TeacherDTO;

import java.util.List;

public interface TeacherService {

    List<TeacherDTO> findAll();

    TeacherDTO findById(Long id) throws Exception;

    TeacherDTO createTeacher (TeacherDTO teacherDTO);
}
