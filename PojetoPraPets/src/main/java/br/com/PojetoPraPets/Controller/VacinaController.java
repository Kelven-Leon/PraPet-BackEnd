package br.com.PojetoPraPets.Controller;

import br.com.PojetoPraPets.Models.Vacina;
import br.com.PojetoPraPets.Service.VacinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Vacina")

public class VacinaController {
    @Autowired
    private VacinaService vacinaService;

    @GetMapping
    public List<Vacina> listarTodos() {
        return vacinaService.listarTodos();

    }

    @GetMapping("/{id}")
    public ResponseEntity<Vacina> buscarPorId(@PathVariable Long id) {
        Optional<Vacina> vacina = vacinaService.buscarPorId(id);
        return vacina.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Vacina salvar(@RequestBody Vacina vacina) {
        return vacinaService.salvar(vacina);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        vacinaService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
