package com.example.smart_marine_API.smart_marine.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ship {
    @Id
    private Long shipId;
    private String name;
    @OneToOne
    private Port sourcePort;
    @OneToOne
    private Port destinationPort;
    @OneToOne
    private Port nextPort;
    @OneToOne(cascade = CascadeType.ALL)
    private Location liveLocation;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "shipId",referencedColumnName = "shipId")
    private List<Port> portList;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "shipId",referencedColumnName = "shipId")
    private List<Location> locationList;
}
