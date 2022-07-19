package com.example.smart_marine_API.smart_marine;

import com.example.smart_marine_API.smart_marine.entity.Port;
import com.example.smart_marine_API.smart_marine.entity.Location;
import com.example.smart_marine_API.smart_marine.entity.Ship;
import com.example.smart_marine_API.smart_marine.entity.Warehouse;
import com.example.smart_marine_API.smart_marine.respository.PortRepository;
import com.example.smart_marine_API.smart_marine.respository.ShipRepository;
import com.example.smart_marine_API.smart_marine.respository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        List<Location> locationWanderlust = new ArrayList<>();
        List<Location> locationTitanic = new ArrayList<>();
        List<Location> locationLiberty = new ArrayList<>();
        List<Location> locationBlackPearl = new ArrayList<>();
        locationWanderlust.add(new Location(40.6840, -74.0062));
        locationWanderlust.add(new Location(45.1717, -38.6146));
        locationTitanic.add(new Location(30.6765, -81.4625));
        locationTitanic.add( new Location(32.9411, -42.1291));
        locationLiberty.add(new Location(30.6765, -81.4625));
        locationLiberty.add(new Location(36.1260, -33.3429));
        locationBlackPearl.add(new Location(1.3855,103.541));

        Port portFernandina = new Port(1L,"Fernandina","USA", new Location(30.6765, -81.4625));
        Port portSeattle = new Port(91L,"Seattle","USA", new Location(47.6138, -122.3543));
        Port redHookTerminal = new Port(41L,"New York","USA", new Location(40.6840, -74.0062));
        Port portOfSanFrancisco = new Port(31L,"San Francisco","USA", new Location(37.7749, -122.4194));
        Port portHueneme = new Port(21L,"Hueneme","USA", new Location(34.1492, -119.2087));
        Port portOfSanDiego = new Port(51L,"San Diego","USA", new Location(32.7355, -117.1772));
        Port portOfOakland = new Port(61L,"Oakland","USA", new Location(37.7957, -122.2792));
        Port portOfWestSacramento = new Port(71L,"West Sacramento","USA", new Location(38.5654, -121.5488));
        Port portIwaki = new Port(81L,"Iwaki","JAPAN", new Location(37.0490, 140.9693));
        Port portShanghai = new Port(101L,"Shanghai","CHINA", new Location(31.2285, 121.4837));
        Port portTaipei = new Port(111L,"Taipei","TAIWAN", new Location(25.1022, 121.6341));
        Port portBrisbane = new Port(121L,"Brisbane","AUSTRALIA", new Location(-26.6409, 152.6192));
        Port portIreland = new Port(131L,"Ireland","IRELAND",new Location(52.3398, -10.1473));
        Port portPortugal = new Port(141L,"portugal","PORTUGAL",new Location(39.1869, -9.4444));
        Port portOfLosAngeles = new Port(87L,"Los Angeles","USA", new Location(33.7292, -118.2620));
        Port portXiamen = new Port(959L,"XIAMEN","CHINA",new Location(24.50318,118.0293));
        Port portYantian = new Port(1006L,"YANTIAN","CHINA",new Location(22.575,114.2765));
        Port portTanjungPelepas = new Port(1010L,"TANJUNG PELEPAS","MALAYSIA",new Location(1.3855,103.541));
        Port portPasirGudang = new Port(1634L,"PASIR GUDANG","MALAYSIA",new Location(1.432973,103.9119));
        Port portHongKong = new Port(2429L,"HONG KONG","HONG KONG",new Location(22.28795,114.1814));
        Port portVungTau = new Port(2999L,"VUNG TAU","VIETNAM",new Location(10.39457,107.0985));

        portRepository.saveAll(Arrays.asList(
                portFernandina,
                redHookTerminal,
                portSeattle,
                portOfSanFrancisco,
                portHueneme,
                portOfSanDiego,
                portOfOakland,
                portOfWestSacramento,
                portIwaki,
                portShanghai,
                portTaipei,
                portBrisbane,
                portIreland,
                portPortugal,
                portOfLosAngeles,
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
                new Ship(5L,"Wanderlust",redHookTerminal , portIreland , portIreland, new Location(45.1717, -38.6146),Arrays.asList(redHookTerminal,portFernandina), locationWanderlust),
                new Ship(6L,"Titanic",portFernandina , portPortugal , portPortugal, new Location(32.9411, -42.1291),Arrays.asList(portFernandina,portPortugal), locationTitanic),
                new Ship(7L,"Liberty",portFernandina , portIreland ,portIreland, new Location(36.1260, -33.3429),Arrays.asList(portFernandina,portIreland), locationLiberty),
                new Ship(8L,"BlackPearl",portTanjungPelepas, portOfLosAngeles,portXiamen,new Location(1.3855,103.541),Arrays.asList(
                        portTanjungPelepas,
                        portXiamen,
                        portVungTau,
                        portHongKong,
                        portYantian,
                        portXiamen,
                        portOfLosAngeles),
                        locationBlackPearl)
        ));

        warehouseRepository.saveAll(Arrays.asList(
                new Warehouse("Warehouse1",new Location(33.4070, -116.8602)),
                new Warehouse("Warehouse2",new Location(34.2466, -116.9919)),
                new Warehouse("Warehouse3",new Location(30.3097, -95.1436)),
                new Warehouse("Warehouse4",new Location(31.2535, -87.8071)),
                new Warehouse("Warehouse5", new Location(31.8651, -82.9454)),
                new Warehouse("Warehouse6", new Location(33.7487, -83.1211)),
                new Warehouse("Warehouse7", new Location(34.3313, -81.4078)),
                new Warehouse("Warehouse8", new Location(36.6214, -78.2155)),
                new Warehouse("Warehouse9", new Location(42.9403, -85.3529)),
                new Warehouse("Warehouse10", new Location(41.0462, -90.9761))
        ));

    }
}