package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CampoTexto {

	public static void main(String[] args) {
		
		MarcoTexto marco = new MarcoTexto();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}

}

class MarcoTexto extends JFrame{
	
	public MarcoTexto(){
		
		setBounds(250,150,600,400);
		setTitle("Campo de texto");
		LaminaTexto lamina = new LaminaTexto();
		add(lamina);	
	}
}

class LaminaTexto extends JPanel{
	
	public LaminaTexto(){
		
		setLayout(new BorderLayout());		//Configura los layout de las dos láminas utilizadas
		JPanel lamina2 = new JPanel();
		lamina2.setLayout(new FlowLayout());
		
		JLabel texto1 = new JLabel("Email: ");		//Instancia los objetos que utiliza sobre las láminas
		mensaje = new JLabel("",JLabel.CENTER);
		campo1 = new JTextField(20);
		JButton boton = new JButton("Ingresar");
		
		add(lamina2,BorderLayout.NORTH);		
		add(mensaje,BorderLayout.CENTER);	//Agrega los objetos sobre las láminas correspondientes
		lamina2.add(texto1);		
		lamina2.add(campo1);	
		lamina2.add(boton);
		
		DameTexto evento = new DameTexto();
		boton.addActionListener(evento);	
				
	}
	
	private class DameTexto implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			String correo = campo1.getText().trim();
			int arroba = 0, punto = 0;		
			for(int i=0; i<correo.length();i++){
				
				if(correo.charAt(i)=='@'){					
					arroba++;					
					
					for(int j=i; j<correo.length();j++){
						
						if(correo.charAt(j)=='.'){							
							punto++;
						}
					}
				}				
			}
			
			if(arroba==1 && punto>=1){
				
				mensaje.setText("Correcto");
				System.out.println(campo1.getText().trim());
			}
			else{
				mensaje.setText("Incorrecto");
				System.out.println("Por favor ingrese un correo válido");
			}			
			
		}		
		
	}
	
	private JTextField campo1;
	JLabel mensaje;
}