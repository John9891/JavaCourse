package graficos;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PruebaSliders {

	public static void main(String[] args) {
		
		MarcoSliders marco = new MarcoSliders();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}

}

class MarcoSliders extends JFrame{
	
	public MarcoSliders(){
		
		setBounds(250,150,600,400);
		setTitle("Campo de texto");
		LaminaSliders lamina = new LaminaSliders();
		add(lamina);	
	}
}

class LaminaSliders extends JPanel{
	
	public LaminaSliders(){
		
		setLayout(new BorderLayout());
		JPanel laminaSlider = new JPanel();
		add(laminaSlider, BorderLayout.NORTH);
		
		Font letra = new Font("Serif", Font.PLAIN, 24);
		etiqueta = new JLabel("En un lugar de la mancha");
		etiqueta.setFont(letra);
		slider1  = new JSlider();
		slider1.setMajorTickSpacing(25);
		slider1.setMinorTickSpacing(10);
		slider1.setPaintLabels(true);		//Show the number on the JSlider
		slider1.setPaintTicks(true);		//Show the ticks of the JSlider		
		slider1.setFont(new Font("Serif", Font.BOLD, 12));
		//slider1.setSnapToTicks(true);		//Mover JSlider to the tick more near
		laminaSlider.add(slider1);
		add(etiqueta,BorderLayout.CENTER);
		
		EventoSlider evento = new EventoSlider();
		slider1.addChangeListener(evento);
	}
	
	private class EventoSlider implements ChangeListener{

		
		public void stateChanged(ChangeEvent e) {
			
			int valor = slider1.getValue();
			etiqueta.setText("El valor actual es " + valor);
			etiqueta.setFont(new Font("Serif", Font.BOLD, valor));			
		}				
	}
	
	JSlider slider1;
	JLabel etiqueta;
}














