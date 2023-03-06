package Aula;

import java.util.ArrayList;

public class CRUD implements Subject{	
	
	private ArrayList observers;
	private Cliente c;
	
	public CRUD() {
		observers = new ArrayList();		
	}
	
	public void registerObserver(Observer o){
		observers.add(o);
	}

	public void removeObserver(Observer o){
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers(String novoTelefone){
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(novoTelefone);
		}		
	}
	
	public void notifyObserversCPF(String novoCPF){
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.updateCpf(novoCPF);
		}		
	}

	public void trocar(Cliente c, String Telefone) {
		if(c.Telefone == Telefone) {
			notifyObservers("Não trocado");
			
			
		}else {
			notifyObservers(Telefone);
			
		}		
	}
	
	public void trocarCPF(Cliente c, String CPF) {
		if(c.cpf == CPF) {
			notifyObserversCPF("Não trocado CPF");
			
			
		}else {
			notifyObserversCPF(CPF);
			
		}	
	}


}
