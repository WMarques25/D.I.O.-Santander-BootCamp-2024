package dio.gof.dp.model.imovel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InquilinoService {

    @Autowired
    private InquilinoRepository inquilinoRepository;

    public Inquilino salvar(Inquilino inquilino) {
        return inquilinoRepository.save(inquilino);
    }

    public List<Inquilino> listar() {
        return inquilinoRepository.findAll();
    }

    public Inquilino buscarPorId(Long id) {
        return inquilinoRepository.findById(id).orElseThrow(() -> new RuntimeException("Inquilino não encontrado"));
    }

    public void deletar(Long id) {
        inquilinoRepository.deleteById(id);
    }
}
