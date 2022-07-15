package com.example.smart_marine_API.smart_marine.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Warehouse {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Double latitude;
    private Double longitude;

    public Warehouse(String name, Double latitude, Double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
