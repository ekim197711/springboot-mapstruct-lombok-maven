package com.example.demo.train;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Train {
    private String model;
    private Float maxSpeed;
    private LocalDateTime created;
}
