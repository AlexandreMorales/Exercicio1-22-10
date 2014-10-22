import java.util.ArrayList;
import java.util.Random;

public class Exercicio8 {
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> ArrayA = new ArrayList<Integer>();
		ArrayList<Integer> ArrayB = new ArrayList<Integer>();
		ArrayList<Integer> ArrayC = new ArrayList<Integer>();
		ArrayA.add(r.nextInt(10));
		ArrayA.add(r.nextInt(10));
		ArrayA.add(r.nextInt(10));
		ArrayA.add(r.nextInt(10));
		ArrayA.add(r.nextInt(10));
		ArrayA.add(r.nextInt(10));
		ArrayA.add(r.nextInt(10));
		ArrayB.add(r.nextInt(10));
		ArrayB.add(r.nextInt(10));
		ArrayB.add(r.nextInt(10));
		ArrayB.add(r.nextInt(10));
		ArrayB.add(r.nextInt(10));
		ArrayB.add(r.nextInt(10));
		System.out.println("ArrayA :" + ArrayA.toString());
		System.out.println("ArrayB :" + ArrayB.toString());
		for (int i = 0; i < ArrayA.size(); i++) {
			for (int j = 0; j < ArrayB.size(); j++) {
				if (!ArrayC.contains(ArrayA.get(i))) {
					ArrayC.add(ArrayA.get(i));
				}
				if (!ArrayC.contains(ArrayB.get(j))) {
					ArrayC.add(ArrayB.get(j));
				}
			}
		}
		System.out.println("ArrayC :" + ArrayC.toString());
	}
}
