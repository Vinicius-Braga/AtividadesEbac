package br.com.braga;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
        Integer idade2 = (Integer) idade;
        System.out.println(idade);

    }
}