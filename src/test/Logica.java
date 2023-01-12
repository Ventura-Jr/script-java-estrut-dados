package test;

public class Logica {

	public static void main(String[] args) {
		
		//IF ELSE
		
		int numero = 9;
		
//		if(numero > 5) { //FAÇA
//			System.out.println("Sim, o número " + numero + " é maior que 5");
//		} else {		
//			System.out.println("Não, o número " + numero + " não é maior que 5");
//		}
		
		if (numero > 5) {//FAÇA
			System.out.println("Sim, o número " + numero + " é maior que 5");
		} else if (numero ==5) {	
			System.out.println("0 número " + numero + " é igual a 5");
		} else if (numero % 2 == 0) {
			System.out.println("0 número " + numero + " é par");
		} else {
			System.out.println("Não, o número " + numero + " Não é maior que 5");
						
		}
	}

}
