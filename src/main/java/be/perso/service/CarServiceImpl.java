package be.perso.service;

import be.perso.model.Car;
import be.perso.repository.CarRepository;
import be.perso.repository.CarRepositoryImpl;

import java.util.List;

public class CarServiceImpl implements CarService {

    private CarRepository carRepository = new CarRepositoryImpl();

    public List<Car> findAll() {
        return carRepository.findAll();
    }
}
