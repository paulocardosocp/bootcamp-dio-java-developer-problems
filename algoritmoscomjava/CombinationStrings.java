package algoritmoscomjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CombinationStrings {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int i = 0, numberCases = Integer.parseInt(st.nextToken("\n"));

        while (i++ < numberCases) {
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken("\n");
            String[] arrayInput = input.split(" ");

            System.out.println(combineStrings(arrayInput));
        }
    }

    private static String combineStrings(String[] arrayInput) {
        String finalString, combinedString = "";
        int length;

        if (arrayInput[0].length() < arrayInput[1].length()) {
            length = arrayInput[0].length();
            finalString = arrayInput[1].substring(arrayInput[0].length());
        } else if (arrayInput[0].length() > arrayInput[1].length()) {
            length = arrayInput[1].length();
            finalString = arrayInput[0].substring(arrayInput[1].length());
        } else {
            length = arrayInput[0].length();
            finalString = "";
        }

        for (int i = 0; i < length; i++) {
            combinedString += String.valueOf(arrayInput[0].charAt(i)) + String.valueOf(arrayInput[1].charAt(i));
        }

        return combinedString + finalString;
    }
}
