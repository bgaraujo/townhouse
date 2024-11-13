package com.home.townhouse.service;

import com.home.dtos.visitor.VisitorDTO;
import com.home.townhouse.entity.Visitor;
import com.home.townhouse.repository.VisitorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class VisitorService {

    @Autowired
    private VisitorRepository visitorRepository;
    @Autowired
    private ModelMapper modelMapper;

    //Todo create unit to visitor access
    public VisitorDTO create(VisitorDTO visitorDTO) {
        Visitor visitor = modelMapper.map(visitorDTO, Visitor.class);
        Jwt jwt = (Jwt) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        visitor.setUserId(UUID.fromString(jwt.getSubject()));
        return modelMapper.map(visitorRepository.save(visitor), VisitorDTO.class);
    }
}
