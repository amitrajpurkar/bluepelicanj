package bpj.lesson25;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class AlphNames {
    public static void main(String[] args) {
        String full_path = "/Users/amitrajpurkar/workspace/bluepelicanj/app/src/main/resources/Names.in";

        try (Scanner sf = new Scanner(new File(full_path))) {
            int maxIndx = -1;
            String text[] = new String[100];
            while (sf.hasNextLine()) {
                maxIndx++;
                text[maxIndx] = sf.nextLine();
                // System.out.println("text[" + maxIndx + "] = " + text[maxIndx]);
            }
            sf.close();

            String[] revesedNames = new String[maxIndx + 1];
            for (int j = 0; j <= maxIndx; j++) {
                Scanner sc = new Scanner( text[j] );
                String firstname = sc.next();
                String lastname = sc.next();
                revesedNames[j] = lastname + ", " + firstname;
            }

            Arrays.sort(revesedNames);
            for (int k = 0; k <= maxIndx; k++) {
                System.out.println(revesedNames[k]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
