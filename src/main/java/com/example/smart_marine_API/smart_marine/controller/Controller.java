package com.example.smart_marine_API.smart_marine.controller;

import com.example.smart_marine_API.smart_marine.entity.Ports;
import com.example.smart_marine_API.smart_marine.service.PortsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    PortsService portsService;

    @GetMapping("/ports")
    public ResponseEntity<List<Ports>> getAllPorts(){
        return ResponseEntity.ok(portsService.getAllPorts());
    }

}
