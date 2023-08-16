	// double is used when the number is a decimal, as a REAL in visualg
    //"final " you can use when you want to forbid the value can be altered , final value



package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
	
		double raio = 3.4;
		
		final double pi = 3.14159;
		
		double area = pi * raio * raio;	
		System.out.println(area); 
		
		raio= 10;
		area= pi * raio * raio;
		System.out.println("Área = " + area + "m2.");
	}
}
