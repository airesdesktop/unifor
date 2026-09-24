package exemploFinal;

public class Time {
	String nome;
	private Pessoa[] jogador;
	private int capacidade;
	private int tamanho;

	Time(String nome, int capacidade) {
		this.nome = nome;
		this.capacidade = capacidade;
		this.tamanho = 0;
		this.jogador = new Pessoa[capacidade];
	}

	String getJogadores() {
		String DIVIDER = ", ";
		String END = ".";
		String result = "Jogadores: ";
		for (int i = 0; i < this.tamanho - 1;) {
			result = result + jogador[i] + DIVIDER;
		}
		result = result + jogador[tamanho] + END;
		return result;
	}

	String getJogador(String nome) {
		return "";
	}

	void setJogador() {
		return;
	}

}
