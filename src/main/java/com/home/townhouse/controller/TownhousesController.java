package com.home.townhouse.controller;

import com.home.dtos.townhouses.TownhousesDTO;
import com.home.townhouse.service.TownhousesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/townhouses")
public class TownhousesController {
    @Autowired
    private TownhousesService townhousesService;

    @PostMapping
    public ResponseEntity<TownhousesDTO> create(@RequestBody TownhousesDTO townhousesDTO) {
        return ResponseEntity.ok(townhousesService.create(townhousesDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<TownhousesDTO> get(@PathVariable Long id) {
        return ResponseEntity.ok(townhousesService.get(id));
    }

}
