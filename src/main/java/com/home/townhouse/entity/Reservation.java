package com.home.townhouse.entity;

import com.home.enums.ReservationStatusEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private UUID personId;
    private Long townhouseId;
    private Long areaId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private ReservationStatusEnum status;
    private String specialRequirements;
}
