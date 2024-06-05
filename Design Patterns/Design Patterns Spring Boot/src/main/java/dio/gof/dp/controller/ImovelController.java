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

import dio.gof.dp.model.imovel.Imovel;
import dio.gof.dp.model.imovel.ImovelService;
import dio.gof.dp.model.imovel.Inquilino;

@RestController
@RequestMapping("/imoveis")
public class ImovelController {

    @Autowired
    private ImovelService imovelService;

    @PostMapping
    public ResponseEntity<Imovel> inserir(@RequestBody Imovel imovel) {
        imovelService.salvar(imovel);
        return ResponseEntity.ok(imovel);
    }

    @GetMapping
    public ResponseEntity<Iterable<Imovel>> buscarTodos() {
        return ResponseEntity.ok(imovelService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Imovel> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(imovelService.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        imovelService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{id}/alugar")
    public ResponseEntity<Imovel> alugar(@PathVariable Long id, @RequestBody Inquilino inquilino) {
        return ResponseEntity.ok(imovelService.alugar(id, inquilino));
    }

    @PostMapping("/{id}/desalugar")
    public ResponseEntity<Imovel> desalugar(@PathVariable Long id) {
        return ResponseEntity.ok(imovelService.desalugar(id));
    }

}
