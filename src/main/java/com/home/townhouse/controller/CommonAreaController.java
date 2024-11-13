package com.home.townhouse.controller;

import com.home.dtos.townhouses.CommonAreaDTO;
import com.home.townhouse.service.CommonAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common_area")
public class CommonAreaController {

    @Autowired
    private CommonAreaService commonAreaService;

    @PostMapping
    public ResponseEntity<CommonAreaDTO> create(@RequestBody CommonAreaDTO commonAreaDTO){
        return ResponseEntity.ok(commonAreaService.create(commonAreaDTO));
    }
}
