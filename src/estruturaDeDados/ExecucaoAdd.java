package estruturaDeDados;

public class ExecucaoAdd {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno(); //instanciei e criei o objeto aluno1
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		
		aluno1.setNome("Ventura");
		aluno2.setNome("Luciana");
		aluno3.setNome("Douglas");
		
		Vetor lista = new Vetor();
		
		//adiciona alunos novos
		lista.adiciona(aluno1);
		lista.adiciona(aluno2);
		lista.adiciona(aluno3);
		
		
		
		
		//pegar um aluno em dada posição
		Aluno alunoEmPosicao = lista.pega(0);
		System.out.println(alunoEmPosicao);
		
		lista.remove(3);
		System.out.println(lista.contem(aluno2));
		System.out.println(lista.contem(aluno1));
		
		System.out.println(lista);
		
		System.out.println(lista.tamanho());
				
	}

}
