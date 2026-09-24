package q04;

public class Vehicle {
	
 	String modelo;
	String marca;
	int year;
	String placa;
	int km;
	String status;
	int counter;
	boolean registrado;
	
	int aviso = 5000;
	int limite = 10000;
	
	Vehicle(String placa) {
		
		//atributo = parâmetro
		this.placa = placa;
	}
	
	//alterar status
	void mudarStatus (String novoStatus) {
		
		//limite de km
		if (novoStatus == "Usar") {
			
			//caso esteja no limite
			if (counter > limite) {
				System.out.println("O VEÍCULO SOLICITADO NECESSITA DE MANUTENÇÃO!");
				System.out.println("Estado do veículo não alterado.");
			}
			
			//caso nao
			else {
				
				//aviso
				if (counter > aviso) {
					System.out.println("Aviso: o veículo solicitado precisa de uma manutenção preventiva! (ignorando...)");
				}
				
				System.out.println("Veículo '" + placa + "' agora está em uso.");
				status = "em uso";
			}
		
		//devolver
		} else if (novoStatus == "Liberar") {
			if (status == "disponível") {
				System.err.println("O veículo '" + placa + "' ja está disponível!");
			}
			
			else {
				System.out.println("O veículo estava no estado '" + status + "', alterando para 'disponível'...");
				System.out.println("Veículo '" + placa + "' agora está lívre. Lembre-se de fazer o registro!");
				status = "disponível";
			}
			
		//manutenção
		} else if (novoStatus == "Manutenção") {
			System.out.println("Veículo '" + placa + "' agora está em manutenção.");
			status = "em manutenção";
			counter=0;
			
		//else final
		} else {
			System.err.println("Parâmetro inválido!");
		}
	}
	
	void listar () {
		//System.out.println(">>>modelo " + modelo);
		//System.out.println(">>>marca " + marca);
		//System.out.println(">>>year " + year);
		System.out.println(">>>placa " + placa);
		System.out.println(">>>km " + km);
		System.out.println(">>>status " + status);
		System.out.println(">>>counter " + counter);
		System.out.println(">>>registrado " + registrado);
		//System.out.println(">>>aviso " + aviso);
		//System.out.println(">>>limite " + limite);
	}
	
	void registro (int kmRodados) {
		
		
		km += kmRodados;
		counter += kmRodados;
		registrado = true;
		
		if (counter > aviso) {
			System.out.println("Aviso! O veículo '" + placa + "' nescessita de manutenção!");
		}
		
		System.out.println("O veículo '" + placa + "' foi registrado com as informações de uso dadas.");
		
	}

	public static void main(String[] args) {
		//instanciando objeto
		Vehicle onibus01 = new Vehicle("FOR-9043");
		
		onibus01.mudarStatus("Usar");
		onibus01.listar();
		onibus01.mudarStatus("Liberar");
		onibus01.listar();
		onibus01.registro(2500);
		onibus01.listar();
		onibus01.mudarStatus("Usar");
		onibus01.listar();
		onibus01.mudarStatus("Liberar");
		onibus01.listar();
		onibus01.registro(2500);
		onibus01.listar();
		onibus01.mudarStatus("Usar");
		onibus01.listar();
		onibus01.mudarStatus("Liberar");
		onibus01.listar();
		onibus01.registro(2500);
		onibus01.listar();
		onibus01.mudarStatus("Manutenção");
		onibus01.listar();
		onibus01.mudarStatus("Liberar");
		onibus01.listar();
	}

}
