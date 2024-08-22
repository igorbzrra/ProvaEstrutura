package ifba;

public class ColecaoAlunoArray {

	private Aluno[] alunos;
	private int count;

	public ColecaoAlunoArray(int capacidade) {
		this.alunos = new Aluno[capacidade];
		this.count = 0;
	}

	public void cadastrarAluno(Aluno aluno) {
		if (count < alunos.length) {
			alunos[count] = aluno;
			count++;
		} else {
			System.out.println("Não é possível adicionar mais alunos");
		}
	}

	public void cadastrarAlunoPorPosicao(Aluno aluno, int posicao) {
		if (posicao >= 0 && posicao < alunos.length) {
			alunos[posicao] = aluno;
		} else {
			System.out.println("Posição inválida!!!");
		}
	}

	public void excluirAlunoPorPosicao(int posicao) {
		if (posicao >= 0 && posicao < alunos.length) {
			alunos[posicao] = null;
			System.out.println("Aluno excluído na posição " + posicao);
		} else {
			System.out.println("Posição inválida!!!");
		}
	}

	public void listarAlunos() {
		for (int i = 0; i < count; i++) {
			if (alunos[i] != null) {
				System.out.println(alunos[i]);
			}
		}
	}

	public Aluno procurarAlunoPorPosicao(int posicao) {
		if (posicao >= 0 && posicao < alunos.length) {
			return alunos[posicao];
		} else {
			System.out.println("Posição inválida!!!");
			return null;
		}
	}
}