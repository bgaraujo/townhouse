package com.home.townhouse.service;

import com.home.dtos.service.ServiceDTO;
import com.home.townhouse.entity.Maintenance;
import com.home.townhouse.repository.MaintenanceRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MaintenanceService {

    @Autowired
    private MaintenanceRepository maintenanceRepository;

    @Autowired
    private ModelMapper modelMapper;

    public ServiceDTO create(ServiceDTO serviceDTO){
        Maintenance maintenance = modelMapper.map(serviceDTO, Maintenance.class);

        maintenance = maintenanceRepository.save(maintenance);
        return modelMapper.map(maintenance, ServiceDTO.class);
    }
}
