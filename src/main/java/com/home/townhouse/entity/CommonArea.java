package com.home.townhouse.entity;

import com.home.enums.MaintenanceStatusEnum;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.UUID;

@Data
@Entity
public class CommonArea {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    private Townhouses townhouses;
    private String name;
    private String description;
    private Integer capacity;
    private Boolean availability;
    private LocalTime openingHours;
    private LocalTime closingHours;
    private String rules;
    private MaintenanceStatusEnum maintenanceStatus;
    private String availableResources;
    private BigDecimal reservationFee;
    private String imageUrl;
}
