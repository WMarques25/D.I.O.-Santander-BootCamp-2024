package dio.gof.dp.service.impl;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import dio.gof.dp.model.Endereco.Endereco;

/**
 * Cliente HTTP, criado via <b>OpenFeign</b>, para acessar a API <b>ViaCep</b>.
 * 
 * @see <a href="https://viacep.com.br/">ViaCep</a>
 * @see <a href="https://spring.io/projects/spring-cloud-openfeign">Spring Cloud OpenFeign</a>
 * 
 * @author WMarques25
 */
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);

}
