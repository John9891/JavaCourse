
public class array_for_each {

	public static void main(String[] args) {
		
		String [] ciudades = new String[7];
		
		ciudades[0] = "Bogotá";
		ciudades[1] = "Cali";
		ciudades[2] = "Medellin";
		ciudades[3] = "Bucaramanga";
		ciudades[4] = "Barranquilla";
		ciudades[5] = "Armenia";
		ciudades[6] = "Neiva";
		
		for(String elemento:ciudades){
			
			System.out.println("La ciudad es" + elemento);
		}	

	}

}
