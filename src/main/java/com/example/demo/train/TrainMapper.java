package com.example.demo.train;

import com.example.demo.cargo.Fruit;
import com.example.demo.space.SpaceShip;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {MyDateMapper.class},componentModel = "spring")
public interface TrainMapper {
    @Mapping(source="train.model", target="name")
    @Mapping(source="train.maxSpeed", target="speed")
    @Mapping(source="train.created", target="fabricationDate")
    @Mapping(target="fuel", constant = "88.4")
    @Mapping(source="fruit.type", target="spaceCargo.content")
    @Mapping(source="fruit.quantity", target="spaceCargo.qty")
    SpaceShip trainToSpaceShip(Train train, Fruit fruit);
}
