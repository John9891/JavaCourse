package graficos;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class BarraMenu {

	public static void main(String[] args) {
		
		MarcoMenu marco = new MarcoMenu();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}
}

class MarcoMenu extends JFrame{
	
	public MarcoMenu(){
		
		setBounds(250,150,600,400);
		setTitle("Marco con menú");
		LaminaMenu lamina = new LaminaMenu();
		add(lamina);				
	}
}


class LaminaMenu extends JPanel{
	
	public LaminaMenu(){
		
		JMenuBar BarraMenu = new JMenuBar();
		JMenu menuArchivo = new JMenu("Archivo");
		JMenu menuEdicion = new JMenu("Edición");
		JMenu opciones = new JMenu("Opciones");
		JMenuItem Item1menuArchivo = new JMenuItem("Nuevo Archivo");
		JMenuItem Item2menuArchivo = new JMenuItem("Abrir archivo");
		JMenuItem Item3menuArchivo = new JMenuItem("Opciones");
		JMenuItem Item4menuArchivo = new JMenuItem("Salir");
		JMenuItem Item1menuEdicion = new JMenuItem("Copiar", new ImageIcon("src/graficos/copiar.gif"));
		JMenuItem Item2menuEdicion = new JMenuItem("Pegar", new ImageIcon("src/graficos/pegar.gif"));
		JMenuItem Item3menuEdicion = new JMenuItem("Cortar", new ImageIcon("src/graficos/cortar.gif"));
		JMenuItem Item4menuEdicion = new JMenuItem("Seleccionar todo", new ImageIcon("src/graficos/selTodo.png"));
		//Item4menuEdicion.setHorizontalTextPosition(SwingConstants.LEFT); //Coloca texto a la izquierda de imagen
		JMenuItem Item1menuOpciones = new JMenuItem("Atras");
		JMenuItem Item2menuOpciones = new JMenuItem("Adelante");
				
		menuArchivo.add(Item1menuArchivo);
		menuArchivo.add(Item2menuArchivo);
		menuArchivo.add(Item3menuArchivo);
		menuArchivo.add(Item4menuArchivo);
		menuEdicion.add(Item1menuEdicion);
		menuEdicion.add(Item2menuEdicion);
		menuEdicion.add(Item3menuEdicion);
		menuEdicion.add(Item4menuEdicion);
		menuEdicion.addSeparator();
		menuEdicion.add(opciones);
		opciones.add(Item1menuOpciones);
		opciones.add(Item2menuOpciones);
		BarraMenu.add(menuArchivo);
		BarraMenu.add(menuEdicion);	
		add(BarraMenu);
		
	}
}








