package problemascomjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Contagem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Long> set;
		List<Long> listSet, list = new ArrayList<>();

		short quantidadeValores;
		Long entrada;

		while(sc.hasNext()) {
			quantidadeValores = sc.nextShort();

			for (int i = 0; i < quantidadeValores; i++) {
				entrada = sc.nextLong();
				list.add(entrada);
			}

			set = new LinkedHashSet<>(list); //nao armazena elementos repetidos
			listSet = set.stream().sorted().collect(Collectors.toList());

			List<Long> numeroOcorrencias = listSet.stream()
					.map(elem -> list.stream()
							.filter(e -> e == elem)
							.collect(Collectors.counting()))
					.collect(Collectors.toList());

			int i = 0;
			Iterator<Long> it = listSet.iterator();
			while (it.hasNext()) {
				System.out.println(it.next() + " aparece " + numeroOcorrencias.get(i++) + " vez(es)"); 
			}
		}
		sc.close();
	}
}