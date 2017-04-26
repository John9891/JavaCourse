package graficos;

import javax.swing.JFrame;
import java.awt.event.*;

public class EventosRaton {

	public static void main(String[] args) {
		
		MarcoEventosRaton marco = new MarcoEventosRaton ();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoEventosRaton extends JFrame{
	
	public MarcoEventosRaton(){
		
		setBounds(300,200,600,400);
		setTitle("Mi marco con cambio de estado");
		setVisible(true);
		EventosdeRaton raton = new EventosdeRaton();	//Crea instancia de la clase oyente
		addMouseListener(raton);
		EventosdeRaton raton2 = new EventosdeRaton();	//Crea instancia de la clase oyente
		addMouseMotionListener(raton2);
		
	}
	
}


class EventosdeRaton implements MouseListener, MouseMotionListener{
	
	public void mouseClicked(MouseEvent e) {
		
		//System.out.println("Usted ha hecho clic en la posición " +e.getPoint());
		//System.out.println(e.getClickCount());
		
	}
	
	public void mouseEntered(MouseEvent e) {
		
		System.out.println("Acaba de ingresar");
	}

	public void mouseExited(MouseEvent e) {
		
		System.out.println("Acaba de salir");
	}
	
	public void mousePressed(MouseEvent e) {
		
		System.out.println("Acaba de presionar el mouse");
		System.out.println(e.getModifiersEx());
	}
	
	public void mouseReleased(MouseEvent e) {
	
		System.out.println("Acaba de soltar el mouse");
	}
	
	public void mouseDragged(MouseEvent e) {
		
		
	}
	
	public void mouseMoved(MouseEvent e) {
		
		System.out.println("El mouse se está moviendo");
	}
	
}
