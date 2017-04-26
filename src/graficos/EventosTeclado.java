package graficos;

import javax.swing.*;
import java.awt.event.*;

public class EventosTeclado {

	public static void main(String[] args) {
		
		MarcoConTeclas marco = new MarcoConTeclas();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoConTeclas extends JFrame{
	
	public MarcoConTeclas(){
		
		setBounds(300,200,600,400);
		setTitle("Mi marco con cambio de estado");
		setVisible(true);
		EstadoTecla tecla = new EstadoTecla();	//Crea instancia de la clase oyente
		addKeyListener(tecla);	//Indica al marco quién es el objeto oyente
		
	}
	
}

class EstadoTecla implements KeyListener{

	
	public void keyPressed(KeyEvent e) {
		
		//int caracter = e.getKeyCode();
		//System.out.println(caracter);				
	}
	
	public void keyReleased(KeyEvent e) {
		
		//int caracter = e.getKeyCode();
		//System.out.println(caracter);				
	}

	
	public void keyTyped(KeyEvent e) {
		
		char caracter = e.getKeyChar();
		System.out.println(caracter);
		System.out.println(e.getKeyCode());
	}
		
}
