package com.example.smart_marine_API.smart_marine;

import com.example.smart_marine_API.smart_marine.entity.Port;
import com.example.smart_marine_API.smart_marine.entity.Ship;
import com.example.smart_marine_API.smart_marine.entity.Warehouse;
import com.example.smart_marine_API.smart_marine.respository.PortRepository;
import com.example.smart_marine_API.smart_marine.respository.ShipRepository;
import com.example.smart_marine_API.smart_marine.respository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SmartMarineApplication implements CommandLineRunner {

    @Autowired
    PortRepository portRepository;
    @Autowired
    ShipRepository shipRepository;
    @Autowired
    WarehouseRepository warehouseRepository;

    public static void main(String[] args) {
        SpringApplication.run(SmartMarineApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Port portFernandina = new Port(1L,"Fernandina","USA", 30.6765, -81.4625);
        Port portSeattle = new Port(91L,"Seattle","USA", 47.6138, -122.3543);
        Port redHookTerminal = new Port(41L,"New York","USA", 40.6840, -74.0062);
        Port portOfSanFrancisco = new Port(31L,"San Francisco","USA", 37.7749, -122.4194);
        Port portHueneme = new Port(21L,"Hueneme","USA", 34.1492, -119.2087);
        Port portOfSanDiego = new Port(51L,"San Diego","USA", 32.7355, -117.1772);
        Port portOfOakland = new Port(61L,"Oakland","USA", 37.7957, -122.2792);
        Port portOfWestSacramento = new Port(71L,"West Sacramento","USA", 38.5654, -121.5488);
        Port portIwaki = new Port(81L,"Iwaki","JAPAN", 37.0490, 140.9693);
        Port portShanghai = new Port(101L,"Shanghai","CHINA", 31.2285, 121.4837);
        Port portTaipei = new Port(111L,"Taipei","TAIWAN", 25.1022, 121.6341);
        Port portBrisbane = new Port(121L,"Brisbane","AUSTRALIA", -26.6409, 152.6192);
        Port portIreland = new Port(131L,"Ireland","IRELAND",52.3398, -10.1473);
        Port portPortugal = new Port(141L,"portugal","PORTUGAL",39.1869, -9.4444);
        Port portOfLosAngeles = new Port(151L,"Los Angeles","USA", 33.7292, -118.2620);
        Port portXiamen = new Port(161L,"XIAMEN","CHINA",24.50318,118.0293);
        Port portYantian = new Port(171L,"YANTIAN","CHINA",22.575,114.2765);
        Port portTanjungPelepas = new Port(181L,"TANJUNG PELEPAS","MALAYSIA",1.3855,103.541);
        Port portPasirGudang = new Port(191L,"PASIR GUDANG","MALAYSIA",1.432973,103.9119);
        Port portHongKong = new Port(201L,"HONG KONG","HONG KONG",22.28795,114.1814);
        Port portVungTau = new Port(211L,"VUNG TAU","VIETNAM",10.39457,107.0985);

        portRepository.saveAll(Arrays.asList(
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
                portPortugal,
                portXiamen,
                portYantian,
                portTanjungPelepas,
                portPasirGudang,
                portHongKong,
                portVungTau
        ));

        shipRepository.saveAll(Arrays.asList(
//                new Ship(1L, portSeattle, portIwaki, 40.9799, -175.2444),
//                new Ship(2L, portOfSanFrancisco, portShanghai, 27.3718, 175.6179),
//                new Ship(3L, portTaipei, portOfOakland, 22.5937, 164.0201),
//                new Ship(4L, portBrisbane, portOfLosAngeles, -0.7031, -170.3242),
                new Ship(5L,redHookTerminal , portIreland , 45.1717, -38.6146),
                new Ship(6L,portFernandina , portPortugal , 32.9411, -42.1291),
                new Ship(7L,portFernandina , portIreland , 36.1260, -33.3429)
        ));

        warehouseRepository.saveAll(Arrays.asList(
                new Warehouse("Warehouse1",33.4070, -116.8602),
                new Warehouse("Warehouse2",34.2466, -116.9919),
                new Warehouse("Warehouse3",30.3097, -95.1436),
                new Warehouse("Warehouse4",31.2535, -87.8071),
                new Warehouse("Warehouse5", 31.8651, -82.9454),
                new Warehouse("Warehouse6", 33.7487, -83.1211),
                new Warehouse("Warehouse7", 34.3313, -81.4078),
                new Warehouse("Warehouse8", 36.6214, -78.2155),
                new Warehouse("Warehouse9", 42.9403, -85.3529),
                new Warehouse("Warehouse10", 41.0462, -90.9761)
        ));

    }
}