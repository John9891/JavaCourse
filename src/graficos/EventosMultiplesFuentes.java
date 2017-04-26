package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class EventosMultiplesFuentes {

	public static void main(String[] args) {
		
		MarcoFuentesMultiples marco = new MarcoFuentesMultiples ();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}

}

class MarcoFuentesMultiples extends JFrame{
	
	public MarcoFuentesMultiples(){
		
		setBounds(300,200,600,400);
		setTitle("Mi marco con multiples fuentes");		
		LaminaFuentesMultiples lamina = new LaminaFuentesMultiples();
		add(lamina);		
	}
	
}


class LaminaFuentesMultiples extends JPanel{
	
	public LaminaFuentesMultiples(){
		
		AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/graficos/amarillo.gif"),Color.yellow); 
		AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/graficos/azul.gif"),Color.blue);
		AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/graficos/rojo.gif"),Color.red);
		
		add(new JButton(accionAmarillo));	//Se instancia el boton con parámetro action y se agrega al mismo tiempo
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));
		
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);	//Se crea el mapa de entrada		
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondoAmarillo");   //Crea la combinación de teclas y las
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondoAzul");		//Asigna a un objeto
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondoRojo");
		
		ActionMap mapaAccion = getActionMap();		
		mapaAccion.put("fondoAmarillo", accionAmarillo);	//Asocia el objeto a una acción
		mapaAccion.put("fondoAzul", accionAzul);
		mapaAccion.put("fondoRojo", accionRojo);		
	}	
	
	class AccionColor extends AbstractAction{		//Clase oyente que hereda de la clase AbstractAction para no implementar
													//todos los métodos de la interface Action
		public void actionPerformed(ActionEvent e) {

			Color c = (Color)getValue("color de fondo");
			setBackground(c);
			System.out.println("Nombre " + getValue(Action.NAME));
			System.out.println("Icono " + getValue(Action.SMALL_ICON));
		}

		public AccionColor(String nombre, Icon icono, Color color_boton){

			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color " + nombre);
			putValue("color de fondo", color_boton);
		}	

	}
	
}


