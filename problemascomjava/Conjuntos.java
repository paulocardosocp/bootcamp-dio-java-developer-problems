package problemascomjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conjuntos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<String> conjunto = new ArrayList<>();	
		int numeroCasos;
		String saida;
		
		while ((numeroCasos = sc.nextInt()) != 0) {
			
			saida = "Conjunto Bom";
			
			for (int i = 0; i < numeroCasos; i++) {
				String elemento = sc.next();
				conjunto.add(elemento);
			}
			
			String elementoComparador;
			for (int i = 0; i < conjunto.size(); i++) {
				elementoComparador = conjunto.get(i);
				for (int j = 0; j < conjunto.size(); j++) {
					if (i != j && conjunto.get(j).startsWith(elementoComparador)) {
						saida = "Conjunto Ruim";
					}
				}
			}
			
			System.out.println(saida);
			conjunto.clear();
		}
		sc.close();
	}
}