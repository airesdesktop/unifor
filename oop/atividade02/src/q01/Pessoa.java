package q01;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	String getNome() {
		return nome;
	}
	
	void setNome(String newNome) {
		this.nome = newNome;
	}
	
	int getIdade() {
		return idade;
	}
	
	void setIdade(int newIdade) {
		this.idade = newIdade;
	}
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		apresentar();
	}
	
	void apresentar() {
		System.out.println("Olá! Meu nome é " + this.nome + " e tenho " + this.idade + " anos");
	}

	public static void main(String[] args) {
		
		// Instanciando
		Pessoa newPessoa = new Pessoa("Juliana", 28);

	}

}
