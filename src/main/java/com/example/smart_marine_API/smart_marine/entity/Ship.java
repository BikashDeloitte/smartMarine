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
    private Double latitude;
    private Double longitude;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "shipId",referencedColumnName = "shipId")
    private List<Port> portList;

}
