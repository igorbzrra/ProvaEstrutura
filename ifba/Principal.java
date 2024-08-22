package ifba;

public class Principal {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Igor", "1111111", 19, "Informática");
		Aluno aluno2 = new Aluno("Pedro", "222222", 16, "Biocombustível");
		Aluno aluno3 = new Aluno("Marcelo", "333333", 18, "Eletromecânica");

		System.out.println("====== Array ======");
		ColecaoAlunoArray colecaoArray = new ColecaoAlunoArray(10);
		colecaoArray.cadastrarAluno(aluno1);
		colecaoArray.cadastrarAluno(aluno2);
		System.out.println("Lista de alunos depois do cadastro:");
		colecaoArray.listarAlunos();

		colecaoArray.cadastrarAlunoPorPosicao(aluno3, 1);
		System.out.println("\nLista de alunos depois do cadastro por posição:");
		colecaoArray.listarAlunos();

		colecaoArray.excluirAlunoPorPosicao(1);
		System.out.println("\nLista de alunos depois da exclusão:");
		colecaoArray.listarAlunos();

		Aluno alunoEncontradoArray = colecaoArray.procurarAlunoPorPosicao(0);
		if (alunoEncontradoArray != null) {
			System.out.println("\nAluno encontrado na posição 0: " + alunoEncontradoArray);
		}

		System.out.println("\n====== ArrayList ======");
		ColecaoAluno colecaoList = new ColecaoAluno();
		colecaoList.cadastrarAluno(aluno1);
		colecaoList.cadastrarAluno(aluno2);
		System.out.println("Lista de alunos depois do cadastro:");
		colecaoList.listarAlunos();

		colecaoList.cadastrarAlunoPorPosicao(aluno3, 1);
		System.out.println("\nLista de alunos depois do cadastro por posição:");
		colecaoList.listarAlunos();

		colecaoList.excluirAlunoPorPosicao(0);
		System.out.println("\nLista de alunos depois da exclusão:");
		colecaoList.listarAlunos();

		Aluno alunoEncontradoList = colecaoList.procurarAlunoPorPosicao(1);
		if (alunoEncontradoList != null) {
			System.out.println("\nAluno encontrado na posição 1: " + alunoEncontradoList);
		}
	}
}