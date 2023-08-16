package fundamentos.operadores;

public class DesafioFor {
	public static void main(String[] args) {
		
		String valor = "#";
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
		for(String x = "H"; !x.equals("HHHHHH"); x += "H") {
			System.out.println(x);
		}
	}
}
