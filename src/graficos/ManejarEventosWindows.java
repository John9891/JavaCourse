package graficos;

import javax.swing.JFrame;
import java.awt.event.*;

public class ManejarEventosWindows {

	public static void main(String[] args) {
		
		MarcoVentana marco = new MarcoVentana();		
		marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		MarcoVentana marco2 = new MarcoVentana();		
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoVentana extends JFrame{
	
	public MarcoVentana(){
		
		setBounds(300,200,600,400);
		setTitle("Mi marco escrito");
		setVisible(true);
		//VentanaOyente ventana = new VentanaOyente();
		addWindowListener(new VentanaOyente());		//Venta queda en modo escucha de que se produzca un objeto evento Window 		
	}	
}

class VentanaOyente extends WindowAdapter{
	
	/*public void windowActivated(WindowEvent e){
		System.out.println("Ventana activa");
	}
	public void windowClosed(WindowEvent e){
		System.out.println("La ventana ha sido cerrada");
	}
	public void windowClosing(WindowEvent e){
		System.out.println("Cerrando ventana");
	}
	public void windowDeactivated(WindowEvent e){
		System.out.println("Ventana desactivada");
	}
	public void windowDeiconified(WindowEvent e){
		System.out.println("Venta restaurada");
	}
	public void windowIconified(WindowEvent e){
		
		System.out.println("Ventana minimizada");
	}*/
	public void windowOpened(WindowEvent e){
		System.out.println("La ventana es abierta por primera vez");
	}
	
}


