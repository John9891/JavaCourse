package graficos;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class PruebaDibujo {

	public static void main(String[] args) {
		
		MarcoConDibujos dibujo1 = new MarcoConDibujos();
		dibujo1.setVisible(true);
		dibujo1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConDibujos extends JFrame{
	
	public MarcoConDibujos(){
		
		setTitle("Prueba de dibujo");
		setBounds(300,200,600,400);
		LaminaConDibujos lamina = new LaminaConDibujos();
		add(lamina);
	}
}

class LaminaConDibujos extends JPanel{
	
	public void paintComponent (Graphics g){
		
		super.paintComponent(g);
		//g.drawRect(0, 0, 100, 50);
		//g.fillRect(0, 0, 100, 50);
		//g.fillRoundRect(0, 0, 100, 50, 50, 50);
		//g.drawArc(100, 50, 200, 200, 0, 270);
		
		//Utilizando la clase Java2D
		Graphics2D grafica = (Graphics2D) g;	//Refundición de "g" de tipo graphics a graphics2D
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150); 
		grafica.draw(rectangulo);
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);	//Ajusta las dimensiones de la elipse dentro del rectangulo
		grafica.draw(elipse);
		/*grafica.draw(new Line2D.Double(100, 100, 300, 250));
		double centroX = rectangulo.getCenterX();
		double centroY = rectangulo.getCenterY();
		double radio = Math.hypot(rectangulo.getWidth(), rectangulo.getHeight()) / 2;
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(centroX, centroY, centroX+radio, centroY+radio);
		grafica.draw(circulo);*/
		
		
		
	}
}
