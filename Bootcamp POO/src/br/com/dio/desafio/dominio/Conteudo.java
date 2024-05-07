package br.com.dio.desafio.dominio;

/**
 * Classe {@code Conteudo}
 * 
 * Classe abstrata que representa um conteúdo genérico
 * 
 * @param titulo {@link String}
 * @param descricao {@link String}
 * 
 * @see Curso
 * @see Mentoria
 * 
 * @author Wellington Marques
 */
public abstract class Conteudo {

    protected static final double XP_PADRAO = 10.0;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
