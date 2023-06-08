package exercise7;

import java.time.Year;

public class Car {
    // Modella un'auto, creane un'istanza, passala a System.out.println() in modo che vengano stampate le sue proprietà
    private String brand;
    private String model;
    private Year productionDate;

    public Car(String brand, String model, Year productionDate) {
        this.brand = brand;
        this.model = model;
        this.productionDate = productionDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Year getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Year productionDate) {
        this.productionDate = productionDate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionDate=" + productionDate +
                '}';
    }

    public static void main(String[] args) {
        Car myCar = new Car("VW", "UP", Year.of(2010));
        System.out.println(myCar);
    }
}
