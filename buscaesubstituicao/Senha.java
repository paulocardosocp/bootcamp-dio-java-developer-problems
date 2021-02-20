package buscaesubstituicao;
import java.io.IOException;
import java.util.Scanner;

public class Senha {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{6,32}$";
		
		while (sc.hasNext()) {
			String senha = sc.nextLine();			
			System.out.println(senha.matches(regex) ? "Senha valida." : "Senha invalida.");
		}
		sc.close();
	}
}
