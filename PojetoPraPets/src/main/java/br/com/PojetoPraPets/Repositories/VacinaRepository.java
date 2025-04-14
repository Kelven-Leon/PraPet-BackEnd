package br.com.PojetoPraPets.Repositories;

import br.com.PojetoPraPets.Models.Vacina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacinaRepository extends JpaRepository<Vacina, Long> {
}
