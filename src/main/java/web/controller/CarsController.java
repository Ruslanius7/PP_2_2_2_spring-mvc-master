package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {
    private static final List<Car> cars = Arrays.asList(
            new Car("BMW", 505, 2017),
            new Car("Audi", 506, 2014),
            new Car("Toyota", 104, 2013),
            new Car("Honda", 1007, 2010),
            new Car("Nissan", 3306, 2023)
    );

    @GetMapping
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", CarService.getCars(cars, count));
        return "cars/cars";
    }
}
