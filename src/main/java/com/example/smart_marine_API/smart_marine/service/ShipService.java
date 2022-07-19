package com.example.smart_marine_API.smart_marine.service;

import com.example.smart_marine_API.smart_marine.entity.Location;
import com.example.smart_marine_API.smart_marine.entity.Ship;
import com.example.smart_marine_API.smart_marine.respository.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShipService {
    @Autowired
    ShipRepository shipRepository;
    public List<Ship> getAllShips(){
        return shipRepository.findAll();
    }

    public Ship updateLiveLocation(Long shipId,Location location) {
        Ship ship = shipRepository.findById(shipId).get();
        if(ship != null){
            List<Location> locationList= ship.getLocationList();
            locationList.add(location);
            ship.setLocationList(locationList);
            ship.setLiveLocation(location);
            shipRepository.save(ship);
        }
        else{
            throw new RuntimeException("ship not found");
        }

        return ship;
    }
}
