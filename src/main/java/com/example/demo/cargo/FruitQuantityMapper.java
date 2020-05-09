package com.example.demo.cargo;

import org.mapstruct.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Qualifier
@Target(ElementType.METHOD)
public @interface FruitQuantityMapper {
}
