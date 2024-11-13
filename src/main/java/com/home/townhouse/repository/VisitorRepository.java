package com.home.townhouse.repository;

import com.home.townhouse.entity.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VisitorRepository extends JpaRepository<Visitor, UUID> {
}
