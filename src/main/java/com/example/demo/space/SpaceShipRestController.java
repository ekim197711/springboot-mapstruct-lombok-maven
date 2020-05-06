package com.example.demo.space;

import com.example.demo.train.Train;
import com.example.demo.train.TrainMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpaceShipRestController {

    @GetMapping("/spaceship")
    public SpaceShip aSpaceShip(){
        return TrainMapper
                .INSTANCE
                .trainToSpaceShip(new Train("T800",201.4f));
    }
}
