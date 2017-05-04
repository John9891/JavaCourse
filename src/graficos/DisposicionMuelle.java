package graficos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class DisposicionMuelle {

	public static void main(String[] args) {
		
		MarcoMuelle marco = new MarcoMuelle();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);


	}

}

class MarcoMuelle extends JFrame{
	
	public MarcoMuelle(){
		
		setBounds(250,150,600,400);
		setTitle("Disposición en muelle");
		LaminaMuelle lamina = new LaminaMuelle();
		add(lamina);				
	}
}


class LaminaMuelle extends JPanel{
	
	public LaminaMuelle(){
		
		JButton boton1 = new JButton("Boton1");
		JButton boton2 = new JButton("Boton2");
		JButton boton3 = new JButton("Boton3");
		add(boton1);
		add(boton2);
		add(boton3);
		SpringLayout layout = new SpringLayout();
		setLayout(layout);
		Spring muelle = Spring.constant(0, 10, 100);
		Spring muelleRig = Spring.constant(10);	//Muelle rigido para colocar entre botones
		layout.putConstraint(SpringLayout.WEST, boton1, muelle, SpringLayout.WEST, this);		
		layout.putConstraint(SpringLayout.WEST, boton2, muelleRig, SpringLayout.EAST, boton1);
		layout.putConstraint(SpringLayout.WEST, boton3, muelleRig, SpringLayout.EAST, boton2);
		layout.putConstraint(SpringLayout.EAST, this, muelle, SpringLayout.EAST, boton3);
		
	}
}









