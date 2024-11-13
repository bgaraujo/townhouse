package com.home.townhouse.service;

import com.home.dtos.service.ReservationDTO;
import com.home.townhouse.entity.Reservation;
import com.home.townhouse.repository.ReservationRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;
    @Autowired
    private ModelMapper modelMapper;

    public ReservationDTO create(ReservationDTO reservationDTO) {
        Reservation reservation = modelMapper.map(reservationDTO, Reservation.class);

        Jwt jwt = (Jwt) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        jwt.getSubject();

        return modelMapper.map(reservationRepository.save(reservation), ReservationDTO.class);
    }
}
