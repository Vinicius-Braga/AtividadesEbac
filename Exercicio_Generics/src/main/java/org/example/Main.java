package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        Honda civic = new Honda();
        civic.setNome("Civic G10");
        civic.setAno(2020);
        civic.setPlaca("ISK2E29");

        lista.add(String.valueOf(civic));


        System.out.println(lista);


    }
}