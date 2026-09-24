package qComposicao;

public class Pasta {
	String nome;
	double data;
	Icone icone;
	
	Pasta(String iconeLocalizacao){
		this.icone = new Icone(iconeLocalizacao);
	}
}
