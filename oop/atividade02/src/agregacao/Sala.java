package agregacao;

public class Sala {
	int cod;
	Aluno[] alunos;
	int capacidade;
	int tamanho;
	
	Sala(int novaCapacidade) {
		this.capacidade = novaCapacidade;
		this.tamanho = 0;
		this.alunos = new Aluno[capacidade];
	}
	
	void criarAluno(String nome) {
		if (tamanho == capacidade) {
			System.err.println("CAPACIDADE DO ARRAY alunos[] EXCEDIDA!");
		} else {
			Aluno novoAluno = new Aluno(nome);
			alunos[tamanho] = novoAluno;
			tamanho++;
			
			// Print
			System.out.println("Aluno criado!");
		}
		
	}
	
	void removerAluno() {
		if (this.tamanho == 0) {
			System.err.println("ARRAY alunos[] VAZIA!");
		} else {
			tamanho--;
		}
	}
	
	void limpar() {
		tamanho = 0;
	}
}
