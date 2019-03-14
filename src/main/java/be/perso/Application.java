package be.perso;

import be.perso.model.Car;
import be.perso.service.CarService;
import be.perso.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        CarService carService = new CarServiceImpl();
        Car car = carService.findAll().get(0);
        System.out.println(car.toString());
    }
}
