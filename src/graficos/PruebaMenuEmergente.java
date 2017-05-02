package graficos;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class PruebaMenuEmergente {

	public static void main(String[] args) {
		
		MarcoEmergente marco = new MarcoEmergente();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}

}

class MarcoEmergente extends JFrame{
	
	public MarcoEmergente(){
		
		setBounds(250,150,600,400);
		setTitle("Marco con menú emergente");
		LaminaEmergente lamina = new LaminaEmergente();
		add(lamina);				
	}
}

class LaminaEmergente extends JPanel{
	
	public LaminaEmergente(){
		
		JPopupMenu Emergente = new JPopupMenu();
		JMenuItem Opcion1 = new JMenuItem("Abrir");
		JMenuItem Opcion2 = new JMenuItem("Nuevo");
		JMenuItem Opcion3 = new JMenuItem("Cerrar");
		Emergente.add(Opcion1);
		Emergente.add(Opcion2);
		Emergente.add(Opcion3);
		setComponentPopupMenu(Emergente);
		
	}
}















