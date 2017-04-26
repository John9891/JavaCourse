package poo;

import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {		
		
		Jefatura jefe_RRHH = new Jefatura("Federico Grisales", 18000, 2011, 8, 26);
		jefe_RRHH.fija_incentivo(1500);		
		
		Empleado [] misEmpleados = new Empleado[6];
		
		misEmpleados[0] = new Empleado ("Oscar Contreras", 12000, 2014, 5, 23);
		misEmpleados[1] = new Empleado ("Ana Suárez", 11000, 2016, 7, 8);
		misEmpleados[2] = new Empleado ("Carlos Pérez", 14000, 2011, 3, 16);	
		misEmpleados[3] = new Empleado ("Fernando Lozada");
		misEmpleados[4] = jefe_RRHH;	//Polimorfismo
		misEmpleados[5] = new Jefatura ("Andrea López", 20000, 2003, 1, 12);
		
		Jefatura jefe_finanzas = (Jefatura)misEmpleados[5]; //Casting o refundición de objetos
		jefe_finanzas.fija_incentivo(20000);		
		misEmpleados[5].dameSueldo();		 
		
		System.out.println(jefe_finanzas.tomar_decisiones("Cambiar hora de la reunión"));
		
		System.out.println("El jefe de finanzas gana: " + jefe_finanzas.establece_bonus(1000));
		System.out.println("El empleado: " + misEmpleados[2].dameNombre() + 
				" gana un total de " + misEmpleados[2].establece_bonus(1000));
		
		for(Empleado e: misEmpleados){
			e.aumentaSueldo(5);			
		}
		
		Arrays.sort(misEmpleados);
		
		for(Empleado e: misEmpleados){
			
			System.out.println("Nombre: " + e.dameNombre() + " Sueldo: " +
			e.dameSueldo() + " Fecha de Alta: " + e.dameAlta());
		}

	}

}

class Empleado implements Comparable, Trabajadores{
	
	public Empleado(String nom, double sue, int agno, int mes, int dia){
		
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		altaContrato = calendario.getTime();		
	}
	
	public Empleado(String nom){
		
		this(nom, 30000, 2010, 11, 25);
	}
	
	public double establece_bonus(double gratificacion){
		
		return Trabajadores.bonus_base + gratificacion;
	}
	
	public String dameNombre(){	//getter
		
		return nombre;
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
	
	public int compareTo(Object miObjeto){
		
		Empleado otroEmpleado = (Empleado) miObjeto;
		
		if(this.sueldo < otroEmpleado.sueldo){
			return -1;
		}
		else if(this.sueldo > otroEmpleado.sueldo){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	private String nombre;
	protected double sueldo;
	private Date altaContrato;	
	
}

class Jefatura extends Empleado implements Jefes{	
	
	private double incentivo;
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia){
		
		super(nom, sue, agno, mes, dia);
	}
	
	public String tomar_decisiones(String decision){
		
		return "Un miembro de la dirección ha tomado la decisión de: " + decision;
	}
	
	public double establece_bonus(double gratificacion){
		
		double prima = 2000;
		return Trabajadores.bonus_base + gratificacion + prima;
	}
	
	public void fija_incentivo(double b){	//setter
		
		incentivo = b;
	}
	
	public double dameSueldo(){		//getter
		
		double sueldo_jefe = super.dameSueldo();		
		sueldo = sueldo_jefe + incentivo;
		return sueldo;
	}	
	
	
}
