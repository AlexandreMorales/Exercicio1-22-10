import java.util.ArrayList;
import java.util.Random;


public class Exercicio10 {
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> ArrayA = new ArrayList<Integer>();
		ArrayList<Integer> ArrayAux = new ArrayList<Integer>();
		ArrayA.add(r.nextInt(10));
		ArrayA.add(r.nextInt(10));
		ArrayA.add(r.nextInt(10));
		ArrayA.add(r.nextInt(10));
		ArrayA.add(r.nextInt(10));
		ArrayA.add(r.nextInt(10));
		ArrayA.add(r.nextInt(10));

		System.out.println("ArrayA :" + ArrayA.toString());

		/*for (int i = 0; i < ArrayA.size(); i++) {
			if (ArrayA.get(i)%2 != 0) {
				ArrayAux.add(ArrayA.get(i));
			}
		}

		for (int i = 0; i < ArrayA.size(); i++) {
			if (ArrayA.get(i)%2 == 0) {
				ArrayAux.add(ArrayA.get(i));
			}
		}
		ArrayA=ArrayAux;
		System.out.println("ArrayA :" + ArrayA.toString());
		*/
		
		System.out.println("Testando o método");
		System.out.println(ordenaParesEImpares(ArrayA));
	}
	
	public static ArrayList<Integer> ordenaParesEImpares(ArrayList<Integer> lista) {
		
		boolean ordenado = false;
		
		while(ordenado == false) {
			ordenado = true;
			
			for(int i = 0; i < lista.size() -1; i++) {
				if(lista.get(i) % 2 == 0 && lista.get(i + 1) % 2 != 0) {
					int aux = lista.get(i);
					lista.set(i, lista.get(i + 1));
					lista.set(i + 1, aux);
					ordenado = false;
				}
			}
		}
		
		return lista;
	}
}
