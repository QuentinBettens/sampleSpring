package be.perso.service;

import be.perso.model.Car;
import be.perso.repository.CarRepository;

import java.util.List;

public class CarServiceImpl implements CarService {

    private CarRepository carRepository;

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public void setCarRepository(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
}
