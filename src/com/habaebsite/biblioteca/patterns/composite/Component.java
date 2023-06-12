package com.habaebsite.biblioteca.patterns.composite;

public interface Component {
    void adicionarFuncionario(Component funcionario);
    void removerFuncionario(Component funcionario);
    String getNome();
    void setNome(String nome);
}

