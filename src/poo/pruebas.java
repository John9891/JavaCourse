package poo;

public class pruebas {

	public static void main(String[] args) {
		
		Empleados empleado1 = new Empleados ("Alberto");
		Empleados empleado2 = new Empleados ("José");
		Empleados empleado3 = new Empleados ("Erika");
		
		empleado2.CambiarSeccion("Logística");	
		
		System.out.println(empleado1.devuelveDatos() + "\n" + empleado2.devuelveDatos() + 
				"\n" + empleado3.devuelveDatos() + "\n");
		
		System.out.println(Empleados.dameIdSiguiente());
	}

}

class Empleados{
	
	public Empleados(String nom){
		
		nombre = nom;		
		seccion = "Administración";
		Id = IdSiguiente;
		IdSiguiente++;
	}
	
	public void CambiarSeccion(String nuevoNombre){	//Setter
		
		seccion = nuevoNombre;
	}
	
	
	public String devuelveDatos(){	//Getter
		
		return "El nombre es " + nombre + " . la seccion es " + seccion + " y el Id es " + Id;
	}
	
	public static String dameIdSiguiente(){
		
		return "El ID siguiente es " + IdSiguiente;
	}
	
	
	private final String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente = 1;
}






