package br.com.dio.desafio.exceptions;

public class ConteudoNaoEncontradoException extends Exception {
    public ConteudoNaoEncontradoException() {
        super("Impossível progredir. Conteúdo finalizado.");
    }
}
