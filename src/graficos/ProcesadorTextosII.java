package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.text.StyleConstants;
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
		JPanel laminaTexto = new JPanel();
		add(laminaTexto, BorderLayout.CENTER);
		laminaTexto.setLayout(new BorderLayout());
		
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
		laminaTexto.add(Area1,BorderLayout.CENTER);	
		
		//Emergent menu
		JPopupMenu Emergente = new JPopupMenu();
		JMenuItem NegritaE = new JMenuItem("Negrita");
		JMenuItem CursivaE = new JMenuItem("Cursiva");		
		Emergente.add(NegritaE);
		Emergente.add(CursivaE);		
		Area1.setComponentPopupMenu(Emergente);
		NegritaE.addActionListener(new StyledEditorKit.BoldAction());
		CursivaE.addActionListener(new StyledEditorKit.ItalicAction());
		
		//Toolbar
		barra = new JToolBar();
		barra.setOrientation(1);	//Vertical orientation
		laminaTexto.add(barra, BorderLayout.WEST);		
		ConfBarHer("src/graficos/negrita.jpg").addActionListener(new StyledEditorKit.BoldAction());
		ConfBarHer("src/graficos/cursiva.jpg").addActionListener(new StyledEditorKit.ItalicAction());
		ConfBarHer("src/graficos/subraya.jpg").addActionListener(new StyledEditorKit.UnderlineAction());
		barra.addSeparator();
		ConfBarHer("src/graficos/azul.gif").addActionListener(new StyledEditorKit.ForegroundAction("azul", Color.BLUE));
		ConfBarHer("src/graficos/amarillo.gif").addActionListener(new StyledEditorKit.ForegroundAction("amarillo", Color.YELLOW));
		ConfBarHer("src/graficos/rojo.gif").addActionListener(new StyledEditorKit.ForegroundAction("rojo", Color.RED));
		barra.addSeparator();
		ConfBarHer("src/graficos/izquierda.png").addActionListener(new StyledEditorKit.AlignmentAction("izquierda", StyleConstants.ALIGN_LEFT));
		ConfBarHer("src/graficos/centrada.jpg").addActionListener(new StyledEditorKit.AlignmentAction("izquierda", StyleConstants.ALIGN_CENTER));
		ConfBarHer("src/graficos/derecha.jpg").addActionListener(new StyledEditorKit.AlignmentAction("izquierda", StyleConstants.ALIGN_RIGHT));
		ConfBarHer("src/graficos/justificada.png").addActionListener(new StyledEditorKit.AlignmentAction("justificada", StyleConstants.ALIGN_JUSTIFIED));
	}		

	public JButton ConfBarHer(String ruta){		
		JButton boton = new JButton(new ImageIcon(ruta));
		barra.add(boton);				
		return boton;
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
	//private JButton botonNegrita, botonCursiva, botonSubraya, botonAzul, botonAmarillo, botonRojo, botonIzq,
	//botonCent, botonDer, botonJust;
	private JToolBar barra;
	
}