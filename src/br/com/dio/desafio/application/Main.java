package br.com.dio.desafio.application;

import br.com.dio.desafio.domain.Curso;
import br.com.dio.desafio.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Java 8");
        curso.setDescricao("Aprendendo Java 8");
        curso.setCargaHoraria(8);

        System.out.println(curso);

        Curso curso2 = new Curso("JavaScript", "Aprendendo JavaScript", 10);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria("Mentoria de Java", "Mentoria Java", LocalDate.now());
        System.out.println(mentoria1);

    }
}
