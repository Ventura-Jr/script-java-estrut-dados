package estruturaDeDados;

public class ExecAddPosicao {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno(); //instanciei e criei o objeto aluno1
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		
		aluno1.setNome("Ventura");
		aluno2.setNome("Luciana");
		aluno3.setNome("Douglas");
		
		Vetor lista = new Vetor();
		
		//adiciona alunos novos em determinada posição
		lista.adiciona(0, aluno3);
		lista.adiciona(1, aluno2);
		lista.adiciona(2, aluno1);
				
		System.out.println(lista);
	}

}