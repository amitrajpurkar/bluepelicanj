package bpj.lesson24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileNerd {
    public static void main(String[] args) {
        String full_path = "/Users/amitrajpurkar/workspace/bluepelicanj/app/src/main/resources/NerdData.txt";
        List<String> lines_read = fileReader(full_path);

        for (String line : lines_read) {
            if(line.startsWith("The")) System.out.println(line);
        }

    }

    private static List<String> fileReader(String filepath) {
        List<String> lines = new ArrayList<>();

        try (Scanner sf = new Scanner(new File(filepath))) {
            while (sf.hasNextLine()) {
                String line = sf.nextLine();
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return lines;
    }
}
