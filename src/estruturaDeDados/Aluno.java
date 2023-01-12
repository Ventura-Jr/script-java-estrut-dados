package estruturaDeDados;

public class Aluno {

	private String nome; // Atributo (variável)
	private int idadeAluno;
	
	public String getNome() { // getAlgumaCoisa
		return nome;
	}
	
	public void setNome(String nomeInstanciado) { // setAlgumaCoisa = Setar = Fazer
		this.nome = nomeInstanciado; //this é referencia da instancia
	}	//this.nome = mecanica
	
	public String toString() {
		return this.nome;
	}
	
	// Serve para comparar dois objetos do tipo Aluno
	public boolean equalsObject(Object object) {
		Aluno outro = (Aluno)object;
		return this.nome.equals(outro.nome);
	}

	public int getIdade() {
		return idadeAluno;
	}
	
	public void setIdade(int idade) {
		this.idadeAluno = idade;
	}

}
