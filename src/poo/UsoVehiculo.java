package poo;
import javax.swing.*;

public class UsoVehiculo {

	public static void main(String[] args) {
		
		Coche coche1 = new Coche(); //Instanciar una clase	de tipo coche
		coche1.selec_color("verde");
		coche1.verificar_aire("no");
		coche1.verificar_asientos("si");
		
		Furgoneta furgoneta1 = new Furgoneta(1500, 4);
		furgoneta1.selec_color("Blanco");
		furgoneta1.verificar_aire("si");
		furgoneta1.verificar_asientos("no");
		
		System.out.println(coche1.entrega_datos() + " " + coche1.entrega_aire() +
				" " + coche1.entrega_asiento());
		System.out.println(furgoneta1.entrega_datos() + " " + furgoneta1.entrega_aire() +
				" " + "\n" + furgoneta1.entrega_asiento() + furgoneta1.entrega_datos_furgoneta());

	}

}
