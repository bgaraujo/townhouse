package com.home.townhouse.service;

import com.home.dtos.townhouses.CommonAreaDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonAreaService {

    @Autowired
    private ModelMapper modelMapper;

    public CommonAreaDTO create(CommonAreaDTO commonAreaDTO) {

    }
}
