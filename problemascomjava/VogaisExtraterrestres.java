package problemascomjava;

import java.util.Scanner;

public class VogaisExtraterrestres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palavra, frase;
		
		while (sc.hasNext()) {
			palavra = sc.nextLine();
			frase = sc.nextLine();
			int posicao, ocorrencias = 0;
			
			for (int i = 0; i < palavra.length(); i++) {
				posicao = -1;
				do {
					posicao = frase.indexOf(palavra.charAt(i), posicao + 1);
					if (posicao != -1) {
						ocorrencias++;
					}
				} while (posicao != -1);
				
			}
			System.out.println(ocorrencias);
		}
		sc.close();
	}
}
