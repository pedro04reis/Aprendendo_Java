package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá, pessoal".charAt(2));
		
		String s = "Boa tarde";
		s = s.toUpperCase();
		System.out.println(s.concat("!!!"));
		System.out.println(s + ("!!!"));
		System.out.println(s.startsWith("BOA"));
		System.out.println(s.length());
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.equalsIgnoreCase("Boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";	
		var idade = 33;
		var salario = 12345.987;
		
		//todos dão o mesmo resultado, mas para usar sao diferentes
		System.out.println("NOME: "+ nome + " "+ sobrenome + " " + "IDADE: " + idade );
		
		System.out.printf("O Sr. %s %s tem %d anos de idade, e ganha R$ 2.%f. ", nome, sobrenome, idade, salario );
	
		String frase = String.format("\nO Sr. %s %s tem %d anos de idade, e ganha R$ 2.%f. ", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		String maisUMAfrase = "NOME: "+ nome + " "+ sobrenome + " " + "IDADE: " + idade; 
		System.out.println(maisUMAfrase);
	}
}

 