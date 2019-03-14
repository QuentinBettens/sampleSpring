package be.perso.repository;

import be.perso.model.Car;

import java.util.Arrays;
import java.util.List;

public class CarRepositoryImpl implements CarRepository {
    public List<Car> findAll() {
        Car car = new Car();
        car.setName("Toyota CH-R");
        car.setColor("Montain Grey");
        List<Car> cars = Arrays.asList(car);
        return cars;
    }
}
