package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Carro> lista = new ArrayList<>();

        Honda civic = new Honda();
        civic.setNome("Civic G10");
        civic.setAno(2020);
        civic.setPlaca("ISK2E29");
        Volkswagen gol = new Volkswagen();
        gol.setNome("Gol G5");
        gol.setAno(2010);
        gol.setPlaca("ISU9R92");

        lista.add(civic);
        lista.add(gol);


        System.out.println(lista);


    }
}