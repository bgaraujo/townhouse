package com.home.townhouse.controller;

import com.home.dtos.visitor.VisitorDTO;
import com.home.townhouse.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/visitor")
public class VisitorController {

    @Autowired
    private VisitorService visitorService;

    @PostMapping
    public ResponseEntity<VisitorDTO> create(@RequestBody VisitorDTO visitorDTO){
        return ResponseEntity.ok(visitorService.create(visitorDTO));
    }
}
