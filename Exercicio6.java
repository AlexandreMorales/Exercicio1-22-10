import java.util.ArrayList;
import java.util.Random;

public class Exercicio6 {
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> ArrayA = new ArrayList<Integer>();
		ArrayList<Integer> ArrayB = new ArrayList<Integer>();
		ArrayList<Boolean> ArrayC = new ArrayList<Boolean>();
		ArrayA.add(r.nextInt(30));
		ArrayA.add(r.nextInt(30));
		ArrayA.add(r.nextInt(30));
		ArrayA.add(r.nextInt(30));
		ArrayA.add(r.nextInt(30));
		ArrayA.add(r.nextInt(30));
		ArrayA.add(8);
		ArrayA.add(r.nextInt(30));

		ArrayB.add(r.nextInt(30));
		ArrayB.add(r.nextInt(30));
		ArrayB.add(r.nextInt(30));
		ArrayB.add(r.nextInt(30));
		ArrayB.add(r.nextInt(30));
		ArrayB.add(r.nextInt(30));
		ArrayB.add(8);
		ArrayB.add(r.nextInt(30));
		
		
		for (int i = 0; i < ArrayA.size(); i++) {
			ArrayC.add(ArrayA.get(i) == ArrayB.get(i));
		}
		
		for (Boolean boolean1 : ArrayC) {
			System.out.println(boolean1);
		}

	}
}
