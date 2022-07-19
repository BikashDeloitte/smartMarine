package com.example.smart_marine_API.smart_marine.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Warehouse {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    private Location location;

    public Warehouse(String name, Location location) {
        this.name = name;
        this.location = location;
    }
}
