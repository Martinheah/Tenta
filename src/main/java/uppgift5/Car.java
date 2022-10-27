package uppgift5;

public class Car {
    private String color;
    private String brand;
    private int numberOfCars;

    public Car(String color, String brand, int numberOfCars) {
        this.color = color;
        this.brand = brand;
        this.numberOfCars = numberOfCars;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", numberOfCars=" + numberOfCars +
                '}';
    }
}
