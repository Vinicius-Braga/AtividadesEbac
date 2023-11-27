package org.example;

public abstract class Factory {

    public Car create(String requestGrade) {
        Car car = retriveCar(requestGrade);
        car = prepareCar(car);
        return car;
    }

    private Car prepareCar(Car car) {
        car.clean();
        car.mechanicCheck();
        car.fuelCar();
        return car;
    }

    abstract Car retriveCar(String requestGrade);
}
