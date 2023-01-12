package test;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		int idade = 0;
		
		String nome;
		
		Scanner teclado = new Scanner(System.in);
		
		while (idade >= 0) { //ATENÇÃO, OS OPERADORES PRECISAM SER EXPLÍCITOS
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
			
			System.out.println("Informe sua idade: ");
//			idade = teclado.nextInt(); //ISSO VAI GERAR UM BUG
			
			// ISSO SOLUCIONA O BUG
			idade = Integer.parseInt(teclado.nextLine());
			
			System.out.println(nome + " tem " + idade + " anos ");
			
			break;
		}
		
		teclado.close();
			
	}

}