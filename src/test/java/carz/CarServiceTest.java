package carz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarServiceTest {

    private List<Car> inputCars;
    private CarService carService;

    @BeforeEach
    public void setup() {
        carService = new CarService();
        inputCars = new ArrayList<>();

        inputCars.add(new Car("Ford", "M", 1900));
        inputCars.add(new Car("Ford", "Focus", 2004));
        inputCars.add(new Car("Honda", "Civic", 2004));
        inputCars.add(new Car("BMW", "M3", 2009));
        inputCars.add(new Car("Hyundai", "i30", 2009));
    }

    @Test
    public void checkModelsWithStarginM() {
        assertThat(carService.findModelsStartingWithM(inputCars)).contains(new Car("Ford", "M", 1900), new Car("BMW", "M3", 2009));
        assertThat(carService.findModelsStartingWithM(inputCars)).doesNotContain(new Car("Honda", "Civic", 2004));
    }

    @Test
    public void checkCarsByYear() {
        List<Car> year1900Cars = carService.findCarsByYear(inputCars, 1900).get(1900);
        List<Car> year2004Cars = carService.findCarsByYear(inputCars, 2004).get(2004);
        List<Car> year2009Cars = carService.findCarsByYear(inputCars, 2009).get(2009);

        assertThat(year1900Cars).contains(new Car("Ford", "M", 1900));
        assertThat(year2004Cars).contains(new Car("Ford", "Focus", 2004), new Car("Honda", "Civic", 2004));
        assertThat(year2009Cars).contains(new Car("Hyundai", "i30", 2009), new Car("BMW", "M3", 2009));
    }

}
