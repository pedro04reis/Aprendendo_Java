package fundamentos;

import java.util.Scanner;

public class console {
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print("dia ! \n \n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d  ", 1,2,3,4,5,6);
		System.out.printf("Nome: %s%n", "João");
		
	
		Scanner entrada = new Scanner (System.in);              //tipo o leia do visualg

		System.out.print("Digite o Seu Nome: ");
		String nome= entrada.nextLine();
		
		System.out.print("Digite seu Sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua Idade: ");
		int idade = entrada.nextInt();
		
		
		System.out.printf("s% s% tem s% anos.%n", nome, sobrenome, idade);
		entrada.close();
	}
}
