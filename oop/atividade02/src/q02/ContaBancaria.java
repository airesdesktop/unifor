package q02;

public class ContaBancaria {
	
	private String titular;
	private double saldo;
	private int numero;
	
	ContaBancaria(String novoTitular, double novoSaldo, int novoNumero) {
		this.titular = novoTitular;
		this.saldo = novoSaldo;
		this.numero = novoNumero;
	}
	
	String getTitular() {
		return this.titular;
	}
	
	double getSaldo() {
		return this.saldo;
	}
	
	int getNumero() {
		return this.numero;
	}
	
	double sacar(double valor) {
		this.saldo = this.saldo - valor;
		return valor;
	}
	
	void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	void exibirSaldo() {
		System.out.println(this.saldo);
	}
	
	public static void main(String[] args) {
	}

}
