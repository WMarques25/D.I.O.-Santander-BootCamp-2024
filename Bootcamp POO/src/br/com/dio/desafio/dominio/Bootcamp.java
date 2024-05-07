package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * <b>Classe {@code Bootcamp} </b>
 * <p>
 * Classe que representa um Bootcamp
 * 
 * @param nome {@link String}
 * @param descricao {@link String}
 * @param inicio {@link LocalDate}
 * @param fim {@link LocalDate}
 * 
 * @author Wellington Marques
 */
public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate inicio = LocalDate.now();
    private final LocalDate fim = LocalDate.now().plusDays(45);

    /**
     * Construtor {@link Bootcamp}
     * @param nome {@link String}
     * @param descricao {@link String}
     */
    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    /**
     * Adiciona um conteudo ao bootcamp
     * @param conteudo {@link Conteudo}
     * 
     * @see Conteudo
     * @see Curso
     * @see Mentoria
     */
    public void addConteudo(Conteudo conteudo) {
        conteudos.add(conteudo);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getInicio() {
        return inicio;
    }
    public LocalDate getFim() {
        return fim;
    }
    
    /**
     * Retorna os devs inscritos no bootcamp
     * @return {@link Set}<{@link Dev}>
     */
    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    /**
     * Define os devs inscritos no bootcamp
     * @param devsInscritos {@link Set}<{@link Dev}>
     */
    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((inicio == null) ? 0 : inicio.hashCode());
        result = prime * result + ((fim == null) ? 0 : fim.hashCode());
        result = prime * result + ((devsInscritos == null) ? 0 : devsInscritos.hashCode());
        result = prime * result + ((conteudos == null) ? 0 : conteudos.hashCode());
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
        Bootcamp other = (Bootcamp) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (inicio == null) {
            if (other.inicio != null)
                return false;
        } else if (!inicio.equals(other.inicio))
            return false;
        if (fim == null) {
            if (other.fim != null)
                return false;
        } else if (!fim.equals(other.fim))
            return false;
        if (devsInscritos == null) {
            if (other.devsInscritos != null)
                return false;
        } else if (!devsInscritos.equals(other.devsInscritos))
            return false;
        if (conteudos == null) {
            if (other.conteudos != null)
                return false;
        } else if (!conteudos.equals(other.conteudos))
            return false;
        return true;
    }

    
    
}
