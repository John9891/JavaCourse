import javax.swing.*;

public class clave_while {

	public static void main(String[] args) {
		
		String clave = "joal9891";
		
		String entrada = "";	
		
		
		while (clave.equals(entrada)==false){			
			
			entrada = JOptionPane.showInputDialog("Por favor ingrese la clave");			
			
			if(clave.equals(entrada)==false){
				
				System.out.println("Contraseña incorrecta");
				
			}						
			
		}		
		
		System.out.println("Felicitaciones, ha ingresado la clave correcta");
		

	}

}
