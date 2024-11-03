package bpj.lesson24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTester {
    public static void main(String[] args) {
        String fullpath = "/Users/amitrajpurkar/workspace/bluepelicanj/app/src/main/resources/MyData.in";
        String relpath = "./app/src/main/resources/MyData.in";
        try (Scanner sf = new Scanner(new File(fullpath))) {
            int maxIndx = -1;
            String text[] = new String[100];
            while (sf.hasNextLine()) {
                maxIndx++;
                String line = sf.nextLine();
                text[maxIndx] = line;
            }
            for (int i = 0; i <= maxIndx; i++) {
                System.out.println(text[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
