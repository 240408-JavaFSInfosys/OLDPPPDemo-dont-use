package com.revature.models;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Entity //This annotation makes this a database table
@Table(name = "cars") //This annotation allows us to name the table
@Component //This annotations makes this Class a Spring Bean
public class Car {

    @Id //This annotations makes this field the PK (Primary Key)
    @GeneratedValue(strategy = GenerationType.IDENTITY) //The PK will now auto-increment
    private int carId;
    private String engineType;
    private String color;

    //no args constructor
    public Car() {
    }

    //all args constructor
    public Car(int carId, String engineType, String color) {
        this.carId = carId;
        this.engineType = engineType;
        this.color = color;
    }

    //getters and setters
    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //TODO: we COULD add a toString if we needed to print out a car for instance

}
