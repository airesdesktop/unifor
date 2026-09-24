package associacao;

public class Motor {
	double potencia;
	double consumo;
	double capacidade;
	
	Motor(double potencia){
		this.potencia = potencia;
	}
	
	void start() {
		System.out.println("INICIANDO MOTOR DE POTÊNCIA " + this.potencia + "cv...");
	}
	
	void acelerar() {
		System.out.println("ACELERANDO MOTOR DE POTÊNCIA " + this.potencia + "cv...");
	}
}
