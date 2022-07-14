package com.example.smart_marine_API.smart_marine.respository;

import com.example.smart_marine_API.smart_marine.entity.Ports;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortsRepository extends JpaRepository<Ports,Long> {
}
