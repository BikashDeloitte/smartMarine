package com.example.smart_marine_API.smart_marine.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ship {
    @Id
    private Long shipId;
    @OneToOne
    private Ports sourcePort;
    @OneToOne
    private Ports destinationPort;
    private Double latitude;
    private Double longitude;

}
