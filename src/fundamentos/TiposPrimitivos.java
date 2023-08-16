package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionário
		
		// Tipos numéricos inteiros
		
		byte anosDEempresa = 23;
		short numeroDEvoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L ;
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipos Booleano
		Boolean estaDEferias = false; // true
		
		//Tipo caractere
		char status = 'A'; // ativo
		
		//Dias de empresa
		System.out.println(anosDEempresa * 365);
		
		//Numero de voos
		System.out.println(numeroDEvoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas );
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias: " + estaDEferias); 
		System.out.println("status: " + status);
	}
}
