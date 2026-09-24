package qAssociacao;

public class Main {

	public static void main(String[] args) {
		Pessoa juliana = new Pessoa("Juliana de amaral");
		Casa apartamento = new Casa(juliana);
		
		//teste
		System.out.println(apartamento.dono.nome);
		apartamento = null;
		System.out.println(juliana.nome);
	}

}
