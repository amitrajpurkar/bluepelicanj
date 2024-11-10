package bpj.lesson26;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.IntStream;

public class StudentAverages {
    public static void main(String[] args) {
        String full_path = "/Users/amitrajpurkar/workspace/bluepelicanj/app/src/main/resources/StudentScores.in";
        String out_path = "/Users/amitrajpurkar/workspace/bluepelicanj/app/src/main/resources/ScoresOutput.out";
        String name="";
        int[] scores;
        int scrIdx=-1;
        String[] nameAndAvg;
        OptionalDouble od;

        try (Scanner sf = new Scanner(new File(full_path))) {
            int maxIndx = -1;
            String text[] = new String[100];
            while (sf.hasNextLine()) {
                maxIndx++;
                text[maxIndx] = sf.nextLine();
                // System.out.println("text[" + maxIndx + "] = " + text[maxIndx]);
            }
            sf.close();

            nameAndAvg = new String[maxIndx + 1];

            for (int i = 0; i <= maxIndx; i++) {
                Scanner sc = new Scanner(text[i]);
                name = sc.next();
                scores = new int[100];
                while(sc.hasNext()){
                    scrIdx++;
                    scores[scrIdx]=sc.nextInt();
                }
                IntStream stream = IntStream.of(scores);
                od = stream.average();
                if(od.isPresent()){
                    nameAndAvg[i] = name + ", average = "+od.getAsDouble();
                }
                scrIdx = -1;
            }

            try (FileWriter fw = new FileWriter(out_path)) {
                PrintWriter pw = new PrintWriter(fw);
                for (int i = 0; i <= maxIndx; i++) {
                    pw.println(nameAndAvg[i]);
                }
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
