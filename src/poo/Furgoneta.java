package poo;

public class Furgoneta extends Coche{
	
	private int capacidad_carga;
	private int asientos_extra;
	
	public Furgoneta(int capacidad_carga, int asientos_extra){
		
		super();	//Llamar al constructor de la clase padre
		this.capacidad_carga = capacidad_carga;
		this.asientos_extra = asientos_extra;			
	}
	
	public String entrega_datos_furgoneta(){	//Getter
		
		return "La capacidad de carga es " + capacidad_carga + " y los asientos extra son " +
		asientos_extra;
	}


}
