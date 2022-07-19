package com.example.smart_marine_API.smart_marine.controller;

import com.example.smart_marine_API.smart_marine.entity.Location;
import com.example.smart_marine_API.smart_marine.entity.Port;
import com.example.smart_marine_API.smart_marine.entity.Ship;
import com.example.smart_marine_API.smart_marine.entity.Warehouse;
import com.example.smart_marine_API.smart_marine.service.PortService;
import com.example.smart_marine_API.smart_marine.service.ShipService;
import com.example.smart_marine_API.smart_marine.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class Controller {

    @Autowired
    PortService portService;
    @Autowired
    ShipService shipService;
    @Autowired
    WarehouseService warehouseService;

    @GetMapping("/ports")
    public ResponseEntity<List<Port>> getAllPorts(){
        return ResponseEntity.ok(portService.getAllPorts());
    }

    @GetMapping("/ships")
    public ResponseEntity<List<Ship>> getAllShips() {
        return ResponseEntity.ok(shipService.getAllShips());
    }

    @GetMapping("/warehouses")
    public ResponseEntity<List<Warehouse>> getAllWarehouses() {
        return ResponseEntity.ok(warehouseService.getAllWarehouses());
    }

    //update the liveLocation and add liveLocation to ship locationList
    @PutMapping("/ships/{shipId}/{portId}")
    public ResponseEntity<Ship> updateLiveLocation(@PathVariable Long shipId,@PathVariable Long portId, @RequestBody Location location){
        Ship ship = shipService.updateLiveLocation(shipId,portId,location);
        return ResponseEntity.ok(ship);
    }

    //get list of port location not travelled
    @GetMapping("/ships/portList/{shipId}")
    public ResponseEntity<?> getNotTravelPortsLocation(@PathVariable Long shipId){
        List<Location> locationList = shipService.getNotTravelPortsLocation(shipId);
        return ResponseEntity.ok(locationList);
    }

    //get not travelled port list for all ship
    @GetMapping("/ships/portList")
    public ResponseEntity<?> getNotTravelPortsLocationMap(){
        Map<Long, List<Location>> locationList = shipService.getNotTravelPortsLocationMap();
        return ResponseEntity.ok(locationList);
    }
}
