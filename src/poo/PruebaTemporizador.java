package poo;
import javax.swing.Timer;
import javax.swing.JOptionPane;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;

public class PruebaTemporizador {

	public static void main(String[] args) {
		
		dameHora oyente = new dameHora();
		//ActionListener oyente = new dameHora();	//Instruccion alternativa a la anterior
		
		Timer miTemporizador = new Timer(5000, oyente);
		miTemporizador.start();		//Arranca el temporizador
		JOptionPane.showMessageDialog(null, "Pulse para detener");
		System.exit(0);		//Termina el programa

	}

}

class dameHora implements ActionListener{
	
	
	public void actionPerformed(ActionEvent e){
		
		Date ahora = new Date();
		
		System.out.println("La hora actual es: " + ahora);
		
		Toolkit.getDefaultToolkit().beep();
		
	}
}
