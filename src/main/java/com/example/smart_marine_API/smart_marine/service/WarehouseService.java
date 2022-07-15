package com.example.smart_marine_API.smart_marine.service;

import com.example.smart_marine_API.smart_marine.entity.Warehouse;
import com.example.smart_marine_API.smart_marine.respository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseService {

    @Autowired
    WarehouseRepository warehouseRepository;

    public List<Warehouse> getAllWarehouses() {
        return warehouseRepository.findAll();
    }
}
