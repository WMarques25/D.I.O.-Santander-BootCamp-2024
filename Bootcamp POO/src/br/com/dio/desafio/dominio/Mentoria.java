package br.com.dio.desafio.dominio;

import java.time.LocalDate;

/**
 * Classe {@code Mentoria}
 * @param titulo {@link String}
 * @param descricao {@link String}
 * @param data {@link LocalDate}
 * 
 * @author Wellington Marques
 */
public class Mentoria extends Conteudo{

    private LocalDate data;

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
        return "\n*--* Mentoria *--*\nTitulo: " + getTitulo() + ",\nDescricao: " + getDescricao() + ",\nData: " + data;
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }

}
