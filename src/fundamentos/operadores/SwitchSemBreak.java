package fundamentos.operadores;

public class SwitchSemBreak {
	public static void main(String[] args) {
		
		
		String faixa = "branca" ;
		
		switch (faixa.toLowerCase()) {
		case "preta" :
			System.out.println("Sei voar");
		case "marrom" :
			System.out.println("Sei bater");
		case "roxa":
			System.out.println("Sei socar");
		case "verde":
			System.out.println("Sei chutar");
		case "laranja":
			System.out.println("Sei correr");
		case "vermelha":
			System.out.println("Sei gritar");
		case "amarela":
			System.out.println("Sei fingir de morto");
			break;
		default:
			System.out.println("Sei Apanhar"); 
		
		}
	}
}
