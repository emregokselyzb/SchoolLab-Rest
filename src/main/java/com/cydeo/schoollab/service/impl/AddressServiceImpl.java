package com.cydeo.schoollab.service.impl;

import com.cydeo.schoollab.clients.WeatherApiClient;
import com.cydeo.schoollab.dto.AddressDTO;
import com.cydeo.schoollab.dto.weather.WeatherResponse;
import com.cydeo.schoollab.entity.Address;
import com.cydeo.schoollab.exception.NotFoundException;
import com.cydeo.schoollab.repository.AddressRepository;
import com.cydeo.schoollab.service.AddressService;
import com.cydeo.schoollab.utils.MapperUtil;

import java.util.List;
import java.util.stream.Collectors;

public class AddressServiceImpl implements AddressService {

    private String accessKey;
    private final AddressRepository addressRepository;
    private final MapperUtil mapperUtil;
    private final WeatherApiClient weatherApiClient;

    public AddressServiceImpl(AddressRepository addressRepository, MapperUtil mapperUtil, WeatherApiClient weatherApiClient) {
        this.addressRepository = addressRepository;
        this.mapperUtil = mapperUtil;
        this.weatherApiClient = weatherApiClient;
    }




    @Override
    public List<AddressDTO> findAll() {
        return addressRepository.findAll()
                .stream().map(address -> mapperUtil.convert(address,new AddressDTO()))
                .collect(Collectors.toList());
    }

    @Override
    public AddressDTO findById(Long id) throws Exception {

        Address foundAddress=addressRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("No Address Found");
        AddressDTO addressDTO=mapperUtil.convert(foundAddress,new AddressDTO());
        addressDTO.setCurrentTemperature(retrieveTemperatureByCity(addressDTO.getCity()));

        return addressDTO;

        private Integer retrieveTemperatureByCity(String city){
            WeatherResponse weatherResponse=weatherAPIClient.getCurrentWeather(accessKey,city);
            if(weatherResponse==null||weatherResponse.getCurrent==null){
                return null;

            }
            return weatherResponse.getCurrent().getTemperature();
        }
    }

    @Override
    public AddressDTO update(AddressDTO addressDTO) throws Exception {
        return null;
    }

    @Override
    public AddressDTO create(AddressDTO addressDTO) throws Exception {
        return null;
    }
}
