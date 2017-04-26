/*Esta practica buscar crear un programa que valida una contraseña ingresada mediante un
 * JPasswordField, el cual está a la escucha y dispara un evento cuando la longitud
 * de la contraseña no cumple los requerimientos
 */

package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.event.*;

public class EventosTextField {

	public static void main(String[] args) {
		
		MarcoEventoTexto marco = new MarcoEventoTexto();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}

}

class MarcoEventoTexto extends JFrame{
	
	public MarcoEventoTexto(){
		
		setBounds(250,150,600,400);
		setTitle("Campo de texto");
		LaminaEventoTexto lamina = new LaminaEventoTexto();
		add(lamina);	
	}
}


class LaminaEventoTexto extends JPanel{
	
	public LaminaEventoTexto(){
		
		setLayout(new BorderLayout());
		JPanel lamina2 = new JPanel();
		lamina2.setLayout(new GridLayout(2,2,10,10));		
		
		JLabel etiqueta1 = new JLabel("Usuario");
		JLabel etiqueta2 = new JLabel("Contraseña");
		JTextField campo1 = new JTextField(30);
		campoPass = new JPasswordField(30);
		JButton boton = new JButton("Enviar");
		
		add(lamina2,BorderLayout.NORTH);
		add(boton,BorderLayout.SOUTH);
		lamina2.add(etiqueta1);
		lamina2.add(campo1);		
		lamina2.add(etiqueta2);
		lamina2.add(campoPass);
		
		compruebaPass evento = new compruebaPass();
		campoPass.getDocument().addDocumentListener(evento);				
		
	}
	
	private class compruebaPass implements DocumentListener{

		
		public void changedUpdate(DocumentEvent e) {
			
			
		}

		
		public void insertUpdate(DocumentEvent e) {
			
			char [] contrasena = campoPass.getPassword();		//Instancia objeto de tipo char para capturar pass
			
			if(contrasena.length<8 || contrasena.length>12){
				
				campoPass.setBackground(Color.RED);
			}
			else{
				campoPass.setBackground(Color.WHITE);
			}
		}

		
		public void removeUpdate(DocumentEvent e) {
			
			char [] contrasena = campoPass.getPassword();		//Instancia objeto de tipo char para capturar pass
			
			if(contrasena.length<8 || contrasena.length>12){
				
				campoPass.setBackground(Color.RED);
			}
			else{
				campoPass.setBackground(Color.WHITE);
			}
			
			
		}
		
		
		
		
	}
	
	JPasswordField campoPass;

	
}








