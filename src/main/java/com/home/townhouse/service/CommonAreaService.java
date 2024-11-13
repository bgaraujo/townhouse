package com.home.townhouse.service;

import com.home.dtos.townhouses.CommonAreaDTO;
import com.home.townhouse.entity.CommonArea;
import com.home.townhouse.entity.Townhouses;
import com.home.townhouse.exception.TownhousesNotFoundException;
import com.home.townhouse.repository.CommonAreaRepository;
import com.home.townhouse.repository.TownhousesRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonAreaService {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private CommonAreaRepository commonAreaRepository;
    @Autowired
    private TownhousesRepository townhousesRepository;

    public CommonAreaDTO create(CommonAreaDTO commonAreaDTO) {
        CommonArea commonArea = modelMapper.map(commonAreaDTO, CommonArea.class);
        commonArea.setTownhouses(townhousesRepository.findById(commonAreaDTO.getTownhouses().getId()).orElseThrow
         (TownhousesNotFoundException::new));
        return modelMapper.map(commonAreaRepository.save(commonArea), CommonAreaDTO.class);
    }
}
