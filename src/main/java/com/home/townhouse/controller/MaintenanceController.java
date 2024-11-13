package com.home.townhouse.controller;

import com.home.dtos.service.ServiceDTO;
import com.home.townhouse.service.MaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/maintenance")
public class MaintenanceController {

    @Autowired
    private MaintenanceService maintenanceService;

    @PostMapping
    public ResponseEntity<ServiceDTO> create(@RequestBody ServiceDTO serviceDTO){
        return ResponseEntity.ok(maintenanceService.create(serviceDTO));
    }
}
