package br.com.PojetoPraPets.Repositories;

import br.com.PojetoPraPets.Models.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Long> {
}
