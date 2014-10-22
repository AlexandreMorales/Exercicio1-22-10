import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ExercicioPatty {
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> lista = new ArrayList<>();
		BufferedReader buffer;
		try {
			File file = new File("numeroRandom");
			buffer = new BufferedReader(new FileReader(file));
			String line;
			while ((line = buffer.readLine()) != null) {
				lista.add(Integer.parseInt(line));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		int contImpar = 0;
		int contPar = 0;
		int contadorOcorrencia = 0;
		
		for (int i = 0; i < lista.size(); i++) {
			contadorOcorrencia = 0;
			for (int j = 0; j < lista.size(); j++) {
				if(i==lista.get(j)){
					contadorOcorrencia++;
				}
			}
			if(contadorOcorrencia>0)
				System.out.println("O número "+i+" apareceu "+contadorOcorrencia+ " vezes");
			if (lista.get(i) % 2 == 0) {
				contPar++;
			} else {
				contImpar++;
			}
		}
		System.out.println("Tem " + contImpar + " números impar(es)");
		System.out.println("Tem " + contPar + " números par(es)");
		
	}
}
