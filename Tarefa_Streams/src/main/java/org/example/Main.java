package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Digite 3 nomes e gêneros separdos por virgula (ex: Vinicius,M,Patricia,F,...): ");
        String nomes = s.nextLine();
        String[] nomesSeparados = nomes.split(",");
        Pessoa pessoa1 = new Pessoa(nomesSeparados[0], nomesSeparados[1]);
        Pessoa pessoa2 = new Pessoa(nomesSeparados[2], nomesSeparados[3]);
        Pessoa pessoa3 = new Pessoa(nomesSeparados[4], nomesSeparados[5]);

        List<Pessoa> lista = new ArrayList<>();
        lista.add(pessoa1);
        lista.add(pessoa2);
        lista.add(pessoa3);

        List<Pessoa> listaFeminina = lista.stream()
                .filter(pessoa -> pessoa.getGenero().equals("F"))
                .collect(Collectors.toList());

        listaFeminina.stream().forEach(pessoa -> System.out.println(pessoa.getNome()));


    }
}