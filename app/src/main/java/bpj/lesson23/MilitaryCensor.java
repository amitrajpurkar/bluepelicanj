package bpj.lesson23;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MilitaryCensor {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        try (Scanner kbReader = new Scanner(System.in)) {
            System.out.print("Enter a sentence: ");
            String str = kbReader.nextLine();
            if(hasTabooWords(str)) {
                System.out.println(str + ">>>REJECTED");
            } else {
                System.out.println(str + ">>>OK");
            }
        }
    }

    private static boolean hasTabooWords(String str) {
        StringTokenizer st = new StringTokenizer(str);
        if(st.countTokens() == 0) {
            return false; // empty string
        }

        List<String> tabooWords = Arrays.asList("Hermes", "bridge", "Muddy", "River", "assault", "offensive");
        tabooWords.replaceAll(String::toUpperCase);
        

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (tabooWords.contains(token.toUpperCase())) {
                return true; // found a taboo word atleast once
            }
        }
        
        return false; // no taboo words
    }
}
