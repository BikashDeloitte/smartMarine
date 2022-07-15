package com.example.smart_marine_API.smart_marine.service;

import com.example.smart_marine_API.smart_marine.entity.Ship;
import com.example.smart_marine_API.smart_marine.respository.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipService {
    @Autowired
    ShipRepository shipRepository;
    public List<Ship> getAllShips(){
        return shipRepository.findAll();
    }
}
