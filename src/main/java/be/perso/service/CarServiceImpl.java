package be.perso.service;

import be.perso.model.Car;
import be.perso.repository.CarRepository;

import java.util.List;

public class CarServiceImpl implements CarService {

    public CarServiceImpl() {}

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    private CarRepository carRepository;

    public List<Car> findAll() {
        return carRepository.findAll();
    }

}
