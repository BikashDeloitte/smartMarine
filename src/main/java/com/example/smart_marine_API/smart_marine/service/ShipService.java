package com.example.smart_marine_API.smart_marine.service;

import com.example.smart_marine_API.smart_marine.entity.Location;
import com.example.smart_marine_API.smart_marine.entity.Port;
import com.example.smart_marine_API.smart_marine.entity.Ship;
import com.example.smart_marine_API.smart_marine.respository.PortRepository;
import com.example.smart_marine_API.smart_marine.respository.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ShipService {
    @Autowired
    ShipRepository shipRepository;
    @Autowired
    PortRepository portRepository;

    public List<Ship> getAllShips(){
        return shipRepository.findAll();
    }

    public Ship updateLiveLocation(Long shipId,Long portId,Location location) {
        Ship ship = shipRepository.findById(shipId).get();
        Port port = portRepository.findById(portId).get();
        if(ship != null){
            List<Location> locationList= ship.getLocationList();
            locationList.add(location);
            ship.setLocationList(locationList);
            ship.setLiveLocation(location);
            ship.setNextPort(port);
            shipRepository.save(ship);
        }
        else{
            throw new RuntimeException("ship not found");
        }

        return ship;
    }

    public List<Location> getNotTravelPortsLocation(Long shipId) {
        Ship ship = shipRepository.findById(shipId).get();
        List<Port> portNotTravel = new ArrayList<>();
        List<Location> portNotTravelLocation = new ArrayList<>();
        portNotTravelLocation.add(ship.getLiveLocation());

        if (ship != null){
            List<Port> portList = ship.getPortList();
            for(int i = 0; i < portList.size(); i++){
                if(portList.get(i).getPortId() == ship.getNextPort().getPortId()){
                    portNotTravel = portList.subList(i,portList.size());
                    break;
                }
            }

            for (Port port: portNotTravel){
                portNotTravelLocation.add(port.getLocation());
            }
        }else{
            throw new RuntimeException(" ship no found");
        }
        return portNotTravelLocation;
    }
}
