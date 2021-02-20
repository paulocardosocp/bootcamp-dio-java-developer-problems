package buscaesubstituicao;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PedraPapelTesoura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[][] ordemRegras = {
				{"tesoura", "papel",   "lagarto"},
				{"papel",   "pedra",   "spock"},
				{"pedra",   "lagarto", "tesoura"},
				{"lagarto", "spock",   "papel"},
				{"spock",   "tesoura", "pedra"}
		};
		Map<String, List<String>> regras = new HashMap<>();
		
		for (int i = 0; i < ordemRegras.length; i++) {
			regras.put(ordemRegras[i][0], Arrays.asList(ordemRegras[i][1], ordemRegras[i][2]));
		}

		int i = 0, numeroCasos = Integer.parseInt(sc.next());
		String s1, s2;
		
		while (i < numeroCasos) {
			
			s1 = sc.next();
			s2 = sc.next();		
			
			boolean empate = s1.compareTo(s2) == 0;
			String vencedor = empate ? "empate" : regras.get(s1).contains(s2) ? "fernanda" : "marcia"; 
			
			System.out.println(vencedor);
			
			if (i++ == numeroCasos - 1) sc.close();
		}
	}

}
