abstract class Vehicle {
    private String brand;
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public abstract void displayInfo();
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Brand: " + getBrand());
        System.out.println("Car Speed: " + getSpeed() + " km/h");
        System.out.println("Number of Doors: " + getNumberOfDoors());
    }
}

class Bike extends Vehicle {
    private boolean hasGear;

    public Bike(String brand, int speed, boolean hasGear) {
        super(brand, speed);
        this.hasGear = hasGear;
    }

    public boolean isHasGear() {
        return hasGear;
    }

    public void setHasGear(boolean hasGear) {
        this.hasGear = hasGear;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bike Brand: " + getBrand());
        System.out.println("Bike Speed: " + getSpeed() + " km/h");
        System.out.println("Has Gear: " + (hasGear ? "Yes" : "No"));
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 180, 4);
        myCar.displayInfo();

        System.out.println();

        Bike myBike = new Bike("Yamaha", 120, true);
        myBike.displayInfo();
    }
}
