package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Lista {

    public static void main(String args[]) {
        parte1();
        parte2();
    }

    private static void parte1() {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite três nomes seprados por virgula: ");
        String nomes = s.nextLine();
        String[] nomesSeparado = nomes.split(",");
        List<String> lista = new ArrayList<String>();
        lista.add(nomesSeparado[0]);
        lista.add(nomesSeparado[1]);
        lista.add(nomesSeparado[2]);
        Collections.sort(lista);
        System.out.println(lista);
    }

    private static void parte2() {
        Scanner s = new Scanner(System.in);
        List<String> listaMasculino = new ArrayList<String>();
        List<String> listaFeminino = new ArrayList<String>();
        while(true) {
            System.out.println("Digite um nome e gênero separados por '-' ou 'sair' para encerrar: ");
            String entrada = s.nextLine();
            if (entrada.equalsIgnoreCase("sair")) {
                break;
            } else {
                String[] partes = entrada.split("-");

                if (partes.length == 2) {

                    String nome = partes[0];

                    String genero = partes[1];

                    if (genero.equalsIgnoreCase("M")) {

                        listaMasculino.add(nome);

                    } else {
                        listaFeminino.add(nome);
                    }
                }
            }
        }

        System.out.println(listaMasculino);
        System.out.println(listaFeminino);
    }

}