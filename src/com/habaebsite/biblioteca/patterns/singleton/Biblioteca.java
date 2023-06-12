package com.habaebsite.biblioteca.patterns.singleton;
import com.habaebsite.biblioteca.patterns.strategy.Strategy;
import com.habaebsite.biblioteca.patterns.observer.Observer;
import com.habaebsite.biblioteca.patterns.observer.Subject;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private static Biblioteca instanciaUnica;
    private List<Subject> livros = new ArrayList<>();
    private List<Observer> clientes = new ArrayList<>();

    private Biblioteca() {
        // construtor privado para evitar a criação de novas instâncias
    }

    public static Biblioteca getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Biblioteca();
        }
        return instanciaUnica;
    }

    public void registrarLivro(Subject livro) {
        livros.add(livro);
    }

    public void registrarCliente(Observer cliente) {
        clientes.add(cliente);
    }

    public void emprestarLivro(Subject livro, Observer cliente) {
        // Aqui você pode adicionar a lógica para emprestar um livro a um cliente.
        // Por exemplo, você pode remover o livro da lista de livros disponíveis e adicionar o cliente à lista de observadores do livro.
        livros.remove(livro);
        livro.registrarObserver(cliente);
    }

    public double calcularMulta(Observer cliente, Strategy strategy, int diasAtraso) {
        // Aqui você pode adicionar a lógica para calcular a multa para um cliente.
        // Por exemplo, você pode usar a estratégia fornecida para calcular a multa com base no número de dias de atraso.
        return strategy.calcularMulta(diasAtraso);
    }

    // outros métodos da biblioteca
}
