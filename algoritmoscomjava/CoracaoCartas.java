package algoritmoscomjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CoracaoCartas {

    private static int[] pilha1, pilha2, pilha3;
    private static int topo1, topo2, topo3;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String entrada;
        boolean perdeuUmaRodada = false;
        int numeroRodadas;

        while (true) {

            st = new StringTokenizer(br.readLine());
            numeroRodadas = Integer.parseInt(st.nextToken("\n")); // tamanho das pilhas

            if (numeroRodadas == 0) break;
            pilha1 = new int[numeroRodadas];
            pilha2 = new int[numeroRodadas];
            pilha3 = new int[numeroRodadas];

            for (int i = 0; i < numeroRodadas; i++) {
                st = new StringTokenizer(br.readLine());
                entrada = st.nextToken("\n");
                String[] arrayEntrada = entrada.split(" ");

                pilha1[i] = Integer.parseInt(arrayEntrada[0]);
                pilha2[i] = Integer.parseInt(arrayEntrada[1]);
                pilha3[i] = Integer.parseInt(arrayEntrada[2]);
            }
            System.out.println(perdeuUmaRodada ? "0" : "1");
        }
    }
}
