import java.util.*;

public class uso_for {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Por favor ingrese su correo");
		String correo = entrada.nextLine();		
		int arroba = 0, punto = 0;		
		
		for (int i=0; i < correo.length(); i++){			
			
			if (correo.charAt(i)=='@'){
				arroba++;
			}
			if (correo.charAt(i)=='.'){
				punto++;
			}			
		}
		
		if (arroba == 1 && punto >=1){
			System.out.println("Correo ingresado satisfactoriamente");
		}
		else{
			System.out.println("Ingrese un correo válido");
		}		

	}

}
