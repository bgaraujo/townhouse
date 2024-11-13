package com.home.townhouse.entity;

import com.home.dtos.document.DocumentDTO;
import com.home.dtos.enums.DocumentType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private DocumentType documentType;
    private String number;
    private LocalDate expirationDate;
}
