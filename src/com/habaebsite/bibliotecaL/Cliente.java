package com.habaebsite.bibliotecaL;
import com.habaebsite.biblioteca.patterns.observer.Observer;
import com.habaebsite.biblioteca.patterns.observer.Subject;
import com.habaebsite.biblioteca.patterns.strategy.Strategy;


public class Cliente implements Observer {
    private String nome;
    private Strategy strategy;

    // métodos

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double calcularMulta(int diasAtraso) {
        return strategy.calcularMulta(diasAtraso);
    }

    @Override
    public void atualizar(String disponibilidade) {
        System.out.println("Olá " + nome + ", o livro que você quer agora está " + disponibilidade);
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }


}

