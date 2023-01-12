package estruturaDeDados;

import java.util.Arrays;

public class Vetor {
		
		Aluno[] alunos = new Aluno[100];
		private int totalAlunos = 0;
		
//		//implementação, adiciona no final da lista
//		//this.alunos.lenght = todo tamanho do array
//		public void adiciona(Aluno aluno) { 
//			for(int i = 0; i < this.alunos.lenght; i++) {
//				if (this.alunos[i] == null) {
//					this.alunos[i] = aluno;
//					break;
//				}
//			}
//		}
		
		//dessa forma o tempo de processamento é constante
		public void adiciona(Aluno aluno) {
			this.alunos[this.totalAlunos] = aluno;
			this.totalAlunos++;
		}
		
		
		//implementação
		public void adiciona(int posicao, Aluno aluno) { 
			if(!this.posicaoOcupada(posicao)) {
				throw new IllegalArgumentException("Posição inválida");
			}
			for (int i = this.totalAlunos - 1; i >= posicao; i-=1) {
				this.alunos[i + 1] = this.alunos[i];
			}
			this.alunos[posicao] = aluno;
			this.totalAlunos++;
		}
		
		
		//implementação
		private boolean posicaoOcupada(int posicao) {
			
//			if(posicao >= 0 && posicao <= this.totalAlunos) {
//				return true;
//			}
			return posicao >= 0 && posicao <= this.totalAlunos;
		}
		
				
		//implementação
		public Aluno pega(int posicao) {  
//			return this.alunos[posicao];
			
			if(!this.posicaoOcupada(posicao)) {
//				System.out.println("Deu erro");
				throw new IllegalArgumentException("Posição inválida");
			}
			return this.alunos[posicao];			
		}
				
		
		//implementação
		public void remove(int posicao) { 
			if(!this.posicaoOcupada(posicao)) {
				throw new IllegalArgumentException("Posição inválida");
			}
			for (int i = posicao; i < this.totalAlunos - 1; i++) { //++ encremento
				this.alunos[i] = this.alunos[i + 1];
			}
			this.totalAlunos--; //--decremento
		}

		
		//implementação
		public boolean contem(Aluno aluno) { 
			for(int i = 0; i < this.alunos.length; i++) {
				if (aluno == this.alunos[i]) {
					System.out.println("O aluno está na lista!");
					return true;
				}
			}
			return false;
		}
		
				
		//implementação
		public int tamanho() { 
			return this.totalAlunos;
		}
		
		public String toString() {
			return Arrays.toString(alunos);
		}
		
	}
