/*
 *  The java can defined what the type of the variable if you didn't declared the type,
 *   but isn't mean you can put another information inside the variable of different type
 *   because the java has defined the type of the variable
 *   
 *   int = 4 , double = 4.5 
 *   
 *  
 */


package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5; // declaration and startup 
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
				
		double d; // variable was declared                  here the java could define the variable because I put the type before
		d = 123.65; // variable was started 
		System.out.println(d); // was used 
		
		//var e;                                     here the java can't define the variable because o didn't put any information or the type 
		//e = 123.45;
		
		
	}
}
