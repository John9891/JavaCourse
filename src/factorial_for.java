import javax.swing.*;

public class factorial_for {

	public static void main(String[] args) {
		
		int resultado = 1;
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un n�mero"));
		int factorial = numero;
		
		for (int i=numero; i>0; i--){
			resultado = resultado * (i);				
		}
		System.out.println("El valor de " + factorial + " factorial es " + resultado);

	}

}
