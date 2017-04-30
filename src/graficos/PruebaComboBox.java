package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PruebaComboBox {

	public static void main(String[] args) {
		
		MarcoPruebaCombo marco = new MarcoPruebaCombo();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}

}

class MarcoPruebaCombo extends JFrame{
	
	public MarcoPruebaCombo(){
		
		setBounds(250,150,600,400);
		setTitle("Prueba de comboBox");
		LaminaPruebaCombo lamina = new LaminaPruebaCombo();
		add(lamina);
	}
}

class LaminaPruebaCombo extends JPanel{
	
	public LaminaPruebaCombo(){
		
		setLayout(new BorderLayout());
		Font letra = new Font("Serif", Font.PLAIN, 24);
		etiqueta = new JLabel("En un lugar de la mancha");
		etiqueta.setFont(letra);
		JPanel laminaCombo = new JPanel();		
		add(etiqueta,BorderLayout.CENTER);
		add(laminaCombo, BorderLayout.NORTH);
		
		combo1 = new JComboBox();
		combo1.setEditable(true);
		combo2 = new JComboBox();
		combo2.setEditable(true);
		combo1.addItem("Lunes");
		combo1.addItem("Martes");
		combo1.addItem("Miércoles");
		combo2.addItem("Serif");
		combo2.addItem("SansSerif");
		combo2.addItem("Monospaced");
		combo2.addItem("Dialog");
		laminaCombo.add(combo1);
		laminaCombo.add(combo2);
		EventoCombo evento = new EventoCombo();
		combo1.addActionListener(evento);
		combo2.addActionListener(evento);
		
	}
	
	private class EventoCombo implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			String dia = (String) combo1.getSelectedItem();
			String tipoLetra = (String) combo2.getSelectedItem();			
			
			etiqueta.setText("Hoy es " + dia);
			etiqueta.setFont(new Font(tipoLetra, 0, 24));			
		}		
		
	}	
	
	private JComboBox combo1;
	private JComboBox combo2;
	private JLabel etiqueta;
}









