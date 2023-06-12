package com.habaebsite.bibliotecaL;
import com.habaebsite.biblioteca.patterns.observer.Observer;
import com.habaebsite.biblioteca.patterns.observer.Subject;
import java.util.List;
import java.util.ArrayList;



public class Livro implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String disponibilidade;

    // métodos

    @Override
    public void registrarObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservers() {
        for (Observer observer : observers) {
            observer.atualizar(disponibilidade);
        }
    }    
    
    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
        notificarObservers();
    }
    
    public String getDisponibilidade() {
        return this.disponibilidade;
    }

}

