package com.example.smart_marine_API.smart_marine.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ship {
    @Id
    private Long shipId;
    @OneToOne
    private Port sourcePort;
    @OneToOne
    private Port destinationPort;
    private Double latitude;
    private Double longitude;
    @ElementCollection
    private List<Routers> routersList;

}
