package graficos;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.*;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		
		marcoCentrado marco2 = new marcoCentrado();
		marco2.setVisible(true);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//marco2.setIconImage(mi_icono);					

	}

}

class marcoCentrado extends JFrame{
	
	public marcoCentrado(){
		
		Toolkit mipantalla=Toolkit.getDefaultToolkit();		
		Dimension tamanoPantalla = mipantalla.getScreenSize();
		int alto = tamanoPantalla.height;
		int ancho = tamanoPantalla.width;
		setSize(ancho / 2, alto/2);
		setLocation(ancho/4, alto/4);
		setTitle("Mi marco Centrado");
		Image mi_icono = mipantalla.getImage("src/graficos/cali.png");
		setIconImage(mi_icono);
	}
}