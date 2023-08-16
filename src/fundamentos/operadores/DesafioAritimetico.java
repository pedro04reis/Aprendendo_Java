package fundamentos.operadores;

public class DesafioAritimetico {
public static void main(String[] args) {
	
	double a1 = (3 + 2) * 6;
	double a2 = Math.pow(a1, 2 ) ; 
	double a3 = 3 * 2;
	double a4 = a2 / a3 ;
	
	double b1 = 1 - 5 ;
	double b2 = 2 - 7 ;
	double b3 = b1 * b2 ;
	double b4 = b3 / 2 ; 
	double b5 = Math.pow(b4, 2);
	
	double c1 = a4 - b5;
	double c2 = Math.pow(c1, 3);
	double c3 = Math.pow(10, 3);
	double c4 = c2 / c3 ;
	System.out.println((int)c4);
	
	
	
	
	
	
	
}
}
