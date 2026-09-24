package q01;

public class Livro {
	
	//atributos
	String nome;
	String autor;
	int id;
	int ano;
	int estoque;
	
	//metodos
	void pegar() {
		estoque--;
	}
	
	void add() {
		estoque++;
	}

	//main
	public static void main(String[] args) {
		int estoqueInicial = 100;
		
		//instanciando
		Livro livroTeste = new Livro();
		livroTeste.nome = "Houseki no kuni: Vol. 02";
		livroTeste.autor = "Haruko Ichiwaka";
		livroTeste.id = 0;
		livroTeste.ano = 2014;
		livroTeste.estoque = estoqueInicial;
		
		//teste
		livroTeste.pegar();
		System.out.println(livroTeste.estoque);
		livroTeste.add();
		System.out.println(livroTeste.estoque);
		livroTeste.add();
		System.out.println(livroTeste.estoque);
		livroTeste.pegar();
		System.out.println(livroTeste.estoque);
	}

}
