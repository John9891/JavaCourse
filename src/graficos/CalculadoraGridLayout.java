/*
 * Este programa rs una calculadora que tiene como fuente de datos el teclado y la pulsación en
 * los botones.
 */

package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class CalculadoraGridLayout {

	public static void main(String[] args) {
		
		MarcoCalculadora marco = new MarcoCalculadora();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}

}

class MarcoCalculadora extends JFrame{
	
	public MarcoCalculadora(){
		
		setBounds(450,200,400,300);
		setTitle("Mi primera calculadora");
		LaminaCalculadora lamina = new LaminaCalculadora();
		add(lamina);		
		//pack();		//Contenedor se adapta al tamaño por defecto de los componentes que tiene en su interior
	}																		
}

class LaminaCalculadora extends JPanel{
	
	public LaminaCalculadora(){
		
		principio = true;
		setLayout(new BorderLayout());
		pantalla = new JButton("0");
		pantalla.setEnabled(false);		//Deshabilita el boton		
		add(pantalla, BorderLayout.NORTH);	
				
		lamina2 = new JPanel();					//Instancia un objeto JPanel
		lamina2.setLayout(new GridLayout(4,4,10,10));	
		add(lamina2, BorderLayout.CENTER);		//Agrega la lámina de los botones como una lámina interna		
		
		AccionTeclado teclado1 = new AccionTeclado("1");
		AccionTeclado teclado2 = new AccionTeclado("2");
		AccionTeclado teclado3 = new AccionTeclado("3");
		AccionTeclado teclado4 = new AccionTeclado("4");
		AccionTeclado teclado5 = new AccionTeclado("5");
		AccionTeclado teclado6 = new AccionTeclado("6");
		AccionTeclado teclado7 = new AccionTeclado("7");
		AccionTeclado teclado8 = new AccionTeclado("8");
		AccionTeclado teclado9 = new AccionTeclado("9");
		AccionTeclado teclado0 = new AccionTeclado("0");
		AccionTeclado tecladopunto = new AccionTeclado(".");
		AccionOperador tecladodiv = new AccionOperador("/");
		AccionOperador tecladomult = new AccionOperador("*");
		AccionOperador tecladorest = new AccionOperador("-");
		AccionOperador tecladoigual = new AccionOperador("=");
		AccionOperador tecladomas = new AccionOperador("+");
		
		
		lamina2.add(new JButton(teclado7));			
		lamina2.add(new JButton(teclado8));		
		lamina2.add(new JButton(teclado9));		
		lamina2.add(new JButton(tecladodiv));		
		lamina2.add(new JButton(teclado4));		
		lamina2.add(new JButton(teclado5));		
		lamina2.add(new JButton(teclado6));		
		lamina2.add(new JButton(tecladomult));		
		lamina2.add(new JButton(teclado1));		
		lamina2.add(new JButton(teclado2));		
		lamina2.add(new JButton(teclado3));		
		lamina2.add(new JButton(tecladorest));		
		lamina2.add(new JButton(tecladopunto));		
		lamina2.add(new JButton(teclado0));		
		lamina2.add(new JButton(tecladoigual));		
		lamina2.add(new JButton(tecladomas));					
		ultima_operacion = "=";
		
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);	//Se crea el mapa de entrada
		
		mapaEntrada.put(KeyStroke.getKeyStroke("1"), "numero1");
		mapaEntrada.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD1,0), "numero1");
		mapaEntrada.put(KeyStroke.getKeyStroke("2"), "numero2");
		mapaEntrada.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD2,0), "numero2");
		mapaEntrada.put(KeyStroke.getKeyStroke("3"), "numero3");
		mapaEntrada.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD3,0), "numero3");
		mapaEntrada.put(KeyStroke.getKeyStroke("4"), "numero4");
		mapaEntrada.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD4,0), "numero4");
		mapaEntrada.put(KeyStroke.getKeyStroke("5"), "numero5");
		mapaEntrada.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD5,0), "numero5");
		mapaEntrada.put(KeyStroke.getKeyStroke("6"), "numero6");
		mapaEntrada.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD6,0), "numero6");
		mapaEntrada.put(KeyStroke.getKeyStroke("7"), "numero7");
		mapaEntrada.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD7,0), "numero7");
		mapaEntrada.put(KeyStroke.getKeyStroke("8"), "numero8");
		mapaEntrada.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD8,0), "numero8");
		mapaEntrada.put(KeyStroke.getKeyStroke("9"), "numero9");
		mapaEntrada.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD9,0), "numero9");
		mapaEntrada.put(KeyStroke.getKeyStroke("0"), "numero0");
		mapaEntrada.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD0,0), "numero0");
		mapaEntrada.put(KeyStroke.getKeyStroke('.'), "numero.");		
		mapaEntrada.put(KeyStroke.getKeyStroke('/'), "numero/");
		mapaEntrada.put(KeyStroke.getKeyStroke('*'), "numero*");
		mapaEntrada.put(KeyStroke.getKeyStroke('-'), "numero-");
		mapaEntrada.put(KeyStroke.getKeyStroke('='), "numero=");	
		mapaEntrada.put(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER,0), "numero=");
		mapaEntrada.put(KeyStroke.getKeyStroke('+'), "numero+");
		
		
		ActionMap mapaAccion = getActionMap();
		mapaAccion.put("numero1", teclado1);	//Asocia el objeto a una acción
		mapaAccion.put("numero2", teclado2);
		mapaAccion.put("numero3", teclado3);
		mapaAccion.put("numero4", teclado4);
		mapaAccion.put("numero5", teclado5);
		mapaAccion.put("numero6", teclado6);
		mapaAccion.put("numero7", teclado7);
		mapaAccion.put("numero8", teclado8);
		mapaAccion.put("numero9", teclado9);
		mapaAccion.put("numero0", teclado0);
		mapaAccion.put("numero.", tecladopunto);	
		mapaAccion.put("numero/", tecladodiv);
		mapaAccion.put("numero*", tecladomult);
		mapaAccion.put("numero-", tecladorest);
		mapaAccion.put("numero=", tecladoigual);
		mapaAccion.put("numero+", tecladomas);
	}	
	
	private class AccionTeclado extends AbstractAction{
		
		public AccionTeclado(String numero){
			
			putValue(Action.NAME, numero);
		}
		
		public void actionPerformed(ActionEvent e) {			
			
			String entrada = e.getActionCommand();						
			
			if(principio){
				pantalla.setText("");
				principio=false;
			}
			
			if(entrada.equals(".") && punto==0){				
				punto++;			
				pantalla.setText(pantalla.getText() + entrada);
			}
			
			else if(entrada.equals(".") && punto>0){
				pantalla.setText(pantalla.getText());				
			}
			else{
				pantalla.setText(pantalla.getText() + entrada);
			}
						
		}		
	}
	
	private class AccionOperador extends AbstractAction{
		
		public AccionOperador(String operador){
			
			putValue(Action.NAME, operador);
		}
		
		public void actionPerformed(ActionEvent e) {
			
			punto = 0;
			String operador = e.getActionCommand();		//Almacena la operacion ingresada	
			calcular(Double.parseDouble(pantalla.getText()));	//Pasa al método lo que hay en el display	
			ultima_operacion = operador;		//Almacena el último operador pulsado
			principio = true;
		}
		
		public void calcular(double x){
			
			if(ultima_operacion.equals("+")){
				
				resultado+=x;								
			}
			else if(ultima_operacion.equals("=")){
				
				resultado=x;					
			}
			else if(ultima_operacion.equals("-")){
				
				resultado-=x;
				System.out.println(resultado);
			}
			else if(ultima_operacion.equals("*")){
				
				resultado*=x;									
			}
			else if(ultima_operacion.equals("/")){
				
				resultado/=x;									
			}
			pantalla.setText(" " + resultado);				
		}		
		
	}	
	
	private JPanel lamina2;
	private JButton pantalla;
	private boolean principio;
	private double resultado;
	private String ultima_operacion;	
	private int punto = 0;
}











