package graficos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.Scanner;

public class EventosFoco {

	public static void main(String[] args) {
		
		MarcoFoco marco = new MarcoFoco ();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoFoco extends JFrame{
	
	public MarcoFoco(){
		
		setBounds(300,200,600,400);
		setTitle("Mi marco con cambio de estado");
		setVisible(true);		
		LaminaFoco lamina = new LaminaFoco();
		add(lamina);
	}
	
}


class LaminaFoco extends JPanel{
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		setLayout(null);	//Invalida el layout para anular la colocación por defecto
		campo1 = new JTextField();
		campo2 = new JTextField();
		campo1.setBounds(10, 20, 150, 20);
		campo2.setBounds(400, 20, 150, 20);		
		add(campo1);
		add(campo2);
		DisparaEventos foco1 = new DisparaEventos();
		campo1.addFocusListener(foco1);		
	}
	
	private class DisparaEventos implements FocusListener{
		
		public void focusGained(FocusEvent e) {
			
			System.out.println("El campo tiene el foco");
		}
		
		public void focusLost(FocusEvent e) {
			
			System.out.println("El capo perdió el foco");
			String correo = campo1.getText();		
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
				JOptionPane.showMessageDialog(null, "Correo ingresado satisfactoriamente");
			}
			else{
				JOptionPane.showMessageDialog(null, "Ingrese un correo válido");
			}
			
		}
		
	}
	
	JTextField campo1;
	JTextField campo2;
}















