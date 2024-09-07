package bpj.lesson2;

/**
 * @author amitrajpurkar
 * try concepts from Lesson 2
 */
public class Tester {
    public static void main(String args[]) {
        System.out.println("string value");

        int age = 51;
        System.out.println(age);

        double d = -137.8036;
        System.out.println(d);
        d = 1.45667E23;
        System.out.println(d);

        boolean b = true;
        System.out.println(b);

        String s = "test value";
        //legal names examples
        String Agro = s;
        String _Agro = s;
        String $Agro = s;
        String _Agro2 = s;
        String _2Agro = s;
        String _2Agro2 = s;
        if(Agro.equals(_2Agro) && _2Agro.equals(_2Agro2)){
            System.out.println("Agro is equal to _2Agro and _2Agro2");
        }

        //illegal names examples
        //String 2Agro = s;
        //String -Agro = s;
        //String Agro.2 = s;
        //String Agro 2 = s;
        //String Agro-2 = s;
    }

    public static void excerise(String[] args) { 
        //System.out.println(new App().getGreeting());
        System.out.println("three main types of variables are String, int, double");
        System.out.println("Maths operators are +, -, *");
        System.out.println("Comparison operators are ==, !=, >, <");
        System.out.println("Logical operators are &&, ||, !");
        System.out.println("Shortcut maths operators are =, +=, -=, *=, /=, %=");
        System.out.println("Increment and decrement operators are ++, --");
        System.out.println("Bitwise operators are &, |, ^, ~, <<, >>, >>>");

        System.out.println("we will use String variable to store names");
        System.out.println("we will use int variable to store age");
        System.out.println("we will use double variable to store square root of 2");

        double p = 1.921E-16;
        System.out.println(p);
        int i = 407;
        System.out.println(i);

        String my_name = "tommy lee jones";
        System.out.println(my_name);

        int count;
        // System.out.println("count = " + count);// variable not initialized

        // bankBalance = 136.05;
        // System.out.println(bankBalance);// variable not declared

        // int alt = 1493.86;
        // System.out.println(alt);// type mismatch error
    }
}