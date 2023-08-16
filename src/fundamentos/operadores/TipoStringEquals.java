package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2"); //true
		
		
		String s1 = new String("2");
		System.out.println("2" == s1); // false
		System.out.println("2".equals(s1)); // true
		System.out.println("-------------------------------------------------");
		
		
		Scanner entrada = new Scanner (System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim()); // "trim" serve para tirar os espaçoes em brancos de uma resposta que a entrada receber
		System.out.println("2".equals(s2.trim())); // sempre dar preferencia pelo equals quando for comparar strings
		
		entrada.close();
		
	}
}
