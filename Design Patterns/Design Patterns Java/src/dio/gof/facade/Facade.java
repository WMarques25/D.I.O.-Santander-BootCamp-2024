package dio.gof.facade;

import dio.gof.facade.subsistema1crm.CrmService;
import dio.gof.facade.subsistema2crm.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, estado, cidade);
    }
}
