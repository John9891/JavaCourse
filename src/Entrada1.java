import java.util.*;

public class Entrada1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese por favor su nombre");
		
		String nombre_usuario = entrada.nextLine();
		
		System.out.println("Ahora, introduzca la edad:");
		
		int edad = entrada.nextInt();
		
		System.out.println("Su nombre es " + nombre_usuario + " y usted tiene " + edad + " años");
		

	}

}
