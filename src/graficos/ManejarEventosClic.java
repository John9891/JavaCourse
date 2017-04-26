package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;


public class ManejarEventosClic {

	public static void main(String[] args) {
		
		MarcoConBoton marco = new MarcoConBoton();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConBoton extends JFrame{
	
	public MarcoConBoton(){
		
		setBounds(300,200,600,400);
		setTitle("Mi marco escrito");
		LaminaBoton lamina1 = new LaminaBoton();		
		add(lamina1);
	}	
}

class LaminaBoton extends JPanel{
	
	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	
	public LaminaBoton(){
		
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		ColorFondo Azul = new ColorFondo(Color.blue);
		ColorFondo Amarillo = new ColorFondo(Color.yellow);
		ColorFondo Rojo = new ColorFondo(Color.red);
		botonAzul.addActionListener(Azul);	//Objeto fuente (Boton) desencadena objeto evento (addAction: tipo clic) sobre objeto oyente (instancias de la clase ColorFondo)
		botonAmarillo.addActionListener(Amarillo);
		botonRojo.addActionListener(Rojo);	
	}											
	
	private class ColorFondo implements ActionListener{		//clase interna
		
		public ColorFondo(Color c){
			
			colorDeFondo = c;
		}
		
		public void actionPerformed(ActionEvent e){	
			
			setBackground(colorDeFondo);
			
		}
		
		private Color colorDeFondo;		
	}		
	
}