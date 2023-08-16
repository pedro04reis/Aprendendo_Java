package fundamentos;

import java.util.Scanner;

public class DesafioConversão {
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Primeiro salario: ");
		String valor1 = entrada.next().replace(",", ".");
		
		System.out.print("\nSegundo salario: ");
		String valor2 = entrada.next().replace(",", ".");
		
		System.out.print("\nTerceiro salario: ");
		String valor3 = entrada.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);

		double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.println("A média dos 3 salários: " + media);
		
		
		entrada.close();
	}
}
