package com.sda.she_likes_java.final_project.entity;


import java.time.YearMonth;

//TODO: add fields
public record Car(Long id,
                  String brand,
                  String model,
                  GearboxType gearboxType,//ENUM BECAUSE ONLY TWO
                  CarBody carBody,
                  PriceCategory category,
                  FuelType fuelType,
                  Long mileage,
                  YearMonth productionDate) {


}
