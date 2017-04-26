package graficos;
import javax.swing.*;
import java.awt.*;


public class escribeMarco {

	public static void main(String[] args) {
		
		marcoConTexto marco3 = new marcoConTexto();
		marco3.setLocationRelativeTo(null);
		marco3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco3.setVisible(true);

	}

}

class marcoConTexto extends JFrame{
	
	public marcoConTexto(){
		
		setBounds(0,0,600,450);
		setTitle("Mi marco escrito");
		lamina lamina1 = new lamina();	
		lamina1.setForeground(Color.yellow);
		add(lamina1);
		
	}
}

class lamina extends JPanel{
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);	//Invocando al método de la superclase
		Graphics2D g2 = (Graphics2D) g;
		Font fuente = new Font("Arial",Font.BOLD,12);
		g2.setFont(fuente);
		g2.setColor(Color.GREEN.darker().darker());
		g2.drawString("Mi primer texto en lámina", 100, 100);
		
		g2.setFont(new Font("Verdana", Font.ITALIC, 18));	//Instancia al objeto Font dentro del método
		g2.setColor(Color.blue);
		g2.drawString("Esta es mi segunda frase", 100, 200);
		
	}
}