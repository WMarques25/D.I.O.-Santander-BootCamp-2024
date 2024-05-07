package br.com.dio.desafio.dominio;

import java.time.LocalDate;

/**
 * <b>Classe {@code Mentoria}</b>
 * <p>
 * Classe que representa uma mentoria
 * @param titulo {@link String}
 * @param descricao {@link String}
 * @param data {@link LocalDate}
 * 
 * @author Wellington Marques
 * 
 * @see Conteudo
 */
public class Mentoria extends Conteudo{

    private LocalDate data;

    /**
     * <b>Construtor {@link Mentoria}</b>
     * @param titulo {@link String}
     * @param descricao {@link String}
     * @param data {@link LocalDate}
     */
    public Mentoria(String titulo, String descricao, LocalDate data) {
        super.setTitulo(titulo);
        super.setDescricao(descricao);
        this.data = data;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\n\n*--* Mentoria *--*\nTitulo: " + getTitulo() + ",\nDescricao: " + getDescricao() + ",\nData: " + data;
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }

}
