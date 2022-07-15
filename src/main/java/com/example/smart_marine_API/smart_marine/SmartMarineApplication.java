package com.example.smart_marine_API.smart_marine;

import com.example.smart_marine_API.smart_marine.entity.Ports;
import com.example.smart_marine_API.smart_marine.entity.Ship;
import com.example.smart_marine_API.smart_marine.respository.PortsRepository;
import com.example.smart_marine_API.smart_marine.respository.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SmartMarineApplication implements CommandLineRunner {

    @Autowired
    PortsRepository portsRepository;
    @Autowired
    ShipRepository shipRepository;

    public static void main(String[] args) {
        SpringApplication.run(SmartMarineApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Ports portFernandina = new Ports("Port Of Fernandina", 30.6765, -81.4625);
        Ports portSeattle = new Ports("port of seattle", 47.6138, -122.3543);
        Ports redHookTerminal = new Ports("Red Hook Terminal", 40.6840, -74.0062);
        Ports portOfSanFrancisco = new Ports("port of san francisco", 37.7749, -122.4194);
        Ports portHueneme = new Ports("port Hueneme", 34.1492, -119.2087);
        Ports portOfSanDiego = new Ports("Port of San Diego", 32.7355, -117.1772);
        Ports portOfOakland = new Ports("Port of Oakland", 37.7957, -122.2792);
        Ports portOfLosAngeles = new Ports("Port of Los Angeles", 33.7292, -118.2620);
        Ports portOfWestSacramento = new Ports("Port of West Sacramento", 38.5654, -121.5488);
        Ports portIwaki = new Ports("port Iwaki", 37.0490, 140.9693);
        Ports portShanghai = new Ports("port Shanghai", 31.2285, 121.4837);
        Ports portTaipei = new Ports("port Taipei", 25.1022, 121.6341);
        Ports portBrisbane = new Ports("port Brisbane", -26.6409, 152.6192);
        Ports portIreland = new Ports("port Ireland",52.3398, -010.1473);
        Ports portPortugal = new Ports("port portugal",39.1869, -009.4444);
        portsRepository.saveAll(Arrays.asList(
                portFernandina,
                redHookTerminal,
                portSeattle,
                portOfSanFrancisco,
                portHueneme,
                portOfSanDiego,
                portOfOakland,
                portOfLosAngeles,
                portOfWestSacramento,
                portIwaki,
                portShanghai,
                portTaipei,
                portBrisbane,
                portIreland,
                portPortugal
        ));

        shipRepository.saveAll(Arrays.asList(
                new Ship(1L, portSeattle, portIwaki, 40.9799, -175.2444),
                new Ship(2L, portOfSanFrancisco, portShanghai, 27.3718, 175.6179),
                new Ship(3L, portTaipei, portOfOakland, 22.5937, 164.0201),
                new Ship(4L, portBrisbane, portOfLosAngeles, -00.7031, -170.3242),
                new Ship(5L,redHookTerminal , portIreland , 45.1717, -038.6146),
                new Ship(6L,portFernandina , portPortugal , 32.9411, -042.1291),
                new Ship(7L,portFernandina , portIreland , 36.1260, -033.3429)
        ));

    }
}