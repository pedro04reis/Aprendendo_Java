package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
		boolean cond1 = true;
		boolean cond2 = 3 > 7;
		
		System.out.println(cond1 && !cond2);
		System.out.println(cond1 || cond2);
		System.out.println(cond1 ^ cond2);		
		System.out.println(!!cond1);	
		System.out.println(!cond2);
	
		System.out.println("\nTABELA VERDADE E");
				System.out.println(true && true);
				System.out.println(true && false);
			//	System.out.println(false && true);
				//System.out.println(false && false);
		
				
		System.out.println("\nTABELA VERDADE OU");
			//	System.out.println(true || true);
				//System.out.println(true || false);
				System.out.println(false || true);
				System.out.println(false || false);
				
		System.out.println("\nTABELA VERDADE OU EXCLUSIVO (XOR)");
				System.out.println(true ^ true);
				System.out.println(true ^ false);
				System.out.println(false ^ true);
				System.out.println(false ^ false);			
		
		System.out.println("\nTABELA VERDADE NOT");
				System.out.println(!true);
				System.out.println(!false);
				
				
				
		
		
		
		
		
	}
}
