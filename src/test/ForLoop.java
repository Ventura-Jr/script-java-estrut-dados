package test;
import java.util.Scanner;


public class ForLoop {

	public static void main(String[] args) {
		
		int idade = 0;	//FIQUE MUDANDO ESSA VARIÁVEL E TESTE
		
		String nome;
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
			
			System.out.println("Informe sua idade: ");
			idade = Integer.parseInt(teclado.nextLine());
			
			System.out.println(nome + " tem " + idade + " anos ");
		}
		
		teclado.close();
				
	}

}
