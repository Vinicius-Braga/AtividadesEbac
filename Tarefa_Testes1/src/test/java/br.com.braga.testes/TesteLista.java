package br.com.braga.testes;


import org.example.Main;
import org.example.Pessoa;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TesteLista {

    @Test
    public void TesteGenero() {
        Pessoa pessoa1 = new Pessoa("Vinicius", "M");
        Pessoa pessoa2 = new Pessoa("Patricia", "F");
        Pessoa pessoa3 = new Pessoa("Juliana", "F");

        List<Pessoa> lista = new ArrayList<>();
        lista.add(pessoa1);
        lista.add(pessoa2);
        lista.add(pessoa3);

        List<Pessoa> listaFeminina = lista.stream()
                .filter(pessoa -> pessoa.getGenero().equals("F"))
                .collect(Collectors.toList());

        for (Pessoa pessoa : listaFeminina) {
            assertEquals("F", pessoa.getGenero());
        }
    }

}
