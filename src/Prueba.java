import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Prueba {	
	
	public static void main(String[] args) throws Exception{		
		
		int num = 4;
		long resultado = sumaFibonacci(num);
		System.out.println("La suma de los primeros " + num + " numeros es " + resultado);
				
	}
	
	static long sumaFibonacci (int n){
		
		if(n==1){
			return 1;
		}	
	else{
		int inf = 0;
		int sup = 1;
		int x;
		for(int i=2; i<=n; i++){
			x=inf;
			inf=sup;
			sup=x+inf;
		}		
		return sup;
		}
	}
}








