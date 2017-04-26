
public class Objetos_String {

	public static void main(String[] args) {
		
		/*
		String nombre = "John Alexander Gutierrez Lizarazo";		
		System.out.println("Mi nombre es " + nombre);		
		int longitud = nombre.length();		
		System.out.println("Mi nombre tiene " + longitud + " letras");		
		System.out.println("La primera letra de ni nombre es " + nombre.charAt(0));		
		int ultima = nombre.length();		
		System.out.println("La última letra de mi nombre es " + nombre.charAt(ultima-1));
		*/
		
		String frase = "Esta es una prueba";
		
		String resumen = frase.substring(10, 14);
		
		System.out.println("La subcadena es " + resumen);
		
		String alumno1 = "Alberto", alumno2 = "David";
		
		System.out.println(alumno1.equals(alumno2));

	}

}
