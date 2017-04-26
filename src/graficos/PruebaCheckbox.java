package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.*;

public class PruebaCheckbox {

	public static void main(String[] args) {
		
		MarcoCheck marco = new MarcoCheck();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}

}

class MarcoCheck extends JFrame{
	
	public MarcoCheck(){
		
		setBounds(250,150,600,400);
		setTitle("Campo de texto");
		LaminaCheck lamina = new LaminaCheck();
		add(lamina);	
	}
}

class LaminaCheck extends JPanel{
	
	public LaminaCheck(){
		
		setLayout(new BorderLayout());
		Font letra = new Font("Serif", Font.PLAIN, 24);
		etiqueta = new JLabel("En un lugar de la mancha");
		etiqueta.setFont(letra);		//Establece un tipo de letra para el texto
		JPanel laminaTexto = new JPanel();
		laminaTexto.add(etiqueta);
		add(laminaTexto, BorderLayout.CENTER);
		
		check1 = new JCheckBox("Negrita");
		check2 = new JCheckBox("Cursiva");
		EventoCheck evento = new EventoCheck();
		check1.addActionListener(evento);
		check2.addActionListener(evento);
		JPanel laminaChecks = new JPanel();
		laminaChecks.add(check1);
		laminaChecks.add(check2);
		add(laminaChecks, BorderLayout.SOUTH);
		
	}
	
	private class EventoCheck implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			int tipo = 0;
			if(check1.isSelected()){
				tipo+=Font.BOLD;
			}
			if(check2.isSelected()){
				tipo+=Font.ITALIC;
			}
			
			etiqueta.setFont(new Font("Serif", tipo, 24));
		}	
		
	}
	
	private JLabel etiqueta;
	private JCheckBox check1, check2;
	
	
	
	
	
}




