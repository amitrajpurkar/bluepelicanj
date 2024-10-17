package bpj.lesson18;

import java.util.Scanner;

public class CountEmRight {

    public static void main(String[] args) {
        System.out.println("Project: Count Em Right");
        try (Scanner kbReader = new Scanner(System.in)) {
            boolean exit = false;

            while (!exit) {
                System.out.print("Type in a sentense and press ENTER (exit with 'EXIT'): ");
                String sentence = kbReader.nextLine();
                System.out.println(sentence);
                if("EXIT".equalsIgnoreCase(sentence)) {
                    exit = true;
                    break;
                }
                sentence = sentence.toUpperCase()+"harmless";
                String[] words = sentence.split("S\s*A");
                int numberOfOccurrences = words.length - 1;
                System.out.println("There are "+numberOfOccurrences+" occurrences of 'SA'");
            }
        }
        System.out.println("--------------------------------");
    }
}
