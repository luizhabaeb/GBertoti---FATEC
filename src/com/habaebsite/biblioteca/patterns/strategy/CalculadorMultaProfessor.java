package com.habaebsite.biblioteca.patterns.strategy;

public class CalculadorMultaProfessor implements Strategy  {
	@Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.75;
    }
}
