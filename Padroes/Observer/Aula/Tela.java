package Aula;

public class Tela implements Observer{
	
	public void mostrar(String t) {
		
		System.out.println("O novo Telefone é: " + t);
	}
	
public void mostrarcpf(String t) {
		
		System.out.println("O novo cpf é: " + t);
	}
	
	
	public void update(String Telefone) {
		mostrar(Telefone);
	}
	
	public void updateCpf(String CPF) {
		mostrarcpf(CPF);
	}

}
