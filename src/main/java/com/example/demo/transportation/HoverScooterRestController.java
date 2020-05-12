package com.example.demo.transportation;

import com.example.demo.alien.SlimeType;
import com.example.demo.alien.SlimyAlien;
import com.example.demo.train.Train;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class HoverScooterRestController {
    private final HoverScooterMapper hoverScooterMapper;

    @GetMapping("/scooter")
    public HoverScooter scooter(){
        Train train = new Train("T800", 2500.0f, LocalDateTime.now());
        SlimyAlien slimyAlien = new SlimyAlien("Mike", SlimeType.CORROSIVE);
        return hoverScooterMapper.scooter(slimyAlien, train);
    }
}
