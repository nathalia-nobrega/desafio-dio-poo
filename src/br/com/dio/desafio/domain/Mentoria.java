package br.com.dio.desafio.domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate dataInicio;

    public Mentoria(String titulo, String descricao, LocalDate dataInicio) {
        super(titulo, descricao);
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", dataInicio=" + dataInicio +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * 20d;
    }
}

