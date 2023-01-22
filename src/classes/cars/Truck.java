package classes.cars;

import classes.cars.Car;

public class Truck extends Car {


    public int towingCapacity;

    public Truck(int vinNumber, String make, String model, String mileage, int towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;

    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
}
