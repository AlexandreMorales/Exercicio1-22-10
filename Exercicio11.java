
public class Exercicio11 {
	public static void main(String[] args) {
		int numResto = 20;
		String binario = "";
		
		while(numResto>0){
			binario=numResto%2+binario;
			numResto=numResto/2;
		}
		
		System.out.println(binario);
	}
}
