package com.example.demo.space;

import com.example.demo.cargo.Fruit;
import com.example.demo.train.Train;
import com.example.demo.train.TrainMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class SpaceShipRestController {
    private final TrainMapper trainMapper;

    @GetMapping("/spaceship")
    public SpaceShip aSpaceShip(){
        Train train = new Train("T800", 201.4f, LocalDateTime.now());
        Fruit fruit = new Fruit("Bananas", 200);
        return trainMapper
                .trainToSpaceShip(train, fruit);
    }
}
