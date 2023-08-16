package arrays;

import java.util.Scanner;

public class Desafio {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
			
		System.out.println("QUANTAS NOTAS SÃO?: ");
		
		int qtdeNotas = entrada.nextInt();
		
		double[] notas = new double [qtdeNotas];
	
		for (int i = 0; i < notas.length; i++) {
			System.out.print("INFORME A NOTA " + (i + 1) + ":");
			notas[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for(double nota : notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		System.out.println("A MÉDIA É: " + media + "!");
		entrada.close();
		
	}
}
