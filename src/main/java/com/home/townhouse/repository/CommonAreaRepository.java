package com.home.townhouse.repository;

import com.home.townhouse.entity.CommonArea;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CommonAreaRepository extends JpaRepository<CommonArea, UUID> {
}
