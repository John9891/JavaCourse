import javax.swing.*;

public class Entrada2 {

	public static void main(String[] args) {
		
		String NombreUsuario = JOptionPane.showInputDialog("Ingrese su nombre");
		
		String edad = JOptionPane.showInputDialog("Ingrese la edad");
		
		int edad2 = Integer.parseInt(edad);
		
		System.out.println("Su nombre es " + NombreUsuario + " y usted tendr� en 10 a�os " +
		(edad2+10) + " a�os");
		

	}

}
