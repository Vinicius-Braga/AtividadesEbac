package org.example;

import javax.print.attribute.standard.Media;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Nota 1:");
        Float nota1 = (float) s.nextInt();
        System.out.println("Nota 2:");
        Float nota2 = (float) s.nextInt();
        System.out.println("Nota 3:");
        Float nota3 = (float) s.nextInt();
        System.out.println("Nota 4:");
        Float nota4 = (float) s.nextInt();

        Float media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

    }
}