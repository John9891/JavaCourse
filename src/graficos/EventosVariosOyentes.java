/*
 * En este ejemplo se hizo uso de una fuente, que corresponde a un botón ubicado en el marco principal
 * que cierra todas los marco adicionales abiertos
 */


package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventosVariosOyentes {

	public static void main(String[] args) {
		
		MarcoVariosOyentes marco = new MarcoVariosOyentes ();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);		
	}
}


class MarcoVariosOyentes extends JFrame{
	
	public MarcoVariosOyentes(){
		
		setBounds(650,350,300,200);
		setTitle("Mi marco con multiples fuentes");		
		LaminaVariosOyentes lamina = new LaminaVariosOyentes();
		add(lamina);
	}
}

class LaminaVariosOyentes extends JPanel{
	
	public LaminaVariosOyentes(){
		
		
		JButton boton_nuevo = new JButton("Nuevo");
		boton_cerrar = new JButton("Cerrar todo");		
		add(boton_nuevo);
		add(boton_cerrar);
		
		oyenteNuevo oyente = new oyenteNuevo();		//Instancia un objeto de la clase oyente
		boton_nuevo.addActionListener(oyente);
	}
	
	private class oyenteNuevo implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			nuevaVentana ventana = new nuevaVentana(boton_cerrar);	//Instancia un objeto de la clase que genera las
			ventana.setVisible(true);					//ventanas nuevas
		}				
		
	}
	
	JButton boton_cerrar;		//Se crea fuera del constructor porque se va a usar en otros métodos	
}


class nuevaVentana extends JFrame{
	
	public nuevaVentana(JButton boton_de_principal){
		
		incrementa++;
		setTitle("Ventana #" + incrementa);
		setBounds(30*incrementa,20*incrementa,300,200);
		
		cierraTodos cerrar = new cierraTodos();
		boton_de_principal.addActionListener(cerrar);	//La fuente (botón recibido como parámetro) dispara
														//el evento escuchado por los oyentes
	}
	
	private class cierraTodos implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			dispose();
			incrementa = 0;
		}	
		
	}
	
	private static int incrementa = 0;	
}





