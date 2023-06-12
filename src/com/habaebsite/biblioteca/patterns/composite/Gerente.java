package com.habaebsite.biblioteca.patterns.composite;
import com.habaebsite.biblioteca.patterns.composite.Component;
import java.util.ArrayList;
import java.util.List;

public class Gerente implements Component {
    private String nome;
    private List<Component> subordinados = new ArrayList<>();

    @Override
    public void adicionarFuncionario(Component funcionario) {
        subordinados.add(funcionario);
    }

    @Override
    public void removerFuncionario(Component funcionario) {
        subordinados.remove(funcionario);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
}
