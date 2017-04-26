import javax.swing.*;

public class EntradaNumeros {

	public static void main(String[] args) {
		
		String num1 = JOptionPane.showInputDialog("Ingrese un número:");
		
		double num2 = Double.parseDouble(num1);
		
		System.out.print("La raíz de " + num2 + "es ");
		
		System.out.printf("%1.2f", Math.sqrt(num2));
		

	}

}
