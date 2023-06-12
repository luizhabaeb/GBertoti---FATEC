package com.habaebsite.bibliotecaL;
import com.habaebsite.biblioteca.patterns.strategy.*;
import com.habaebsite.biblioteca.patterns.observer.*;
import com.habaebsite.biblioteca.patterns.composite.*;
import com.habaebsite.biblioteca.patterns.singleton.*;
import com.habaebsite.biblioteca.patterns.facade.*;

public class Main {

    public static void main(String[] args) {
        // Cria um livro
        Livro livro = new Livro();
        livro.setDisponibilidade("Disponível");

        // Cria um cliente
        Cliente cliente = new Cliente();
        cliente.setNome("João Silva");

        // Exibe o nome do cliente e a disponibilidade do livro
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Disponibilidade do livro: " + livro.getDisponibilidade());

        // Registra o cliente como um observador do livro
        livro.registrarObserver(cliente);

        // Cria um calculador de multa
        Strategy strategy = new CalculadorMultaEstudante();

        // Cria funcionários
        Component bibliotecario = new Bibliotecario();
        bibliotecario.setNome("Maria Santos");

        Component gerente = new Gerente();
        gerente.adicionarFuncionario(bibliotecario);

        // Cria uma fachada de gerenciamento de biblioteca
        BibliotecaFacade facade = new BibliotecaFacade();

        // Registra o livro e o cliente na biblioteca
        facade.registrarLivro(livro);
        facade.registrarCliente(cliente);

        // Empresta um livro ao cliente
        facade.emprestarLivro(livro, cliente);

        // Calcula a multa para o cliente
        double multa = facade.calcularMulta(cliente, strategy, 5);
        System.out.println("A multa para o cliente é: " + multa);
    }

}
