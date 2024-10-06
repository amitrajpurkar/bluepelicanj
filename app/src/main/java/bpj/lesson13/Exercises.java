package bpj.lesson13;

public class Exercises {

    private static char c;
    private static int asciiValue;

    public static void main(String[] args) {
        System.out.println("Lesson 13: Ascii and more on characters");

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
        exer13();
        exer14();
        exer15();
        
        exer16();
        exer17();
        exer18();
        exer19();
        exer20();

        exer21();
        exer22();
        exer23();
        exer24();
    }

    private static void exer01() {
        System.out.println("Exercise 1: ");
        c = 'A';
        asciiValue = c;
        System.out.println("Ascii value of "+ c + " is " + asciiValue);
        System.out.println("--------------------------------");
    }

    private static void exer02() {
        System.out.println("Exercise 2: ");
        c = 'Z';
        asciiValue = c;
        System.out.println("Ascii value of "+ c + " is " + asciiValue);
        System.out.println("--------------------------------");
    }

    private static void exer03() {
        System.out.println("Exercise 3: ");
        c = 'a';
        asciiValue = c;
        System.out.println("Ascii value of "+ c + " is " + asciiValue);
        System.out.println("--------------------------------");
    }

    private static void exer04() {
        System.out.println("Exercise 4: ");
        c = 'z';
        asciiValue = c;
        System.out.println("Ascii value of "+ c + " is " + asciiValue);
        System.out.println("--------------------------------");
    }

    private static void exer05() {
        System.out.println("Exercise 5: ");
        System.out.println("English alphabets have 26 lowercase letters and 26 uppercase letters");
        System.out.println("--------------------------------");
    }

    private static void exer06() {
        System.out.println("Exercise 6: ");
        c = '0';
        asciiValue = c;
        System.out.println("Ascii value of "+ c + " is " + asciiValue);
        System.out.println("--------------------------------");
    }

    private static void exer07() {
        System.out.println("Exercise 7: ");
        c = '9';
        asciiValue = c;
        System.out.println("Ascii value of "+ c + " is " + asciiValue);
        System.out.println("--------------------------------");
    }

    private static void exer08() {
        System.out.println("Exercise 8: ");
        System.out.println("What does the following code do?");
        char c;
        for(int j=97; j<=122;j++){
            c = (char)(j - 32);
            System.out.println(c);
        }
        System.out.println("This code printed capital alphabets from A to Z, one per line.");
        System.out.println("--------------------------------");
    }

    private static void exer09() {
        System.out.println("Exercise 9: ");
        System.out.println("What does the following code do?");
        String s = "Alfred E. Newman";
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if((ch <=90) && (ch >= 65))
                ch = (char)(ch + 32);
            System.out.print(ch);
        }
        System.out.println("This code printed each character of String s in lowercase, in the same line.");
        System.out.println("--------------------------------");
    }

    private static void exer10() {
        System.out.println("Exercise 10: ");
        char ch = 'A';
        String s = "" + ch;
        System.out.print("to convert char to String, concatenate empty string with char --> s ="+s);
        System.out.println("--------------------------------");
    }

    private static void exer11() {
        String p = "H";
        char c = p.charAt(0);
        System.out.println("Exercise 11: ");
        System.out.println(" String p = " + p + "; and converted char c = " + c);
        System.out.println("--------------------------------");
    }

    private static void exer12() {
        char ch = 'V';
        // String sd = ch;//type mismatch error
        System.out.println("Exercise 12: ");
        System.out.println(" a character cannot be assigned to String variable; it gives type mismatch error");
        System.out.println("--------------------------------");
    }

    private static void exer13() {
        char ch = 'V';
        char x = (char) (ch + 56);
        System.out.println("Exercise 13: ");
        System.out.println("both statements are legal, the conversion is legal");
        System.out.println("char ch = " + ch + "; and converted char x = " + x);
        System.out.println("--------------------------------");
    }

    private static void exer14() {
        // char aa = "X";// not legal
        System.out.println("Exercise 14: ");
        System.out.println("The statement os not legal; a String value cannot be assigned to char variable");
        System.out.println("--------------------------------");
    }

    private static void exer15() {
        char k = 'B';
        System.out.println("Exercise 15: ");
        System.out.println(k + 3);
        System.out.println("The statement prints the int value of sum of ascii value of 'B' and 3");
        System.out.println("--------------------------------");
    }

    private static void exer16() {
        char k = 'B';
        System.out.println("Exercise 16: ");
        System.out.println((char)(k + 3));
        System.out.println("The statement prints the char representation of ascii value of 'B' plus 3");
        System.out.println("--------------------------------");
    }

    private static void exer17() {
        char boy = 'b';
        char cv = Character.toUpperCase(boy);
        System.out.println("Exercise 17: ");
        System.out.println("char boy = " + boy + "; and converted char cv = " + cv);
        System.out.println("--------------------------------");
    }

    private static void exer18() {
        char boy = 'D';
        char cv = Character.toLowerCase(boy);
        System.out.println("Exercise 18: ");
        System.out.println("char boy = " + boy + "; and converted char cv = " + cv);
        System.out.println("--------------------------------");
    }

    private static void exer19() {
        char boy = 't';
        System.out.println("Exercise 19: ");
        System.out.println("check if char boy is a digit: " + Character.isDigit(boy) );
        System.out.println("--------------------------------");
    }

    private static void exer20() {
        char boy = 't';
        System.out.println("Exercise 20: ");
        System.out.println("check if char boy is a letter: " + Character.isLetter(boy) );
        System.out.println("--------------------------------");
    }

    private static void exer21() {
        char boy = 't';
        System.out.println("Exercise 21: ");
        System.out.println("check if char boy is a upper case letter: " + Character.isUpperCase(boy) );
        System.out.println("--------------------------------");
    }

    private static void exer22() {
        char boy = 't';
        System.out.println("Exercise 22: ");
        System.out.println("check if char boy is a letter or digit: " + Character.isLetterOrDigit(boy) );
        System.out.println("--------------------------------");
    }

    private static void exer23() {
        char boy = 't';
        System.out.println("Exercise 23: ");
        System.out.println("check if char boy is a lower case letter: " +  Character.isLowerCase(boy) );
        System.out.println("--------------------------------");
    }

    private static void exer24() {
        System.out.println("Exercise 24: ");
        System.out.println("What does the following code do?");
        for(int j=0; j<= 127; j++){
            char c = (char)j;
            if(Character.isWhitespace(c))
                System.out.println(c);
        }
        System.out.println("This code printed all the whitespace characters from 0 to 127, one per line.");
        System.out.println("--------------------------------");
    }


}
