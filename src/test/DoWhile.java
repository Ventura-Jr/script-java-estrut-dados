package test;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		
		int idade = 0;
		String nome;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
			
			System.out.println("Informe sua idade: ");
			idade = Integer.parseInt(teclado.nextLine());
			
			System.out.println(nome + " tem " + idade + " anos ");
			
		} while(idade < 15);
		
		teclado.close();		

	}

}