/*
 *En este ejemplo se utiliza un area de texto y un botón para capturar los datos ingresados en el área 
 */

package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class EventosAreaTexto {

	public static void main(String[] args) {
		
		MarcoAreaTexto marco = new MarcoAreaTexto();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}

}

class MarcoAreaTexto extends JFrame{
	
	public MarcoAreaTexto(){
		
		setBounds(250,150,600,400);
		setTitle("Campo de texto");
		LaminaAreaTexto lamina = new LaminaAreaTexto();
		add(lamina);	
	}
}

class LaminaAreaTexto extends JPanel{
	
	public LaminaAreaTexto(){		
		
		area1 = new JTextArea(8,20);
		area1.setLineWrap(true);
		JScrollPane laminaArea = new JScrollPane(area1);
		JButton boton = new JButton("Capturar");
		add(laminaArea);
		add(boton);
		oyenteArea evento = new oyenteArea();
		boton.addActionListener(evento);
	}
	
	private class oyenteArea implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			System.out.println(area1.getText());
		}
		
		
	}
	
	JTextArea area1;
}












