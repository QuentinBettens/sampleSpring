package be.perso;

import be.perso.model.Car;
import be.perso.repository.CarRepository;
import be.perso.service.CarService;
import be.perso.service.CarServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {
    public static void main(String[] args) {
        //CarService carService = new CarServiceImpl();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CarService carService = applicationContext.getBean("carService", CarService.class);
        Car car = carService.findAll().get(0);
        System.out.println(car.toString());
    }
}
