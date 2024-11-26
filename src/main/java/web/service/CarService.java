package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;


public class CarService {

    public static List<Car> getCars(List<Car> cars, int count) {
        return count > 5 ? cars : cars.subList(0, count);
    }
}
