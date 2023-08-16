package fundamentos;

import java.util.Scanner;

public class Desafio1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("QUAL SEU PESO: ");
		double peso = scanner.nextDouble();
		
		System.out.println("QUAL SUA ALTURA: ");
		double altura = scanner.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.println("IMC: " + imc);
		
		
		
		scanner.close();
	}
}
