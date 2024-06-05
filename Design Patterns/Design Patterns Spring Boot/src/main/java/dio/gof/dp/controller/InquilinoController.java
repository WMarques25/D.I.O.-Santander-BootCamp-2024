package dio.gof.dp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.gof.dp.model.imovel.Inquilino;
import dio.gof.dp.model.imovel.InquilinoService;

@RestController
@RequestMapping("/inquilinos")
public class InquilinoController {

    @Autowired
    private InquilinoService inquilinoService;

    @PostMapping
    public ResponseEntity<Inquilino> inserir(@RequestBody Inquilino inquilino) {
        inquilinoService.salvar(inquilino);
        return ResponseEntity.ok(inquilino);
    }

    @GetMapping
    public ResponseEntity<Iterable<Inquilino>> buscarTodos() {
        return ResponseEntity.ok(inquilinoService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Inquilino> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(inquilinoService.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        inquilinoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
