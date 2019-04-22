package carz;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class CarService {
    public List<Car> findModelsStartingWithM(List<Car> cars) {
        return cars.stream().filter(car -> car.getModel().toLowerCase().startsWith("m")).collect(Collectors.toList());
    }

    public Map<Integer, List<Car>> findCarsByYear(List<Car> cars, int year) {
        return cars.stream().collect(groupingBy(Car::getYear));
    }
}
