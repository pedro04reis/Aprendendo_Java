package Controle;

import java.util.Scanner;

public class DesafioDiaDaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("QUAL DIA DA SEMANA: ");
		String dia = entrada.next();
		
		if ("domingo".equalsIgnoreCase(dia)) {
			System.out.println(1);
		}else if ("segunda".equalsIgnoreCase(dia)) {
			System.out.println(2);
		}else if ("terça".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia)) {
			System.out.println(3);
		}else if ("quarta".equalsIgnoreCase(dia)) {
			System.out.println(4);
		}else if ("quinta".equalsIgnoreCase(dia)) {
			System.out.println(5);
		}else if ("sexta".equalsIgnoreCase(dia)) {
			System.out.println(6);
		}else if ("sábado".equalsIgnoreCase(dia) || "sabado".equalsIgnoreCase(dia)) {
			System.out.println(7);
		}else {
			System.out.println("NUmero invalido");
		}
			
			
			
			
			
			
		entrada.close();
	}
}
