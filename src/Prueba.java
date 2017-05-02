import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Prueba {
	
	
	public static void main(String[] args) throws IOException {		
		
		final int NUM = 10;
		BufferedReader entrada = new BufferedReader(
		new InputStreamReader(System.in));
		int nums[]= new int[NUM];
		int total = 1;
		System.out.println("Por favor, introduzca " + NUM + " datos");
		for (int i = 0; i < NUM; i++)
		{
		nums[i] = Integer.parseInt(entrada.readLine());
		}
		System.out.print("\nLista de números: ");
		for (int i = 0; i < NUM; i++)
		{
		System.out.print(" " + nums[i]);
		total *= nums[i];
		}
		System.out.println("\nEl producto de los números es " + total);
		
	}
}





