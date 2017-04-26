package graficos;

import javax.swing.*;

import java.awt.Frame;
import java.awt.event.*;

public class CambioEstado {

	public static void main(String[] args) {
		
		MarcoEstado marco = new MarcoEstado();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoEstado extends JFrame{
	
	public MarcoEstado(){
		
		setBounds(300,200,600,400);
		setTitle("Mi marco con cambio de estado");
		setVisible(true);
		CambiaDeEstado nuevoEstado = new CambiaDeEstado();	//Crea instancia de la clase oyente
		addWindowStateListener(nuevoEstado); //Indica al marco quién es el objeto oyente
		
	}
	
}

class CambiaDeEstado implements WindowStateListener{
	
	public void windowStateChanged(WindowEvent e){
		
		System.out.println("La ventana ha cambiado de estado");
		//System.out.println("El evento anterior fue " + e.getOldState());
		//System.out.println("El evento actual es " + e.getNewState());
		
		if(e.getNewState()==Frame.MAXIMIZED_BOTH){
			
			System.out.println("La ventana ha sido maximizada");
		}
		else if(e.getNewState()==Frame.NORMAL){
			
			System.out.println("La ventana se encuentra en estado normal");
		}
		else if(e.getNewState()==Frame.ICONIFIED){
			
			System.out.println("La ventana ha sido minimizada");
		}
	}
	
}




