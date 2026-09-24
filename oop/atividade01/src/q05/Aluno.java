package q05;

public class Aluno {
	int matricula;
	String nome;
	String email;
	int telefone;
	int counter;	
	
	Aluno (int matricula, int counter) {
		
		//atributo     = parâmetro
		this.matricula = matricula;
		this.counter = counter;
	}
	
	Materia[] materias = new Materia[counter];
	
	
	public static void main(String[] args) {
		
		//instanciando objeto
		Aluno Juliana = new Aluno(2617933, 5);
	}

}
