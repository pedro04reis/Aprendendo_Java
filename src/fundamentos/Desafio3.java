package fundamentos;

import java.util.Scanner;

public class Desafio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("DIGITE UMA TEMPERATURA EM CELSIUS: ");
		double temp = entrada.nextDouble();
		
		double conversao = temp * 1.8 +32;
		
		System.out.println("EM FARENHEIT: "+ conversao);
		
		
		entrada.close();
	}
}
