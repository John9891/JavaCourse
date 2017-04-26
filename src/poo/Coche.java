package poo;

public class Coche {
	
	private int ruedas, largo, ancho, motor, peso_plataforma;
	private String color;
	private int peso_total;
	private boolean aire_acond, asientos_cuero;
	
	public Coche(){
		
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
	}
	
	public String entrega_datos(){	//getter
		
		return "El coche tiene " + ruedas + " ruedas, tiene un largo de " + largo/1000 +
				" mts, un ancho de " + ancho + "cms, un motor de " + motor + 
				" cm3 y un peso de " + peso_plataforma + " kgs";		
	}
	
	public void selec_color(String color_coche){	//setter
		
		color = color_coche;
	}
	
	public String entrega_color(){
		
		return "El color del coche es " + color;
	}
	
	public void verificar_asientos(String asientos_cuero){
		
		if(asientos_cuero.equals("si")){			
			this.asientos_cuero = true;
		}
		else{
			this.asientos_cuero = false;
		}
	}
	
	public String entrega_asiento(){
		
		if(asientos_cuero == true){			
			return "El vehículo tiene asientos de cuero";
		}
		else{
			return "El vehículo no tiene asientos de cuero";
		}		
	}
	
	public void verificar_aire(String aire_acond){		
		if(aire_acond.equals("si")){
			this.aire_acond = true;
		}
		else{
			this.aire_acond = false;
		}
	}
	public String entrega_aire(){
		
		if(aire_acond == true){
			
			return "El vehículo tiene aire acondicionado";
		}
		else{
			return "El vehículo no tiene aire acondicionado";
		}
	}
	public String calcula_peso(){	//Setther - Getter
		
		int peso_carroceria = 300;
		peso_total = peso_plataforma + peso_carroceria;
		
		if(asientos_cuero == true){
			peso_total = peso_total + 50;
		}
		if (asientos_cuero == false){
			peso_total = peso_total + 20;
		}
		return "El peso total del coche es " + peso_total;
	}
	public int precio_coche(){
		
		int precio_final = 10000;
		
		if(asientos_cuero == true){
			precio_final += 200;
		}
		if(aire_acond == true){
			precio_final += 500;
		}
		return precio_final;
	}

}
