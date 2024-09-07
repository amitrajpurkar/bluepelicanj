package bpj.lesson3;

import java.util.Locale;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Hello there");
        System.out.println("to work with REPL, use jshell;\n it comes with Java version 9 and above");

        String s1 = "Hello";
        String s2 = "good buddy";
        String c = s1 + s2;
        System.out.println(c);// no space
        System.out.println(s1 + " " + s2);

        String s3="Donald Duck";
        int len = s3.length();
        System.out.println("Length of "+s3+" is = "+len);

        String s4 = s3.substring(4);
        System.out.println(s4);
        System.out.println(s3.substring(4, 9));

        String bismark = "Dude, where's MY Car?";
        System.out.println(bismark.toLowerCase());
        System.out.println(bismark.toUpperCase(Locale.GERMAN));

        
    }
}
