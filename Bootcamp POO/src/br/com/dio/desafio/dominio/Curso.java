package br.com.dio.desafio.dominio;

/**
 * Classe {@code Curso} <p>
 * 
 * Classe que representa um curso
 * @param titulo {@link String}
 * @param descricao {@link String}
 * @param cargaHoraria {@code int}
 * 
 * @author Wellington Marques
 * 
 */

public class Curso extends Conteudo{
    private int cargaHoraria;

    /**
     * Construtor {@link Curso}
     * @param titulo
     * @param descricao
     * @param cargaHoraria
     */
    public Curso(String titulo, String descricao, int cargaHoraria) {
        super.setTitulo(titulo);
        super.setDescricao(descricao);
        this.cargaHoraria = cargaHoraria;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\n*--* Curso *--*\nTitulo: " + getTitulo() + ",\nDescricao: " + getDescricao() + ",\nCargaHoraria: " + cargaHoraria;
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

}
