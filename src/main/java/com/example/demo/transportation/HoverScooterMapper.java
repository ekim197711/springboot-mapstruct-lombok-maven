package com.example.demo.transportation;

import com.example.demo.alien.SlimyAlien;
import com.example.demo.train.Train;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface HoverScooterMapper {
    @Mapping(target="model", expression="java(train.getModel() + \"_\" + alien.getClass().getSimpleName())")
    @Mapping(target="madeforalien", source="alien.fullname")
    @Mapping(target="maxSpeed", source="train.maxSpeed")
    public HoverScooter scooter(SlimyAlien alien, Train train);
}
