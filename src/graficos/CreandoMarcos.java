package graficos;
import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		
		miMarco marco1 = new miMarco();		
		marco1.setBounds(0, 0, 500, 300);
		marco1.setLocationRelativeTo(null);		//Centra frame en cualquier plataforma
		marco1.setTitle("Este es mi primer frame");
		//marco1.setResizable(false);
		//marco1.setExtendedState(Frame.MAXIMIZED_BOTH);	//Pantalla completa

	}

}

class miMarco extends JFrame{
	
	public miMarco(){
		
		//setSize(500, 300);
		setVisible(true);	//Necesario para visualizar el frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//Qué hacer cuando se cierra el frame
		
	}
}
