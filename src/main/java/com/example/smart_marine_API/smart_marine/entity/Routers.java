package com.example.smart_marine_API.smart_marine.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.Embeddable;

@Component
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Embeddable
public class Routers {
    private Double latitude;
    private Double longitude;
}
