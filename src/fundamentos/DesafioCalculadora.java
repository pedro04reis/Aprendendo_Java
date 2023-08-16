package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("1° numero: ");
		double n1 = entrada.nextDouble();
		
		System.out.println("2° numero: ");
		double n2 = entrada.nextDouble();
		
		System.out.println("Operação: ");
		String op = entrada.next();
		
		//logica
		double resultado = "+".equals(op) ? n1 + n2 : 0;
		resultado = "-".equals(op) ? n1 + n2 : resultado; 
		resultado = "*".equals(op) ? n1 * n2 : resultado;
		resultado = "/".equals(op) ? n1 / n2 : resultado;
		resultado = "%".equals(op) ? n1 % n2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", n1, op, n2, resultado);
		
		
		
		
		entrada.close();
	}
}
