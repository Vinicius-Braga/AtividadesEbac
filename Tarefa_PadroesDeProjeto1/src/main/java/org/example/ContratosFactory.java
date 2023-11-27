package org.example;

public class ContratosFactory extends Factory{
    @Override
    Car retriveCar(String requestGrade) {
        if ("A".equals(requestGrade)) {
            return new CorolaCar(100,"cheio","azul");
        } else {
            return null;
        }
    }
}
