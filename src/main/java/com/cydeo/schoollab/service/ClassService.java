package com.cydeo.schoollab.service;

import com.cydeo.schoollab.dto.ClassDTO;

import java.util.List;

public interface ClassService {

    List<ClassDTO> findAll();

    ClassDTO findById(Long id) throws Exception;
}
