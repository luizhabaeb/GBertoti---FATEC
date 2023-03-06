package testando;

public class Usuario {
	
	public String nome = "Guilherme";
	private Busca busca;
	private Arruma arruma;
	
	public String setLonge() {
		return this.nome;
	}
	
	public void setBusca(Busca busca){//argumento polimorfico
		this.busca = busca;
	}
	
	public void getBusca() {
		this.busca.buscar();
	}
	
	public void setArruma(Arruma arruma) {
		this.arruma = arruma;
	}
	
	public void getArrua() {
		this.arruma.arrumar();
	}
	
}
