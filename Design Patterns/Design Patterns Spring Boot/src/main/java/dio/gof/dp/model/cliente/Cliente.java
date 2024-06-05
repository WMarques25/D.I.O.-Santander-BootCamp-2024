package dio.gof.dp.model.cliente;

import java.util.List;

import dio.gof.dp.model.Endereco.Endereco;
import dio.gof.dp.model.imovel.Imovel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    
    @ManyToOne
    private Endereco endereco;

    @OneToMany(mappedBy = "proprietario")
    private List<Imovel> imoveis;

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(List<Imovel> imoveis) {
        this.imoveis = imoveis;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
}
