package com.example.smart_marine_API.smart_marine.respository;

import com.example.smart_marine_API.smart_marine.entity.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipRepository extends JpaRepository<Ship,Long> {
}
