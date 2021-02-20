package problemascomjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Entrevista {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String palavra;
		boolean temRepeticao;
		
		while ((palavra = br.readLine()) != null) {
			String palavraSubstr = palavra;
			temRepeticao = false;
			
			for (int i = 0; i <= palavra.length() - 1; i++) {
				
				String repeticao = palavra.substring(i);
				palavraSubstr = palavra.substring(0, i);
				
				if (palavraSubstr.endsWith(repeticao)) {
					System.out.println(palavraSubstr);
					temRepeticao = true;
					break;
				}
			}
			if (!temRepeticao) {
				System.out.println(palavra);
			}
		}
	}
}
