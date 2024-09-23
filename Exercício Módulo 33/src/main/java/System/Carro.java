package System;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name= "Carro")
public class Carro {

      @Id
      @GeneratedValue(strategy= GenerationType.AUTO)
      private Long id;
      private String nome;
      private Integer ano;
      private Double valor;
      

      @ManyToOne
      private Marca marca;

      @OneToMany
      private Acessorio acessorio;
}
