package problemascomjava;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AmigoDePablo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String entrada, aluno, vencedor = "";
		Set<String> amigos = new HashSet<>();
		Set<String> naoAmigos = new HashSet<>();
		
		while ((entrada = sc.nextLine()).compareTo("FIM") != 0) {
			
			String[] entradaArray = entrada.split(" ");			
			aluno = entradaArray[0];
			
			if (entradaArray[1].toUpperCase().compareTo("SIM") == 0) {
				vencedor = (aluno.length() > vencedor.length()) ? aluno : vencedor;
				amigos.add(aluno);
			} else {
				naoAmigos.add(aluno);
			}
		}
		sc.close();
		
		amigos.remove("Abhay");
		
		amigos.stream().sorted().forEach(System.out::println);
		naoAmigos.stream().sorted().forEach(System.out::println);

		System.out.println("\nAmigo do Pablo:\n" + vencedor);
	}
}
