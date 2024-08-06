package com.braga.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Produtos")
public class Produto {
      
      @Id
      @GeneratedValue(strategy=GenerationType.AUTO)
      private Long id;

      @Column(name="NOME")
      private String nome;

      @Column(name="valor")
      private String valor;
}
