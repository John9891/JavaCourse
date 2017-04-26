package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {

	public static void main(String[] args) {
		
		//Empleado ingeniero = new Empleado("Olga Ruíz", 13500, 2001, 12, 30);
		//Alumno estudiante1 = new Alumno("Andrés Ramírez", "Derecho");
		
		Persona [] misPersonas = new Persona[2];
		
		misPersonas[0] = new Empleado2("Olga Ruíz", 13500, 2001, 12, 30);
		misPersonas[1] = new Alumno("Andrés Ramírez", "Derecho");
		
		for(Persona i: misPersonas){
			
			System.out.println("Nombre: " + i.dameNombre() + "\n" + " Descripción: " +
			i.dameDescripcion());
			
		}		

	}

}

abstract class Persona{
	
	public Persona(String nom){
		
		nombre = nom;
	}
	
	public String dameNombre(){
		
		return nombre;
	}
	
	public abstract String dameDescripcion();	
	
	
	private String nombre;	
	
}


class Empleado2 extends Persona{	
	
	public Empleado2(String nom, double sue, int agno, int mes, int dia){
		
		super (nom);
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		altaContrato = calendario.getTime();		
	}	
	
	public String dameDescripcion(){
		
		return "Este empleado tiene un sueldo igual a " + sueldo + " y una fecha de alta " +
		altaContrato;
	}
	
	
	public double dameSueldo(){	//getter
		
		return sueldo;
	}
	
	public Date dameAlta(){	//getter
		
		return altaContrato;
	}
	
	public void aumentaSueldo(double porcentaje){	//setter
		
		double aumento = sueldo * (porcentaje/100);
		sueldo += aumento;
		
	}	
	
	private double sueldo;
	private Date altaContrato;	
	
}


class Alumno extends Persona{
	
	public Alumno(String nom, String carr){
		
		super(nom);		
		carrera = carr;
	}
	
	public String dameDescripcion(){
		
		return "El alumno está estudiando " + carrera; 
	}
	
	private String carrera;	
}
