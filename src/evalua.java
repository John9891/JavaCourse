import java.util.*;

public class evalua {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, ingrese la figura a calcular:");
		
		String figura = entrada.nextLine();
		
		System.out.println(figura);
		
		if (figura.equals("cuadrado")){
			
			System.out.println("Ahora ingrese el lado del cuadrado:");
			double lado = entrada.nextInt();
			double area = lado * lado;
			System.out.println("El �rea del cuadrado es " + area);
		}
		
		else if (figura.equals("rectangulo")){
			System.out.println("Ahora ingrese el largo del rect�ngulo:");
			double largo = entrada.nextInt();
			System.out.println("Ahora ingrese el ancho del rect�ngulo:");
			double ancho = entrada.nextInt();
			double area = largo * ancho;
			System.out.println("El �rea del rectangulo es " + area);
		}
		else if (figura.equals("circulo")){
			System.out.println("Ahora ingrese el radio del c�rculo:");
			double radio = entrada.nextInt();			
			System.out.print("El �rea del c�rculo es ");
			System.out.printf("%1.2f", Math.PI * Math.pow(radio, 2));
		}
		else{
			System.out.println("Usted no ha ingresado un nombre de figura v�lida");
		}
		
		
		

	}

}
