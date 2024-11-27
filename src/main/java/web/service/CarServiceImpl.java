package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private static List<Car> cars = Arrays.asList(
            new Car("BMW", 303, 2015),
            new Car("Audi", 6, 2018),
            new Car("Toyota", 1004, 2013),
            new Car("Nissan", 3306, 2021),
            new Car("Ferrari", 450, 2012)
    );

    @Override
    public List<Car> getAllCars(int count) {
        return count > 5? cars : cars.subList(0, count);
    }
}
