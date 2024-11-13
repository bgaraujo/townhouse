package com.home.townhouse.repository;

import com.home.townhouse.entity.Townhouses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TownhousesRepository extends JpaRepository<Townhouses, Long> {
}
