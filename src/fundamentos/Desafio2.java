package fundamentos;

import java.util.Scanner;
	
public class Desafio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("DIGITE UM VALOR: ");
		double valor = scanner.nextDouble();
		
		double quadrado = Math.pow(valor, 2);
		
		
		double cubo = Math.pow(valor, 3);
		
		
		System.out.println("O VALOR AO QUADRADO É: "+ quadrado);
		System.out.println("O VALOR AO QUADRADO É: "+ cubo);
		
	
		scanner.close();
	}
}
