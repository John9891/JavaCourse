package graficos;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class ColoreaMarco {

	public static void main(String[] args) {
		
		MarcoConColor dibujo2 = new MarcoConColor();
		dibujo2.setVisible(true);
		dibujo2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConColor extends JFrame{
	
	public MarcoConColor(){
		
		setTitle("Prueba de dibujo");
		setBounds(300,200,450,400);
		LaminaConColores lamina2 = new LaminaConColores();
		add(lamina2);
		//lamina2.setBackground(Color.YELLOW);
		lamina2.setBackground(SystemColor.window);	//Color a la lámina por defecto del S.O		
	}
}

class LaminaConColores extends JPanel{
	
	public void paintComponent (Graphics g){
		
		super.paintComponent(g);
		Graphics2D grafica = (Graphics2D) g;	
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150); 
		grafica.setPaint(Color.RED);
		grafica.draw(rectangulo);
		grafica.setPaint(Color.green.darker().darker());			
		grafica.fill(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		grafica.setPaint(new Color(30,120,30).brighter().brighter());
		elipse.setFrame(rectangulo);	
		grafica.fill(elipse);
	}
}

