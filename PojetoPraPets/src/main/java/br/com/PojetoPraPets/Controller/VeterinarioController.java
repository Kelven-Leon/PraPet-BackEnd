package br.com.PojetoPraPets.Controller;

import br.com.PojetoPraPets.Models.Veterinario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.PojetoPraPets.Service.VeterinarioService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/veterinarios")
public class VeterinarioController {

    @Autowired
    private VeterinarioService veterinarioService;

    @GetMapping
    public List<Veterinario> listarTodos() {
        return veterinarioService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Veterinario> buscarPorId(@PathVariable Long id) {
        Optional<Veterinario> veterinario = veterinarioService.buscarPorId(id);
        return veterinario.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Veterinario salvar(@RequestBody Veterinario veterinario) {
        return veterinarioService.salvar(veterinario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        veterinarioService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}

