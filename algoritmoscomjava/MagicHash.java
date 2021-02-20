package algoritmoscomjava;

import java.util.Scanner;

public class MagicHash {

    static int ASCII_A = 65;

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        int value, alphaPosition = 0, inputElement = 0, elementPosition = 0;
        int numberTestCases = scanner.nextInt();
        String word;

        for (int n = 0; n < numberTestCases; n++) {

            int numberWords = scanner.nextInt();
            value = 0;

            for (int l = 0; l < numberWords; l++) {
                word = scanner.next();

                // calculate value
                for (int i = 0; i < word.length(); i++) {

                    alphaPosition = word.charAt(i) - ASCII_A;
                    inputElement = l;
                    elementPosition = i;
                    value += alphaPosition + inputElement + elementPosition;
                }
            }
            System.out.println(value);
        }
    }
}
