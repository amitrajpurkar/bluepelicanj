package bpj.lesson24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("Lesson 24: File I/O");

        exer01();
        exer02();
        exer03();
        exer04();
        exer05();
        exer06();
        exer07();
        exer08();
        exer09();
        exer10();
        exer11();
        exer12();
    }

    private static final String full_path = "/Users/amitrajpurkar/workspace/bluepelicanj/app/src/main/resources/MyData.in";
    private static final String relative_path = "./app/src/main/resources/MyData.in";
    private static final String non_existing_file = "C:\\Disney\\Cartoons\\DaffyDuck.txt";
    private static final String empty_file = "/Users/amitrajpurkar/workspace/bluepelicanj/app/src/main/resources/MyData2.in";

    private static int fileReader(String filepath) {
        try (Scanner sf = new Scanner(new File(filepath))) {
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
            return maxIndx;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return 0;
    }

    private static void exer01() {
        System.out.println("Exercise 1: ");
        try (Scanner scr = new Scanner(new File("C:\\Disney\\Cartoons\\DaffyDuck.txt"))) {
            while (scr.hasNextLine()) {
                System.out.println(scr.nextLine());
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("--------------------------------");
    }

    private static void exer02() {
        System.out.println("Exercise 2: ");
        System.out.println("Given the following code:");
        System.out.println("maxIndx++;");
        System.out.println("text[maxIndx] = sf.nextLine();");
        System.out.println("Q:How will you replace this code by one liner?");
        System.out.println("Ans: text[++maxIndx] = sf.nextLine();");
        System.out.println("Ans: text[maxIndx++] = sf.nextLine();");
        System.out.println("--------------------------------");
    }

    private static void exer03() {
        System.out.println("Exercise 3: ");
        System.out.println("Q: write an expression that tells the number of elements in text[] array that contains meaningful data");
        System.out.println("Ans: maxIndx;");

        System.out.println("--------------------------------");
    }

    private static void exer04() {
        System.out.println("Exercise 4: ");
        System.out.println("Q: why do we initialize maxIndx to -1.");
        System.out.println("Ans: to avoid getting out of bounds exception and the first element of the array starts at 0, when file is read.");
        System.out.println("--------------------------------");
    }

    private static void exer05() {
        System.out.println("Exercise 5: ");
        System.out.println("Q: what are the conditions of exiting the while loop?");
        System.out.println("Ans: sf.hasNextLine(), which means it will stop when there are no more lines of data in the file.");
        System.out.println("--------------------------------");
    }

    private static void exer06() {
        System.out.println("Exercise 6: ");
        System.out.println("Q: the Scanner class needs which import?");
        System.out.println("Ans: import java.util.Scanner;");
        System.out.println("--------------------------------");
    }

    private static void exer07() {
        System.out.println("Exercise 7: ");
        System.out.println("Q: re-write the while loop so that prints each line just after reading it into text[] array.");
        System.out.println("Ans: while (sf.hasNextLine()) {");
        System.out.println("    maxIndx++;");
        System.out.println("    text[maxIndx] = sf.nextLine();");
        System.out.println("    System.out.println(text[maxIndx]);");
        System.out.println("    }");
        System.out.println("--------------------------------");
    }

    private static void exer08() {
        System.out.println("Exercise 8: ");
        System.out.println("Q: what will be the value of maxIndx at the completion of while loop if the file is empty?");
        System.out.println("Ans: 0");// we need t0 check this... try with empty file
        int numberOfLines = fileReader(empty_file);
        System.out.println("The number of lines in the empty file is: " + numberOfLines);
        System.out.println("number of lines in valid file is: " + fileReader(full_path));
        System.out.println("number of lines in non existing file is: " + fileReader(non_existing_file));
        System.out.println("--------------------------------");
    }

    private static void exer09() {
        System.out.println("Exercise 9: ");
        System.out.println("Q: what does sf.close() do?");
        System.out.println("Ans: it closes the Scanner object");
        System.out.println("--------------------------------");
    }

    private static void exer10() {
        System.out.println("Exercise 10: ");
        System.out.println("Q: with the statement text[] = new String[100], why do we give a high dimension to the array?");
        System.out.println("Ans: to avoid getting out of bounds exception and to be able to read files which are atleast 100 lines long.");
        System.out.println("--------------------------------");
    }

    private static void exer11() {
        System.out.println("Exercise 11: ");
        System.out.println("Q: what might account for the following?");
        System.out.println("you used Notepad to create a file and thought you named it as Dat.xx. Later when you looked at the folder with Windows Explorer, you notice that the file name is actually Dat.xx.txt");
        System.out.println("Ans: In Notepad, if you leave default options while saving file, Notepad will save the file with extention as txt. to save the file with other extention, you need to use the Save As option and select all-files-type.");

        System.out.println("--------------------------------");
    }

    private static void exer12() {
        System.out.println("Exercise 12: ");
        System.out.println("Q: write the signature of the nextLine method");
        System.out.println("Ans: public String nextLine();");
        System.out.println("--------------------------------");
    }
}
