package composicao;

public class Carro {
	String cor;
	String modelo;
	Motor motor;
	
	Carro(double potencia) {
		this.motor = new Motor(potencia);
	}
}
