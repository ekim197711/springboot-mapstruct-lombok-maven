package com.example.demo.train;

import com.example.demo.cargo.Fruit;
import com.example.demo.cargo.FruitQuantityMapper;
import com.example.demo.space.SpaceShip;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(uses = {MyDateMapper.class},componentModel = "spring")
public interface TrainMapper {
    @Mapping(source="train.model", target="name")
    @Mapping(source="train.maxSpeed", target="speed", qualifiedByName = "kmToMiles")
    @Mapping(source="train.created", target="fabricationDate")
    @Mapping(target="fuel", constant = "88.4")
    @Mapping(source="fruit.type", target="spaceCargo.content")
    @Mapping(source="fruit.quantity", target="spaceCargo.qty", qualifiedBy = FruitQuantityMapper.class)
    SpaceShip trainToSpaceShip(Train train, Fruit fruit);

    @Named("kmToMiles")
    public static Float mykmToMilesMethod(Float value){
        return value /2.5f;
    }

    @FruitQuantityMapper
    public static Integer quatity(Integer qty){
        return qty*5;
    }
}
