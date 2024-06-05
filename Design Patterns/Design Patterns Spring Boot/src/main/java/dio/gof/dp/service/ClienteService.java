package dio.gof.dp.service;

import dio.gof.dp.model.cliente.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de clientes.
 * 
 * 
 */
public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);
    
    void atualizar(Long id, Cliente cliente);
    
    void deletar(Long id);
}