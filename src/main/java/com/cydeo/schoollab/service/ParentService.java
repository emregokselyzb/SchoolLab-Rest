package com.cydeo.schoollab.service;

import com.cydeo.schoollab.dto.ParentDTO;

import java.util.List;

public interface ParentService {

    List<ParentDTO> findAll();

    ParentDTO findById(Long id) throws Exception;
}
