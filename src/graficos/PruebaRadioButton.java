package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaRadioButton {

	public static void main(String[] args) {
		
		MarcoPruebaButton marco = new MarcoPruebaButton();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}

}


class MarcoPruebaButton extends JFrame{
	
	public MarcoPruebaButton(){
		
		setBounds(250,150,600,400);
		setTitle("Campo de texto");
		LaminaPruebaButton lamina = new LaminaPruebaButton();
		add(lamina);
	}
}

class LaminaPruebaButton extends JPanel{
	
	public LaminaPruebaButton(){
		
		setLayout(new BorderLayout());
		Font letra = new Font("Serif", Font.PLAIN, 24);
		etiqueta = new JLabel("Estamos avanzando a paso seguro");
		etiqueta.setFont(letra);
		JPanel laminaTexto = new JPanel();
		laminaTexto.add(etiqueta);
		add(laminaTexto, BorderLayout.CENTER);
		
		JPanel laminaBotones = new JPanel(); 
		ButtonGroup grupoTamano = new ButtonGroup();
		ButtonGroup grupoTipo = new ButtonGroup();
		boton1 = new JRadioButton("Grande", false);
		boton2 = new JRadioButton("Pequeño", true);
		boton3 = new JRadioButton("Cursiva", false);
		boton4 = new JRadioButton("Negrita", true);
		grupoTamano.add(boton1);
		grupoTamano.add(boton2);
		grupoTipo.add(boton3);
		grupoTipo.add(boton4);
		laminaBotones.add(boton1);
		laminaBotones.add(boton2);
		laminaBotones.add(boton3);
		laminaBotones.add(boton4);
		add(laminaBotones, BorderLayout.SOUTH);
		
		EventoTam evento = new EventoTam();		
		boton1.addActionListener(evento);
		boton2.addActionListener(evento);
		boton3.addActionListener(evento);
		boton4.addActionListener(evento);
		
	}
	
	private class EventoTam implements ActionListener{

	
		public void actionPerformed(ActionEvent e) {
			
			if(boton1.isSelected()){
				
				if(boton3.isSelected()){
					etiqueta.setFont(new Font("Serif", Font.ITALIC, 34));
				}
				else{
					etiqueta.setFont(new Font("Serif", 0, 34));
				}				
			}
			else{
				if(boton3.isSelected()){
					etiqueta.setFont(new Font("Serif", Font.ITALIC, 14));
				}
				else{
					etiqueta.setFont(new Font("Serif", 0, 14));
				}
				
			}
			
		}	
		
	}	
	
	private JLabel etiqueta;
	private JRadioButton boton1, boton2, boton3, boton4;	
	
}














