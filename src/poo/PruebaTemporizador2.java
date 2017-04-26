package poo;
import javax.swing.*;
import javax.swing.Timer;

import java.awt.event.*;
import java.awt.Toolkit;
import java.util.*;


public class PruebaTemporizador2 {

	public static void main(String[] args) {
		
		Reloj mireloj = new Reloj();
		mireloj.enMarcha(5000, true);
		JOptionPane.showMessageDialog(null, "Pulse para detener");
		System.exit(0);	

	}

}

class Reloj {	
	
	public void enMarcha(int intervalo, final boolean sonido){
		
		class dameHora2 implements ActionListener{	//Clase interna local
			
			public void actionPerformed(ActionEvent e){
				
				Date ahora = new Date();
				
				System.out.println("La hora actual es: " + ahora);				
				
				if(sonido==true){
					
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}
		
		ActionListener oyente = new dameHora2();
		Timer miTemporizador = new Timer(intervalo, oyente);
		miTemporizador.start();			
		
	}	
	
	
}
