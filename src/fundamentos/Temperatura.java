// int is type of variavel when teh number isn't a  decimal



package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C		
		double multiplicador = 5.0/9.0;
		final int diferença= 32;
		
		double temp= 86; 
		double result= (temp - diferença) * multiplicador;
		System.out.println(temp + " fahrenheit significa " + result + "em Celsius" );
	}
}
