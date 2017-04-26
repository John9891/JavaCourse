package graficos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.JFrame;

public class EventosFocoVentana extends JFrame implements WindowFocusListener{

	public static void main(String[] args) {
		
		EventosFocoVentana foco = new EventosFocoVentana();
		foco.iniciar();

	}
	
	public void iniciar(){
		
		marco1 = new EventosFocoVentana();
		marco2 = new EventosFocoVentana();
		
		marco1.setVisible(true);
		marco2.setVisible(true);
		
		marco1.setBounds(100,200,600,400);
		marco2.setBounds(700,200,600,400);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		marco1.addWindowFocusListener(this);
		marco2.addWindowFocusListener(this);
		
	}
	
	EventosFocoVentana marco1;
	EventosFocoVentana marco2;
	
	public void windowGainedFocus(WindowEvent e) {
		
		if (e.getSource()==marco1){
			
			marco1.setTitle("He ganado el foco");			
		}
		else if(e.getSource()==marco2){
			
			marco2.setTitle("He ganado el foco");
		}				
		
	}
	
	public void windowLostFocus(WindowEvent e) {
		
		if (e.getSource()==marco1){
			
			marco1.setTitle("He perdido el foco");			
		}
		else if(e.getSource()==marco2){
			
			marco2.setTitle("He perdido el foco");
		}		
		
	}

}
