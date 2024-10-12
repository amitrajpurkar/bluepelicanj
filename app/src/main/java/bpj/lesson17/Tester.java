package bpj.lesson17;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);

        System.out.print("Enter a sentence that has to be encrypted: ");
        String sentence = kbReader.nextLine();

        System.out.println("Original sentence is: " + sentence);
        
        Crypto c = new Crypto(); 
        String encrypted = c.encrypt(sentence);
        System.out.println("Encrypted sentence is: " + encrypted);
        String decrypted = c.decrypt(encrypted);
        System.out.println("Decrypted sentence is: " + decrypted);
    }

}
