package dio.gof.dp.model.imovel;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImovelService {

    @Autowired
    private ImovelRepository imovelRepository;

    public Imovel salvar(Imovel imovel) {
        return imovelRepository.save(imovel);
    }

    public Imovel buscarPorId(Long id) {
        return imovelRepository.findById(id).orElseThrow(() -> new RuntimeException("Imóvel não encontrado"));
    }

    public void deletar(Long id) {
        imovelRepository.deleteById(id);
    }

    public Imovel atualizar(Long id, Imovel imovel) {
        Imovel imovelSalvo = buscarPorId(id);
        imovelSalvo.setDescricao(imovel.getDescricao());
        imovelSalvo.setTipo(imovel.getTipo());
        imovelSalvo.setValor(imovel.getValor());
        return salvar(imovelSalvo);
    }

    public List<Imovel> listar() {
        return imovelRepository.findAll();
    }

    public Imovel alugar(Long id, Inquilino inquilino) {
        Imovel imovel = buscarPorId(id);
        imovel.setInquilino(inquilino);
        return salvar(imovel);
    }

    public Imovel desalugar(Long id) {
        Imovel imovel = buscarPorId(id);
        imovel.setInquilino(null);
        return salvar(imovel);
    }
}
