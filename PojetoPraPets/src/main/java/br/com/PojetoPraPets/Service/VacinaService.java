package br.com.PojetoPraPets.Service;

import br.com.PojetoPraPets.Models.Vacina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.PojetoPraPets.Repositories.VacinaRepository;

import java.util.List;
import java.util.Optional;

    @Service
    public class VacinaService {

        @Autowired
        private VacinaRepository vacinaRepository;

        public List<Vacina> listarTodas() {
            return vacinaRepository.findAll();
        }

        public Optional<Vacina> buscarPorId(Long id) {
            return vacinaRepository.findById(id);
        }

        public Vacina salvar(Vacina vacina) {
            return vacinaRepository.save(vacina);
        }

        public void excluir(Long id) {
            vacinaRepository.deleteById(id);
        }
    }

