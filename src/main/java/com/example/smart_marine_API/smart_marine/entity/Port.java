package com.example.smart_marine_API.smart_marine.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
public class Port {

    @Id
    private Long id;
    private String locationName;
    private String locationCountry;
    private Double latitude;
    private Double longitude;

}
