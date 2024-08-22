package ifba;

import java.util.ArrayList;

public class ColecaoAluno {

	private ArrayList<Aluno> alunos;

	public ColecaoAluno() {
		this.alunos = new ArrayList<>();
	}

	public void cadastrarAluno(Aluno aluno) {
		alunos.add(aluno);
	}

	public void cadastrarAlunoPorPosicao(Aluno aluno, int posicao) {
		if (posicao >= 0 && posicao < alunos.size()) {
			alunos.add(posicao, aluno);
		} else {
			System.out.println("Posição inválida!!!");
		}
	}

	public void excluirAlunoPorPosicao(int posicao) {
		if (posicao >= 0 && posicao < alunos.size()) {
			alunos.remove(posicao);
			System.out.println("Aluno excluído na posição " + posicao);
		} else {
			System.out.println("Posição inválida!!!");
		}
	}

	public void listarAlunos() {
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
	}

	public Aluno procurarAlunoPorPosicao(int posicao) {
		if (posicao >= 0 && posicao < alunos.size()) {
			return alunos.get(posicao);
		} else {
			System.out.println("Posição inválida!!!");
			return null;
		}
	}
}