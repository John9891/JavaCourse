package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ProcesadorTextos {

	public static void main(String[] args) {
		
		MarcoProcesador marco = new MarcoProcesador();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}
}

class MarcoProcesador extends JFrame{
	
	public MarcoProcesador(){
		
		setBounds(250,150,600,400);
		setTitle("Procesador de textos");
		LaminaProcesador lamina = new LaminaProcesador();
		add(lamina);				
	}
}

 class LaminaProcesador extends JPanel{
	
	public LaminaProcesador(){
		
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
		ConfiguraMenu("Negrita", "estilo", "", 1, 0);
		ConfiguraMenu("Cursiva", "estilo", "", 2, 0);
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
		break;
		case("estilo"):
			MenuEstilo.add(elemento);
		break;
		case("tamagno"):
			MenuTamagno.add(elemento);
		break;}
		elemento.addActionListener(new GestionarEventos(menu, tipo_letra, estilo, tamagno));		
		
	}
	
	private class GestionarEventos implements ActionListener{
		
		String menu, tipo;
		int estilo, tamagno;
		
		public GestionarEventos(String menu, String tipo, int estilo, int tamagno){
			
			this.menu = menu;
			this.tipo = tipo;
			this.estilo = estilo;
			this.tamagno = tamagno;			
		}
		
		public void actionPerformed(ActionEvent e) {
			
			fuenteActual = Area1.getFont();			
			switch(menu){
			case("tipo"):
				Area1.setFont(new Font(tipo, fuenteActual.getStyle(), fuenteActual.getSize()));	
				fuente2 = Area1.getFont();
				System.out.println(fuente2.getFontName() + "" + fuente2.getStyle() +"" + fuente2.getSize());
			break;
			case("estilo"):
				if(fuenteActual.getStyle()==1 || fuenteActual.getStyle()==2){estilo=3;}
				Area1.setFont(new Font(fuenteActual.getFontName(), estilo, fuenteActual.getSize()));
				fuente2 = Area1.getFont();
				System.out.println(fuente2.getFontName() + "" + fuente2.getStyle() +"" + fuente2.getSize());
			break;
			case("tamagno"):
				Area1.setFont(new Font(fuenteActual.getFontName(), fuenteActual.getStyle(), tamagno));
				fuente2 = Area1.getFont();
				System.out.println(fuente2.getFontName() + "" + fuente2.getStyle() +"" + fuente2.getSize());				
			break;
			}										
			
		}	
		
	}
	
	private JTextPane Area1;
	private JMenu MenuTipo, MenuEstilo, MenuTamagno;
	private Font fuenteActual, fuente2;
	private GestionarEventos evento;	
	
}







