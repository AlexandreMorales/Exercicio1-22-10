import java.util.ArrayList;
import java.util.Random;


public class Exercicio12 {
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
		System.out.println("ArrayA :" + ordenar(ArrayA));
	}
	
	public static ArrayList<Integer> ordenar(ArrayList<Integer> lista) {
		
		boolean ordenado = false;
		int tamanho = lista.size() - 1;
		while(ordenado == false) {
			ordenado = true;
			
			for(int i = 0; i < tamanho; i++) {
				if(lista.get(i) > lista.get(i + 1)) {
					int aux = lista.get(i);
					lista.set(i, lista.get(i + 1));
					lista.set(i + 1, aux);
					ordenado = false;
					i--;
				}
			}
		}
		
		return lista;
	}
}
