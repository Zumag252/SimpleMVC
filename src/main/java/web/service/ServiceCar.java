package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Service
public class ServiceCar implements CarService {
    private static int counterCars;
    List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car(++counterCars, "Ford", "red"));
        cars.add(new Car(++counterCars, "Mazda", "blue"));
        cars.add(new Car(++counterCars, "Toyota", "black"));
        cars.add(new Car(++counterCars, "Nissan", "white"));
        cars.add(new Car(++counterCars, "Kia", "green"));
    }

    @Override
    public List<Car> getCarsFromCount(int countCar) {
        return cars.stream().limit(countCar).toList();
    }
}
