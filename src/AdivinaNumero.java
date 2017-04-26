import java.util.*;

public class AdivinaNumero {

	public static void main(String[] args) {
		
		int aleatorio = (int)(Math.random()*100);
		
		System.out.println(aleatorio);
		Scanner entrada = new Scanner(System.in);		
		int numero = 0;
		int intentos = 0;
		
		while (numero != aleatorio){
			
			System.out.println("Por favor, ingrese el n�mero:");
			numero = entrada.nextInt();
			
			if(numero < aleatorio){				
				
				System.out.println("Te equivocaste, el n�mero a adivinar es mayor");
			}
			
			else if(numero > aleatorio){
				System.out.println("Te equivocaste, el n�mero a adivinar es menor");
			}
			intentos++;			
			
		}
		entrada.close();
		System.out.println("Adivinaste el n�mero en " + intentos + " intentos");		

	}

}
