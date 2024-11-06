package bpj.lesson25;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputNumData {
    public static void main(String[] args) throws FileNotFoundException {
        String full_path = "/Users/amitrajpurkar/workspace/bluepelicanj/app/src/main/resources/NumData.in";

        Scanner sf = new Scanner(new File(full_path));
        int maxIndx = -1;
        String text[] = new String[100];
        while (sf.hasNextLine()) {
            maxIndx++;
            text[maxIndx] = sf.nextLine();
            // System.out.println("text[" + maxIndx + "] = " + text[maxIndx]);
        }
        sf.close();
        String answer = "";
        int sum;

        for (int i = 0; i <= maxIndx; i++) {
            Scanner sc = new Scanner(text[i]);
            sum = 0;
            answer = "";
            while (sc.hasNextInt()) {
                int j = sc.nextInt();
                answer = answer + " + " + j;
                sum += j;
            }
            answer = answer + " = " + sum;
            answer = answer.replaceFirst("\\+", "").trim();
            System.out.println(answer);
        }
    }
}
