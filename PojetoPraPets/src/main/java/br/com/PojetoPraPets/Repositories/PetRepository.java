package br.com.PojetoPraPets.Repositories;

import br.com.PojetoPraPets.Models.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}
