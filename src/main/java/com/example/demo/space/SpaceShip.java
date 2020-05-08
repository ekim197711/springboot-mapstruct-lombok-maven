package com.example.demo.space;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpaceShip {
    private String name;
    private Float speed;
    private Double fuel;
    private String fabricationDate;
    private SpaceCargo spaceCargo = new SpaceCargo();
}
