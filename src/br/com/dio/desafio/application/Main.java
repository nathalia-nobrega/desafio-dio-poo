package br.com.dio.desafio.application;

import br.com.dio.desafio.domain.*;
import br.com.dio.desafio.exceptions.ConteudoNaoEncontradoException;

import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // conteúdos
        Conteudo cursoJava = new Curso("Aprendendo Java", "Curso de Java Básico", 20);
        Conteudo mentoriaJava = new Mentoria("Mentoria de Java Avançado", "Mentoria de Java", LocalDate.now());

        // bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Banco Pan Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().addAll(Set.of(cursoJava, mentoriaJava));

        // devs
        Dev nathalia = new Dev("Nathalia");
        nathalia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos da Dev " + nathalia.getNome() + ": " + nathalia.getConteudosInscritos());
        try {
            nathalia.progredir();
            nathalia.progredir();
        } catch (ConteudoNaoEncontradoException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Conteúdos concluídos da Dev " + nathalia.getNome() + ": " + nathalia.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos da Dev " + nathalia.getNome() + ": " + nathalia.getConteudosInscritos());
        System.out.println("XP: "+nathalia.calcularTotalXp());

        System.out.println();

        Dev camila = new Dev("Camila");
        camila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos da Dev " + camila.getNome() + ": " + camila.getConteudosInscritos());
        try {
            camila.progredir();
        } catch (ConteudoNaoEncontradoException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Conteúdos concluídos da Dev " + camila.getNome() + ": " + nathalia.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos da Dev " + camila.getNome() + ": " + camila.getConteudosInscritos());
        System.out.println("XP: "+camila.calcularTotalXp());


    }
}
