import java.util.*;

public class Uso_tallas {

	public static void main(String[] args) {
		
				Scanner entrada = new Scanner(System.in);
				
				System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, EXTRAGRANDE");
				
				String entrada_datos = entrada.next().toUpperCase();
				
				Talla la_talla = Enum.valueOf(Talla.class, entrada_datos);
				
				System.out.println("Talla: " + la_talla);
				System.out.println("Abreviatura: " + la_talla.abreviatura);

	}	
	
	//enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE};
	enum Talla{
		
		MINI("S"), MEDIANO("M"), GRANDE("G"), EXTRAGRANDE("XL");
		
		private Talla(String abreviatura){
			
			this.abreviatura = abreviatura;
		}
		
		public String dameAbreviatura(){
			
			return "La abreviatura es " + abreviatura;
		}
		
		private String abreviatura;
	}

}
