package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;

//import graficos.LaminaProcesador.GestionarEventos;

public class ProcesadorTextosII {

	public static void main(String[] args) {
		
		MarcoProcesadorII marco = new MarcoProcesadorII();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}

}

class MarcoProcesadorII extends JFrame{
	
	public MarcoProcesadorII(){
		
		setBounds(250,150,600,400);
		setTitle("Procesador de textos 2");
		LaminaProcesadorII lamina = new LaminaProcesadorII();
		add(lamina);				
	}
}

class LaminaProcesadorII extends JPanel{
	
	public LaminaProcesadorII(){
		
		setLayout(new BorderLayout());
		JPanel laminaMenu = new JPanel();
		add(laminaMenu, BorderLayout.NORTH);
		
		JMenuBar BarraMenu1 = new JMenuBar();		
		laminaMenu.add(BarraMenu1);
		
		MenuTipo = new JMenu("Tipo");
		MenuEstilo = new JMenu("Estilo");
		MenuTamagno = new JMenu("Tamaño");
		BarraMenu1.add(MenuTipo);
		BarraMenu1.add(MenuEstilo);
		BarraMenu1.add(MenuTamagno);
		
		ConfiguraMenu("Arial", "tipo", "Arial", 10, 10);
		ConfiguraMenu("Verdana", "tipo", "Verdana", 10, 10);
		ConfiguraMenu("Courier", "tipo", "Courier", 10, 10);
		ConfiguraMenu("Times New Roman", "tipo", "Times New Roman", 10, 10);
		//*****************************************************************************
		ConfiguraMenu("Negrita", "estilo", "", Font.BOLD, 0);
		ConfiguraMenu("Cursiva", "estilo", "", Font.ITALIC, 0);
		ConfiguraMenu("Normal", "estilo", "", 0, 0);
		//*****************************************************************************
		ConfiguraMenu("10", "tamagno", "", 0, 10);
		ConfiguraMenu("14", "tamagno", "", 0, 14);
		ConfiguraMenu("18", "tamagno", "", 0, 18);
		ConfiguraMenu("24", "tamagno", "", 0, 24);		
		
		Area1 = new JTextPane();		
		add(Area1);					
		
	}
	
	public void ConfiguraMenu(String rotulo, String menu, String tipo_letra, int estilo, int tamagno){
		
		JMenuItem elemento = new JMenuItem(rotulo);
		switch(menu){
		case("tipo"):
			MenuTipo.add(elemento);
			elemento.addActionListener(new StyledEditorKit.FontFamilyAction("", tipo_letra));		
		break;
		case("estilo"):
			MenuEstilo.add(elemento);
			if(estilo==Font.BOLD){
				elemento.addActionListener(new StyledEditorKit.BoldAction());}
			else if(estilo==Font.ITALIC){
				elemento.addActionListener(new StyledEditorKit.ItalicAction());}			
		break;
		case("tamagno"):
			MenuTamagno.add(elemento);
			elemento.addActionListener(new StyledEditorKit.FontSizeAction("", tamagno));
		break;}			
		
	}	
	
	private JTextPane Area1;
	private JMenu MenuTipo, MenuEstilo, MenuTamagno;
	private Font fuenteActual, fuente2;
			
	
}