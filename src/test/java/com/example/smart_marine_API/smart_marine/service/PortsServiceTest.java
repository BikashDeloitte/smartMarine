package com.example.smart_marine_API.smart_marine.service;

import com.example.smart_marine_API.smart_marine.entity.Ports;
import com.example.smart_marine_API.smart_marine.respository.PortsRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class PortsServiceTest {

    @Mock
    private PortsRepository portsRepository;
    @InjectMocks
    private PortsService portsService;

    @Test
    public void getAllPortsTest(){
        List<Ports> result = Arrays.asList(
                new Ports("Port Of Fernandina",30.6765, -81.4625),
                new Ports("Red Hook Terminal", 40.6840, -74.0062));
        Mockito.when(portsRepository.findAll()).thenReturn(result);
        List<Ports> portList = portsService.getAllPorts();

        assertEquals("Port Of Fernandina",portList.get(0).getName());
        assertEquals(40.6840,portList.get(1).getLatitude());
        assertEquals(-74.0062,portList.get(1).getLongitude());
    }
}