package br.com.PojetoPraPets.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String especie;
    private String raca;
    private String sexo;
    private LocalDate dataDeNascimento;

    @OneToMany(mappedBy = "pet")
    private List<Vacina> vacinas;

    @OneToMany(mappedBy = "pet")
    private List<Servico> servicos;
}
