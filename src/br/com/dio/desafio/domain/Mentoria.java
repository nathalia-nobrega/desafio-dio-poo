package br.com.dio.desafio.domain;

import java.time.LocalDate;

public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate dataInicio;

    public Mentoria() {
    }

    public Mentoria(String titulo, String descricao, LocalDate dataInicio) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
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

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataInicio=" + dataInicio +
                '}';
    }
}

