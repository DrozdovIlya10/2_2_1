package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface CarDao {
    void add(Car car);
    List<Car> listCars(String model);
   // public List<Car> userCar(String model);
}
