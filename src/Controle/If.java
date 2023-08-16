package Controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("INFORME A MEDIA: ");
		double media = entrada.nextDouble();
		
		if (media <= 10  &&  media >= 7.0){
			System.out.println("APROVADO! ");
			System.out.println("PARABENS! ");
		}
		
		if (media < 7 && media >= 4.5)
			System.out.println("RECUPERAÇÃO! ");
	
		
		if (media < 4.5 && media >= 0){
			System.out.println("REPROVADO! ");
		}

		entrada.close();
	}
}
