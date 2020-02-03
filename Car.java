package Task9;

import org.w3c.dom.ls.LSOutput;

public class Car {
    String brand;
    String model;
    int horsepower;

    public Car() {
        this.brand = brand;
        this.model = "unknown";
        this.horsepower = -1;
    }

    public Car (String brand, String model, int horsepower) {
        this.brand = brand;
        this.model = model;
        this.horsepower = horsepower;
    }

    public Car(String carName, int horsePower) {
        this.brand = carName;
        this.horsepower = horsePower;
    }

    public Car(String carName, String s) {
        this.brand = carName;
        this.model = s;
    }

    public Car(String s) {
        this.brand = s;
        this.model = "unknown";
        this.horsepower = -1;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.", this.getBrand(), this.getModel(), this.getHorsepower());
    }
}
