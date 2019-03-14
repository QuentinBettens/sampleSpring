package be.perso.repository;

import be.perso.model.Car;

import java.util.List;

public interface CarRepository {
    List<Car> findAll();
}
