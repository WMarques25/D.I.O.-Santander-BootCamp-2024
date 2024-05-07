package br.com.dio.desafio.dominio;

/**
 * Classe {@code Curso}
 * @param titulo {@link String}
 * @param descricao {@link String}
 * @param cargaHoraria {@code int}
 * 
 * @author Wellington Marques
 * 
 */

public class Curso {

    private String titulo;
    private String descricao;
    private int cargaHoraria;

    /**
     * Construtor {@link Curso}
     * @param titulo
     * @param descricao
     * @param cargaHoraria
     */
    public Curso(String titulo, String descricao, int cargaHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }
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
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\n*--* Curso *--*\nTitulo: " + titulo + ",\nDescricao: " + descricao + ",\nCargaHoraria: " + cargaHoraria;
    }

}
