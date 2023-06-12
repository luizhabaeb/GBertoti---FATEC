package com.habaebsite.biblioteca.patterns.facade;
import com.habaebsite.biblioteca.patterns.strategy.Strategy;
import com.habaebsite.biblioteca.patterns.observer.Observer;
import com.habaebsite.biblioteca.patterns.observer.Subject;
import com.habaebsite.biblioteca.patterns.composite.Component;
import com.habaebsite.biblioteca.patterns.singleton.Biblioteca;

public class BibliotecaFacade {
    private Biblioteca biblioteca = Biblioteca.getInstancia();

    public void registrarLivro(Subject livro) {
        biblioteca.registrarLivro(livro);
    }

    public void registrarCliente(Observer cliente) {
        biblioteca.registrarCliente(cliente);
    }

    public void emprestarLivro(Subject livro, Observer cliente) {
        biblioteca.emprestarLivro(livro, cliente);
    }

    public double calcularMulta(Observer cliente, Strategy strategy, int diasAtraso) {
        return biblioteca.calcularMulta(cliente, strategy, diasAtraso);
    }
}
