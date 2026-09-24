package associacao;

public class Main {

	public static void main(String[] args) {
		Motor motorAssociado = new Motor(200);
		Carro carroAssociacao = new Carro(motorAssociado);
	}

}
