package Controle;

import java.util.Scanner;

public class doWhile {
	public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);
		 
		String texto = "por favor";
		
		do {
			System.out.print("Palavra mágica para sair: ");
		
			texto = entrada.nextLine();
		}while(!texto.equalsIgnoreCase("por favor"));

		System.out.println("Obrigado");
		entrada.close();
	}
}
