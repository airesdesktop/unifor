package encapsulamento;

public class Carro {
	private String modelo;
	private String placa;
	private int ano;
	private String cor;
	private double km;
	
	//modelo
	String getModelo() {
		return this.modelo;
	}
	void setModelo(String novoModelo) {
		this.modelo = novoModelo;
		System.out.println("Atributo 'modelo' alterado com sucesso!");
	}
	
	//placa
	String getPlaca() {
		return this.placa;
	}
	void setPlaca(String novaPlaca) {
		this.placa = novaPlaca;
		System.out.println("Atributo 'placa' alterado com sucesso!");
	}
	
	//ano
	int getAno() {
		return this.ano;
	}
	void setAno(int novoAno) {
		this.ano = novoAno;
		System.out.println("Atributo 'ano' alterado com sucesso!");
	}
	
	//cor
	String getCor() {
		return this.cor;
	}
	void setCor(String novaCor) {
		this.cor = novaCor;
		System.out.println("Atributo 'cor' alterado com sucesso!");
	}
	
	//km
	double getKm() {
		return this.km;
	}
	void setKm(double novoKm) {
		this.km = novoKm;
		System.out.println("Atributo 'km' alterado com sucesso!");
	}	

	public static void main(String[] args) {
		
		//instanciando, teste
		Carro carroTeste = new Carro();
		
		//set
		carroTeste.setAno(2020);
		carroTeste.setPlaca("JEA-8379");
		carroTeste.setModelo("Onix");
		carroTeste.setKm(0);
		carroTeste.setCor("Preto");
		
		//get
		System.out.println(carroTeste.getAno());
		System.out.println(carroTeste.getPlaca());
		System.out.println(carroTeste.getModelo());
		System.out.println(carroTeste.getKm());
		System.out.println(carroTeste.getCor());
		
	}

}
