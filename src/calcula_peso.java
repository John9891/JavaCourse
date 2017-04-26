import javax.swing.*;

public class calcula_peso {

	public static void main(String[] args) {
		
		String genero = "";
		
		do{
			genero = JOptionPane.showInputDialog("Ingrese su género:");
		}
		
		while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su altura en cms"));
		int pesoideal = 0;
		
		if (genero.equalsIgnoreCase("H")){
			
			pesoideal = altura - 110;
		}
		else if (genero.equalsIgnoreCase("M")){
			
			pesoideal = altura - 120;
		}
		System.out.println("Tu peso ideal es " + pesoideal + " kgs");
		

	}

}
