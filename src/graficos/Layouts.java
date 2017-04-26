package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts {

	public static void main(String[] args) {
		
		MarcoLayout marco = new MarcoLayout ();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}

}

class MarcoLayout extends JFrame{
	
	public MarcoLayout(){
		
		setBounds(200,150,600,400);
		setTitle("Mi marco con multiples fuentes");		
		PanelBorderLayout lamina1 = new PanelBorderLayout();
		PanelFlowLayout lamina2 = new PanelFlowLayout();
		add(lamina1,BorderLayout.NORTH);
		add(lamina2,BorderLayout.CENTER);	
		
		//FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		
	}																		
}

class PanelBorderLayout extends JPanel{
	
	public PanelBorderLayout(){
					
		setLayout(new BorderLayout(20,20));
		add(new JButton("Amarillo"), BorderLayout.CENTER);
		add(new JButton("Azul"), BorderLayout.EAST);
		add(new JButton("Rojo"), BorderLayout.WEST);
		add(new JButton("Verde"), BorderLayout.SOUTH);
		add(new JButton("Naranja"), BorderLayout.NORTH);		
		
	}
}

class PanelFlowLayout extends JPanel{
	
	public PanelFlowLayout(){
		
		setLayout( new FlowLayout(FlowLayout.LEFT, 30, 5));	//Configura el flowlayout a partir de
		add(new JButton("Amarillo"));						//los parámetros configurados en la instancia
		add(new JButton("Azul"));
		add(new JButton("Rojo"));
		
	}
}









