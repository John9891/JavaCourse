package graficos;

import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;

public class Pruebas {

	public static void main(String[] args) {
		
		String fuente = JOptionPane.showInputDialog("Introduce fuente");
		
		boolean sifuente = false;
		
		String [] nombresFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for(String nombredeFuente: nombresFuentes){
			
			if(fuente.equalsIgnoreCase(nombredeFuente)){
				
				sifuente = true;
			}
		}
		
		if(sifuente){
			
			System.out.println("Fuente instalada");
		}
		else{
			System.out.println("No está instalada");
		}

	}

}
