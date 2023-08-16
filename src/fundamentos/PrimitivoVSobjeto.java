// EVERTHING IN JAVA ARE OBJECTS , MENOS OS PRIMITIVE TYPES 

package fundamentos;

public class PrimitivoVSobjeto {

		public static void main(String[] args) {
			
			String s = new String("texto");
			s.toUpperCase();
			
			//wrappers são a versão objeto dos tipos primitivos
			int a = 123;
			System.out.println(a);
		}
}
