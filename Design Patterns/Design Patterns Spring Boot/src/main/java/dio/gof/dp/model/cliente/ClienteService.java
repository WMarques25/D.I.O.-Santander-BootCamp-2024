package dio.gof.dp.model.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id).orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }

    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }

    public Cliente atualizar(Long id, Cliente cliente) {
        Cliente clienteSalvo = buscarPorId(id);
        clienteSalvo.setNome(cliente.getNome());
        return salvar(clienteSalvo);
    }

    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }
}
