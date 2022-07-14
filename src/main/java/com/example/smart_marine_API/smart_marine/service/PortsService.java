package com.example.smart_marine_API.smart_marine.service;

import com.example.smart_marine_API.smart_marine.entity.Ports;
import com.example.smart_marine_API.smart_marine.respository.PortsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortsService {

    @Autowired
    PortsRepository portsRepository;

    public List<Ports> getAllPorts() {
        return portsRepository.findAll();
    }
}
