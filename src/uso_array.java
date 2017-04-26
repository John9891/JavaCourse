import javax.swing.plaf.synth.SynthSplitPaneUI;

public class uso_array {

	public static void main(String[] args) {
		
		int [] matriz = new int [5];
		int [] matriz2 = {1,2,3,4,5};
		
		for(int i=0; i<5; i++){
			matriz[i] = (int) (Math.random()*100);
			System.out.println(matriz[i]);
		}	
		
	}

}
