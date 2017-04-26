package graficos;
import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;

public class AgregaImagenMarco {

	public static void main(String[] args) {		
		
		MarcoImagen marco1 = new MarcoImagen();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoImagen extends JFrame{
	
	public MarcoImagen(){
		
		setBounds(300,200,600,400);
		setTitle("Mi marco escrito");
		LaminaImagen lamina1 = new LaminaImagen();		
		add(lamina1);
	}
	
}

class LaminaImagen extends JPanel{
	
	public LaminaImagen(){		
		
		try{
			imagen = ImageIO.read(new File ("src/graficos/cali.png"));		
			
			}
			catch(IOException e){
				System.out.println("La imágen no se encuentra en la ruta especificada");
			}		
	}
	
	public void paintComponent (Graphics g){
		
		super.paintComponent(g);			
				
		int ancho = imagen.getWidth(this);
		int alto = imagen.getHeight(this);
		g.drawImage(imagen, 0, 0, null);		
		for(int i= 0; i<400; i+=alto){
			for(int j =0; j<600; j+=ancho){
				g.copyArea(0, 0, ancho, alto, j, i);
			}
		}		
	}
	private Image imagen;
}

