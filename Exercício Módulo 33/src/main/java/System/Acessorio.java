package System;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name= "Acessorio")
public class Acessorio {

      @Id
      @GeneratedValue(strategy= GenerationType.AUTO)
      private Long id;
      private String nome;

      @OneToOne
      private Carro carro;
}
