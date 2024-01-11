package org.example;


import java.lang.annotation.*;

@org.example.Tabela(value = "Funcioanrios")
public class Main {


    public static void main(String[] args) {
        Class<?> clazz = Main.class;

        Annotation annotation = clazz.getAnnotation(org.example.Tabela.class);
        String nomeTabela = ((Tabela) annotation).value();
        System.out.println("Tabela: " + nomeTabela);
    }
}