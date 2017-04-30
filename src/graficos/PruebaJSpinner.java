package graficos;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class PruebaJSpinner {

	public static void main(String[] args) {
		
		MarcoSpinner marco = new MarcoSpinner();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}

}

class MarcoSpinner extends JFrame{
	
	public MarcoSpinner(){
		
		setBounds(250,150,600,400);
		setTitle("Campo de texto");
		LaminaSpinner lamina = new LaminaSpinner();
		add(lamina);		
		
	}
}

class LaminaSpinner extends JPanel{
	
	public LaminaSpinner(){
		
		fecha1 = new SpinnerDateModel();
		
		String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio"};
		//String[] meses2 = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		lista = new SpinnerListModel(meses);
		//ModeloSpinner numeros = new ModeloSpinner();
		JSpinner spinner1 = new JSpinner(new SpinnerNumberModel(5,0,10,1){	//Uso de clase interna anónima
			
			public Object getNextValue(){
				
				return super.getPreviousValue();}
			
			public Object getPreviousValue(){
				
				return super.getNextValue();}			
			
		});
		JSpinner spinner2 = new JSpinner(lista);		
		spinner2.setPreferredSize(new Dimension(70,20));	//Ajustar el tamaño del JSpinner
		add(spinner1);
		add(spinner2);
		evento = new EventoSpinner();	
		
	}	
	
	/*private class ModeloSpinner extends SpinnerNumberModel{
		
		public ModeloSpinner(){
			
			super(5,0,10,1);
		}
		
		public Object getNextValue(){
			
			return super.getPreviousValue();}
		
		public Object getPreviousValue(){
			
			return super.getNextValue();}
	}*/
	
	
	private class EventoSpinner implements ChangeListener{
		
		public void stateChanged(ChangeEvent e) {			
			
			
		}
		
		
	}
	
	SpinnerDateModel fecha1;
	SpinnerListModel lista;	
	EventoSpinner evento;	
}





















