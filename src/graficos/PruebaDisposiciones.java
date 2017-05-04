package graficos;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PruebaDisposiciones {

	public static void main(String[] args) {
		
		MarcoCaja marco = new MarcoCaja();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}

}

class MarcoCaja extends JFrame{
	
	public MarcoCaja(){
		
		setBounds(250,150,600,400);
		setTitle("Procesador de textos 2");
		LaminaCaja lamina = new LaminaCaja();
		add(lamina);				
	}
}

class LaminaCaja extends JPanel{
	
	public LaminaCaja(){
		
		setLayout(new BorderLayout());
		JLabel rotulo1 = new JLabel("Usuario");
		JTextField texto1 = new JTextField(10);
		texto1.setMaximumSize(texto1.getPreferredSize());
		Box cajaH1 = Box.createHorizontalBox();
		cajaH1.add(rotulo1);
		cajaH1.add(Box.createHorizontalStrut(10));
		cajaH1.add(texto1);			
		
		JLabel rotulo2 = new JLabel("Contraseña");
		JTextField texto2 = new JTextField(10);
		texto2.setMaximumSize(texto2.getPreferredSize());
		Box cajaH2 = Box.createHorizontalBox();
		cajaH2.add(rotulo2);
		cajaH2.add(Box.createHorizontalStrut(10));
		cajaH2.add(texto2);			
		
		JButton boton1 = new JButton("OK");
		JButton boton2 = new JButton("Cancelar");
		Box cajaH3 = Box.createHorizontalBox();
		cajaH3.add(boton1);
		//cajaH3.add(Box.createGlue());
		cajaH3.add(boton2);		
		
		Box cajaVer = Box.createVerticalBox();
		cajaVer.add(cajaH1);
		cajaVer.add(cajaH2);
		cajaVer.add(cajaH3);
		add(cajaVer, BorderLayout.CENTER);		
	}
	
	
}














