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
		
		ConfiguraMenu("Arial", "tipo", "Arial", 10, 10,"");
		ConfiguraMenu("Verdana", "tipo", "Verdana", 10, 10,"");
		ConfiguraMenu("Courier", "tipo", "Courier", 10, 10,"");
		ConfiguraMenu("Times New Roman", "tipo", "Times New Roman", 10, 10,"");
		//*****************************************************************************
		ConfMenuEstilo("Negrita", "src/graficos/negrita.jpg", new StyledEditorKit.BoldAction(),KeyEvent.VK_B);
		ConfMenuEstilo("Cursiva", "src/graficos/cursiva.jpg", new StyledEditorKit.ItalicAction(),KeyEvent.VK_K);				
		//*****************************************************************************
		ButtonGroup grupoTamagno = new ButtonGroup();
		ConfMenuTam("10", 10,grupoTamagno,KeyEvent.VK_A);
		ConfMenuTam("14", 14,grupoTamagno,KeyEvent.VK_E);
		ConfMenuTam("18", 18,grupoTamagno,KeyEvent.VK_F);
		ConfMenuTam("24", 24,grupoTamagno,KeyEvent.VK_D);			
		
		Area1 = new JTextPane();		
		add(Area1);			
		
		JPopupMenu Emergente = new JPopupMenu();
		JMenuItem NegritaE = new JMenuItem("Negrita");
		JMenuItem CursivaE = new JMenuItem("Cursiva");		
		Emergente.add(NegritaE);
		Emergente.add(CursivaE);		
		Area1.setComponentPopupMenu(Emergente);
		NegritaE.addActionListener(new StyledEditorKit.BoldAction());
		CursivaE.addActionListener(new StyledEditorKit.ItalicAction());	
	}
	
	public void ConfMenuEstilo(String rotulo, String icono, ActionListener oyente, int atajo){
		JCheckBoxMenuItem elemento = new JCheckBoxMenuItem("Negrita",new ImageIcon(icono));
		MenuEstilo.add(elemento);
		elemento.addActionListener(oyente);
		elemento.setAccelerator(KeyStroke.getKeyStroke(atajo, InputEvent.CTRL_DOWN_MASK));
	}
	
	public void ConfMenuTam(String rotulo, int tamagno, ButtonGroup grupo, int atajo){		
		JRadioButtonMenuItem elemento = new JRadioButtonMenuItem(rotulo);
		grupo.add(elemento);
		MenuTamagno.add(elemento);
		elemento.addActionListener(new StyledEditorKit.FontSizeAction("", tamagno));
		elemento.setAccelerator(KeyStroke.getKeyStroke(atajo, InputEvent.CTRL_DOWN_MASK));
	}
	
	public void ConfiguraMenu(String rotulo, String menu, String tipo_letra, int estilo, int tamagno, String rutaIcon){
		
		JMenuItem elemento = new JMenuItem(rotulo, new ImageIcon(rutaIcon));
		switch(menu){
		case("tipo"):
			MenuTipo.add(elemento);
			elemento.addActionListener(new StyledEditorKit.FontFamilyAction("", tipo_letra));		
		break;
		}		
		
	}	
	
	private JTextPane Area1;
	private JMenu MenuTipo, MenuEstilo, MenuTamagno;
	private Font fuenteActual, fuente2;
			
	
}