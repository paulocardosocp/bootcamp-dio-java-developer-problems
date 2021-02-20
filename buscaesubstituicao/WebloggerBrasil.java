package buscaesubstituicao;
import java.io.IOException;
import java.util.Scanner;

public class WebloggerBrasil {

	public static void main(String[] args) throws IOException {
				
		Scanner sc = new Scanner(System.in);
		
		boolean ocorrenciaParUnd;
		boolean ocorrenciaParAst;
		
		while (sc.hasNext()) {
			String entrada = sc.nextLine();
			String saida = entrada;

			ocorrenciaParUnd = true;
			ocorrenciaParAst = true;
			
			for (int i = 0; i < entrada.length(); i++) {
				
				if (entrada.charAt(i) == '_' && ocorrenciaParUnd) {
					saida = saida.replaceFirst("_", "<i>");
					ocorrenciaParUnd = !ocorrenciaParUnd;
					
				} else if (entrada.charAt(i) == '_' && !ocorrenciaParUnd) {
					saida = saida.replaceFirst("_", "</i>");
					ocorrenciaParUnd = !ocorrenciaParUnd;
					
				} else if (entrada.charAt(i) == '*' && ocorrenciaParAst) {
					saida = saida.replaceFirst("\\*", "<b>");
					ocorrenciaParAst = !ocorrenciaParAst;
					
				} else if (entrada.charAt(i) == '*' && !ocorrenciaParAst) {
					saida = saida.replaceFirst("\\*", "</b>");
					ocorrenciaParAst = !ocorrenciaParAst;
				}
			}
			System.out.println(saida);
		}
		sc.close();
	}
}
