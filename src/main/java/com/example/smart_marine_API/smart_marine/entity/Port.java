package com.example.smart_marine_API.smart_marine.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
public class Port {

    @Id
    private Long portId;
    private String locationName;
    private String locationCountry;
    @OneToOne(cascade = CascadeType.ALL)
    private Location location;

}
