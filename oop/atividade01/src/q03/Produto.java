package q03;

public class Produto {
	
	String nome;
	String description;
	double desconto;
	double valor;
	String categoria;
	int estoque;
	//boolean emDesconto;
	//boolean emEstoque;
	
	void descrever() {
		
		System.out.println(nome);
		System.out.println(description);
		
		if(categoria!=null) {
			System.out.println(categoria);
		};
		
		if (estoque > 0) {
			
			if (desconto > 0) {
				System.out.println("Em desconto!");
				System.out.println("Desconto de " + desconto + "%");
				System.out.println("Preço: " + (valor - (valor*(desconto/100))));
			} else {
				System.out.println("Preço: " + valor);
			};
			
			System.out.println("(Quantidade no estoque: " + estoque + ")");	
		} else {
			System.out.println("Item indisponível. (eu sei que disse que tenho um na descrição, mas isso foi antes de terem comprado... estranho... acho que era você...)");
		};
		
	}
	
	void comprar() {
		System.out.println("Comprando...");
		if (estoque > 0) {
			System.out.println("Item comprado.");
			estoque--;
		} else {
			System.err.println("Estoque vazio!");
		};
	}
	
	public static void main(String[] args) {
		//inicializar
		Produto produtoTeste = new Produto();
		produtoTeste.nome = "Perfume";
		produtoTeste.description = "Um perfume... acho que perfuma ou algo do tipo. Super raro, só tenho um.";
		produtoTeste.valor = 50.0;
		produtoTeste.desconto = 25.0;
		produtoTeste.estoque = 1;
		
		produtoTeste.descrever();
		produtoTeste.comprar();
		produtoTeste.descrever();
		
	}

}
