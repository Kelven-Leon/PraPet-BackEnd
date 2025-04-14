package br.com.PojetoPraPets.Models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Usuario {
    private Long id;
    private String nome;
    private String senha;
    private String email;

}
