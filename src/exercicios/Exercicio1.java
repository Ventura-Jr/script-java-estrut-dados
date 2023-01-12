package exercicios;
//import java.util.Scanner;
import java.util.*;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); //classe e instancia
		teclado.useLocale(Locale.US); //setar o lacale
		
		String aluno;  //variavel
		float nota1, nota2, media, soma, mediaTurma; //tipo primitivo declarados
		
		soma = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Nome do aluno: ");
			aluno = teclado.nextLine();
			System.out.println("Nota 1: ");
//			nota1 = teclado.nextLine();  //Dará erro
			nota1 = teclado.nextFloat();
			System.out.println("Nota 2: ");
			nota2 = teclado.nextFloat();
			
			teclado.nextLine(); //passar a diante
			
			media = (nota1 + nota2)/2;  //calculo de media
			
			soma = soma + media;  
			
			System.out.printf("Média do aluno é %.1f\n" , media);
			
			if (media >= 6) {
				System.out.println("Aluno aprovado! Parabéns.");
			} else {
				System.out.println("Aluno reprovado! Estude mais.");
			}
		}			
			mediaTurma = soma/3;
			
			System.out.printf("Média da turma = %.1f\n" , mediaTurma);
			
			teclado.close();

		}
}
