package Aula;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CRUD crud = new CRUD();
		Tela tela = new Tela();
		
		crud.registerObserver(tela);
		
		Cliente cliente = new Cliente("Guilherme", "11111", "1");
		Cliente c1 = new Cliente("g1", "2", "2");
		//cliente.Telefone = "2222";
		cliente.cpf = "0000000000";
		crud.trocar(c1, "99");
		crud.trocar(cliente,"1");
		
		crud.trocarCPF(c1, "2");
		crud.trocarCPF(cliente, "11111");
		
		crud.removeObserver(tela);
	}

}
