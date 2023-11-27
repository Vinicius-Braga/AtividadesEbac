package org.example;

public class SemContratosFactory extends Factory{
    @Override
    Car retriveCar(String requestGrade) {
        if ("A".equals(requestGrade)) {
            return new PorcheCar(100,"cheio","azul");
        } else {
            return null;
        }
    }
}
