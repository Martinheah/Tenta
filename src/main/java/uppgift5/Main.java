package uppgift5;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ArrayList<Car> cars = new ArrayList<>();
        Car car1 = new Car("Red", "Mercedes", 1);
        cars.add(car1);
        System.out.println(car1);
        Car car2 = new Car("Blue", "Audi", 2);
        System.out.println(car2);
        cars.add(car2);
        Car car3 = new Car("Yellow", "Volvo", 3);
        cars.add(car3);
        System.out.println(car3);
        Car car4 = new Car("Black", "Volkswagen", 4);
        cars.add(car4);
        System.out.println(car4);

        mapper.writeValue(Paths.get("src/main/resources/cars.json").toFile(), cars);





    }
}
