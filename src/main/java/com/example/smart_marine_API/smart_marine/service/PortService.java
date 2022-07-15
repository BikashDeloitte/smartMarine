package com.example.smart_marine_API.smart_marine.service;

import com.example.smart_marine_API.smart_marine.entity.Port;
import com.example.smart_marine_API.smart_marine.respository.PortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortService {

    @Autowired
    PortRepository portRepository;

    public List<Port> getAllPorts() {
        return portRepository.findAll();
    }
}
