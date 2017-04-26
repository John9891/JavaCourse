package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaAreaTexto {

	public static void main(String[] args) {
		
		MarcoPruebaArea marco = new MarcoPruebaArea();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}

}

class MarcoPruebaArea extends JFrame{
	
	public MarcoPruebaArea(){
		
		setBounds(250,150,600,400);
		setTitle("Area de texto");		
		setLayout(new BorderLayout());
		laminaBotones = new JPanel();
		areaTexto = new JTextArea(20,20);
		laminaConBarras = new JScrollPane(areaTexto);
		botonInsertar = new JButton("Insertar");
		botonSalto = new JButton("Saltar");		
				 
		
		botonInsertar.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				
				areaTexto.append("En un lugar de la mancha");
			}			
		});
		
		botonSalto.addActionListener(new ActionListener(){

			
			public void actionPerformed(ActionEvent e) {
				
				boolean saltar =! areaTexto.getLineWrap();	//Verifica si hay saltos de línea en el texto
				areaTexto.setLineWrap(saltar);				//y lo realizo, si hay saltos no lo realiza
				
				/*if(saltar){
					botonSalto.setText("Quitar salto");
				}
				else{
					botonSalto.setText("Saltar");
				}*/
				
				botonSalto.setText(saltar ? "Quitar salto" : "Saltar");		//Otra forma de expresar condicional
			}			
			
		});
		
		laminaBotones.add(botonInsertar);
		laminaBotones.add(botonSalto);
		add(laminaBotones, BorderLayout.SOUTH);
		add(laminaConBarras, BorderLayout.NORTH);
		
	}
	
	private JPanel laminaBotones;
	private JButton botonInsertar;
	private JButton botonSalto;
	private JTextArea areaTexto;
	private JScrollPane laminaConBarras;
}



