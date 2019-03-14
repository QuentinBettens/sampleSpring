package be.perso;

import be.perso.model.Car;
import be.perso.service.CarService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CarService carService = applicationContext.getBean("carService", CarService.class);
        Car car = carService.findAll().get(0);
        System.out.println(car.toString());
    }
}
