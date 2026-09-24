package q02;

public class Conta {
	//atributos
	String nome;
	int id;
	double saldo;
	int data;

	//metodos
	void depositar(double valor) {
		saldo += valor;
		System.out.println("NOVO VALOR: " + saldo);
	}
	
	void saque(double valor) {
		saldo -= valor;
		System.out.println("NOVO VALOR: " + saldo);
	}
	
	//main
	public static void main(String[] args) {
		double saldoInicial = 1000;
		
		//inicialização teste
		Conta contaTeste = new Conta();
		contaTeste.nome = "Julia";
		contaTeste.id = 0;
		contaTeste.data = 2009;
		
		//teste
		contaTeste.depositar(saldoInicial);
		contaTeste.saque(500);
		
	}

}
