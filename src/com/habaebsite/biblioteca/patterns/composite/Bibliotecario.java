package com.habaebsite.biblioteca.patterns.composite;

public class Bibliotecario implements Component {
	  private String nome;

	    @Override
	    public void adicionarFuncionario(Component funcionario) {
	        // Este método não é aplicável para o bibliotecário
	    }

	    @Override
	    public void removerFuncionario(Component funcionario) {
	        // Este método não é aplicável para o bibliotecário
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
