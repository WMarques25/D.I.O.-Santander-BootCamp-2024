package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

/**
 * <b>Classe {@code Dev}</b>
 * <p>
 * Classe que representa um desenvolvedor
 * 
 * @param nome {@link String}
 * @param conteudosInscritos {@link Set}<{@link Conteudo}>
 * @param conteudosConcluidos {@link Set}<{@link Conteudo}>
 * 
 * @see Bootcamp
 * @see Conteudo
 * 
 * @author Wellington Marques
 */
public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new HashSet<>();

    /**
     * <b>Construtor {@link Dev}</b>
     * 
     * @param nome {@link String}
     */
    public Dev(String nome) {
        this.nome = nome;
    }

    /**
     * <b>Inscreve o desenvolvedor em um bootcamp</b>
     * <p>
     * Adiciona os conteúdos do bootcamp na lista de conteúdos inscritos do
     * desenvolvedor e adiciona o desenvolvedor na lista de desenvolvedores
     * @param bootcamp {@link Bootcamp}
     * 
     * @see Bootcamp
     */
    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    /**
     * <b>Progredir no conteúdo</b>
     * <p>
     * Move o primeiro conteúdo da lista de conteúdos inscritos para a lista de
     * conteúdos concluídos
     * 
     * @see Conteudo
     * 
     */
    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.out.println("Você não está inscrito em nenhum conteúdo no momento.");
        }
    }

    /**
     * <b>Calcular o total de XP</b>
     * <p>
     * Calcula o total de XP dos conteúdos concluídos
     * 
     * @return {@code double}
     */
    public double calcularTotalXp() {
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((conteudosInscritos == null) ? 0 : conteudosInscritos.hashCode());
        result = prime * result + ((conteudosConcluidos == null) ? 0 : conteudosConcluidos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (conteudosInscritos == null) {
            if (other.conteudosInscritos != null)
                return false;
        } else if (!conteudosInscritos.equals(other.conteudosInscritos))
            return false;
        if (conteudosConcluidos == null) {
            if (other.conteudosConcluidos != null)
                return false;
        } else if (!conteudosConcluidos.equals(other.conteudosConcluidos))
            return false;
        return true;
    }
    
    
}
