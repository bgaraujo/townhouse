package com.home.townhouse.entity;

import com.home.enums.AuthorizationStatusEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import javax.swing.text.Document;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Visitor {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID visitor;
    private UUID userId;
    private String fullName;
    private List<Document> documents;
    private LocalDateTime entryDateTime;
    private LocalDateTime exitDateTime;
    private Long unitId;
    private AuthorizationStatusEnum authorizationStatus;
    private String notes;
}
