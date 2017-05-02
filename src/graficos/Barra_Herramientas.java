package graficos;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;

import javax.swing.*;


public class Barra_Herramientas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoBarra mimarco=new MarcoBarra();		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		mimarco.setVisible(true);
	}

}

class MarcoBarra extends JFrame{
	
	public MarcoBarra(){
		
		setTitle("Marco con Barra");		
		setBounds(300,200,600,400);		
		lamina=new JPanel();		
		add(lamina);
		
		// configuración de acciones
		
		Action accionAzul=new AccionColor("Azul", new ImageIcon("src/graficos/azul.gif"), Color.BLUE);		
		Action accionAmarillo=new AccionColor("Amarillo", new ImageIcon("src/graficos/amarillo.gif"), Color.YELLOW);		
		Action accionRojo=new AccionColor("Rojo", new ImageIcon("src/graficos/rojo.gif"), Color.RED);
		Action accionCerrar = new AbstractAction("Salir", new ImageIcon("src/graficos/rojo.gif")){

			public void actionPerformed(ActionEvent e) {
				System.exit(0);}			
		};
		JMenu menu = new JMenu("Color");
		menu.add(accionAzul);
		menu.add(accionAmarillo);
		menu.add(accionRojo);
		JMenuBar BarraMenu = new JMenuBar();
		BarraMenu.add(menu);
		//*******************Barra de herramientas*************************************
		setJMenuBar(BarraMenu);
		JToolBar barra = new JToolBar();
		barra.add(accionAzul);
		barra.add(accionAmarillo);
		barra.add(accionRojo);
		add(barra, BorderLayout.NORTH);
		barra.addSeparator();
		barra.add(accionCerrar);
	}		
	
	private class AccionColor extends AbstractAction{
		
		public AccionColor(String nombre, Icon icono, Color c){
			
			putValue(Action.NAME, nombre);			
			putValue(Action.SMALL_ICON, icono);			
			putValue(Action.SHORT_DESCRIPTION, "Color de fondo..." + nombre);			
			putValue("Color", c);
		}
		
		public void actionPerformed(ActionEvent e) {			
			
			Color c=(Color) getValue("Color");			
			lamina.setBackground(c);			
		}		
		
	}
	private JPanel lamina;
}
















