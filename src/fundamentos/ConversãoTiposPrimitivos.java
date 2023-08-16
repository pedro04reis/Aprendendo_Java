package fundamentos;

public class ConversãoTiposPrimitivos {
	public static void main(String[] args) {
		
		double a = 1; //impicita
		System.out.println(a);
		
		float b = (float) 1.0; // explícita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c;
		System.out.println(d);
	
		double e = 1;
		int f = (int) e ;
		System.out.println(f);
	
		
	
	}
	
}
