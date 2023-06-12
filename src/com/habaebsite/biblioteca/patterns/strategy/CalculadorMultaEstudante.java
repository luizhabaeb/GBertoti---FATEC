package com.habaebsite.biblioteca.patterns.strategy;

public class CalculadorMultaEstudante implements Strategy {
	@Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.5;
    }
}
