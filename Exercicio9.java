import java.util.ArrayList;
import java.util.Random;


public class Exercicio9 {
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> ArrayA = new ArrayList<Integer>();
		ArrayA.add(r.nextInt(10));
		ArrayA.add(r.nextInt(10));
		ArrayA.add(r.nextInt(10));
		ArrayA.add(r.nextInt(10));
		ArrayA.add(r.nextInt(10));
		ArrayA.add(r.nextInt(10));
		ArrayA.add(r.nextInt(10));

		System.out.println("ArrayA :" + ArrayA.toString());

		int maior = 0;
		int menor = 0;
		int indiceMaior = 0;
		int indiceMenor = 0;

		for (int i = 0; i < ArrayA.size(); i++) {
			if (i == 0) {
				maior = ArrayA.get(i);
				menor = ArrayA.get(i);
			} else if (ArrayA.get(i) > maior) {
				maior = ArrayA.get(i);
				indiceMaior = i;				
			} else if (ArrayA.get(i) < menor) {
				menor = ArrayA.get(i);
				indiceMenor = i;		
			}
		}
		ArrayA.set(indiceMenor, maior);
		ArrayA.set(indiceMaior, menor);
		
		System.out.println("ArrayA :" + ArrayA.toString());
	}
}
