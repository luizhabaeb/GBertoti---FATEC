package testando;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Usuario usu = new Usuario();
		usu.setBusca(new BuscaPorID());
		usu.getBusca();
		
		System.out.println("--------------");
		
		usu.setArruma(new ArrumaComputador());
		usu.getArrua();
		System.out.println("--------------");
		
	}

}
