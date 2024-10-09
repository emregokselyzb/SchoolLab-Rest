package com.cydeo.schoollab.service;

import com.cydeo.schoollab.dto.AddressDTO;

import java.util.List;

public interface AddressService {

    List<AddressDTO> findAll();

    AddressDTO findById(Long id) throws Exception;

    AddressDTO update(AddressDTO addressDTO) throws Exception;
    AddressDTO create(AddressDTO addressDTO) throws Exception;


}
