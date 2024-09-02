package bpj.lesson7;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        try (Scanner kbReader = new Scanner(System.in)) {
            System.out.print("Enter your integer here: ");// enter 3001
            int i = kbReader.nextInt();
            System.out.println(3 * i);

            System.out.print("now enter a decimal number: ");// enter 100.5
            double d = kbReader.nextDouble();
            System.out.println(3 * d);

            String s = "";
            System.out.print("this time enter some strings: ");// enter one two
            s = kbReader.next();// inputs upto first white space
            System.out.println("this is the first part of the String: " + s);
            s = kbReader.next();
            System.out.println("this is the next part of the string: " + s);

            System.out.print("check this: dues to invocation of earlier scanner methods, nextLine will not work...");
            if (kbReader.hasNextLine()) {
                s = kbReader.nextLine();
            }
            System.out.println("does this allow you to enter next-line?: " + s);
        }

        try (Scanner kb2 = new Scanner(System.in)) {
            String s = "";// this is a different String in different local context
            System.out.print("now lets read a line, enter few words: ");
            if (kb2.hasNextLine()) {
                s = kb2.nextLine();
            }
            System.out.println("here is what was entered: " + s);
        }

    }

}
