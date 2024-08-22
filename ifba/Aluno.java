package ifba;

public class Aluno {
	private String nome;
	private String rg;
	private int idade;
	private String curso;

	public Aluno(String nome, String rg, int idade, String curso) {
		this.nome = nome;
		this.rg = rg;
		this.idade = idade;
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	public String getRg() {
		return rg;
	}

	public int getIdade() {
		return idade;
	}

	public String getCurso() {
		return curso;
	}

	@Override
	public String toString() {
		return "Aluno {" + "Nome:'" + nome + '\'' + ", RG:'" + rg + '\'' + ", Idade:" + idade + ", Curso:'" + curso
				+ '\'' + '}';
	}
}