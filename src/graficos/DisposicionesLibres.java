package graficos;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DisposicionesLibres {

	public static void main(String[] args) {
		
		MarcoLibre marco = new MarcoLibre();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);		

	}

}

class MarcoLibre extends JFrame{
	
	public MarcoLibre(){
		
		setBounds(250,150,600,400);
		setTitle("Disposición libre");
		LaminaLibre lamina = new LaminaLibre();
		add(lamina);				
	}
}

class LaminaLibre extends JPanel{
	
	public LaminaLibre(){
		
		setLayout(new EnColumnas());	//Free disposition		
		JLabel nombre = new JLabel("Nombre: ");
		JLabel apellido = new JLabel("Apellido: ");
		JTextField c_nombre = new JTextField();
		JTextField c_apellido = new JTextField();
		/*nombre.setBounds(250, 50, 100, 15);
		c_nombre.setBounds(350, 50, 100, 20);
		apellido.setBounds(250, 200, 100, 15);
		c_apellido.setBounds(350, 200, 100, 20);*/		
		add(nombre);
		add(c_nombre);
		add(apellido);		
		add(c_apellido);		
	}
}

class EnColumnas implements LayoutManager{

	public void addLayoutComponent(String arg0, Component arg1) {		
		
	}

	
	public void layoutContainer(Container micontenedor) {
		
		int d = micontenedor.getWidth();		
		int x=d/2;
		int y=20;		
		int contador = 0;
		int n = micontenedor.getComponentCount();
		
		for(int i =0;i<n; i++){
			
			contador++;
			Component c = micontenedor.getComponent(i);
			c.setBounds(x-100, y, 100, 20);
			x+=100;
						
			if(contador%2==0){
				x=d/2;
				y+=40;
			}
		}
		
	}

	
	public Dimension minimumLayoutSize(Container parent) {		
		return null;
	}
	
	public Dimension preferredLayoutSize(Container parent) {
		
		return null;
	}
	
	public void removeLayoutComponent(Component comp) {
		
		
	}
	
	
}
















