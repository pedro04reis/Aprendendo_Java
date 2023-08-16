package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
	
	
	double media = 8.6;
	String resultadoFinal = media >= 7.0 ? "APROVADO!" : "REPROVADO /:";
	System.out.println("O aluno esta : " + resultadoFinal);
	
	double nota = 9.9;
	boolean bomComportamento = true;
	boolean passouPorMedia = nota >= 7;
	boolean temDesconto = bomComportamento && passouPorMedia ;
	String resultado = temDesconto ? "SIM":"NAO";
	
	
	
	System.out.println(resultado);
	
	}
}
