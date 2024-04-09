package com.revature.daos;

import com.revature.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

//What is <Car, Integer>? It means his DAO Interface deals with Car objects and the PK is an Integer
public interface CarDAO extends JpaRepository<Car, Integer> {

    //most of the basic CRUD operations are already included in this Interface thanks to INHERITANCE

    //But we can add more methods if we want to, we'll see this later

}
