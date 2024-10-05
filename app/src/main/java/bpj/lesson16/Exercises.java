package bpj.lesson16;

import bpj.lesson15.BankAccount;

public class Exercises{

    private static MoonRock myRock = new MoonRock(3, "Xeon");
    private static MoonRock yourRock = new MoonRock(2, "Kryptonite");
    private static MoonRock ourRock = new MoonRock(3, "Xeon");
    private static MoonRock theRock = ourRock;

    private static Weenie oscarMayer = new Weenie(); // empty constructor
    private static Weenie ow2 = new Weenie(3.14, 2, "Xeon");


    public static void main(String[] args) {
        System.out.println("Lesson 16: More on Classes and Objects");


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
    }

/**
 * use following code for problems 1 -- 5
 * 
 *  MoonRock myRock = new MoonRock(3, "Xeon");
 *  MoonRock yourRock = new MoonRock(2, "Kryptonite");
 *  MoonRock ourRock = new MoonRock(3, "Xeon");
 *  MoonRock theRock;
 *  theRock = ourRock;
 * 
 *  */    
private static void exer01() {
        System.out.println("Problem 1: ");
        System.out.println("theRock.equals(ourRock) --> " + theRock.equals(ourRock));    
        System.out.println("--------------------------------");
    }

    private static void exer02() {
        System.out.println("Problem 2: ");
        System.out.println("theRock.equals(yourRock) --> " + theRock.equals(yourRock));    
        System.out.println("--------------------------------");
    }

    private static void exer03() {
        System.out.println("Problem 3: ");
        System.out.println("theRock.equals(myRock) --> " + theRock.equals(myRock));    
        System.out.println("--------------------------------");
    }

    private static void exer04() {
        System.out.println("Problem 4: ");
        System.out.println("myRock == ourRock --> " + (myRock == ourRock));    
        System.out.println("--------------------------------");
    }

    private static void exer05() {
        System.out.println("Problem 5: ");
        System.out.println("myRock.equals(yourRock) --> " + myRock.equals(yourRock));    
        System.out.println("--------------------------------");
    }

    private static void exer06() {
        // int zz = oscarMayer.method1(4);// types incompatible
        System.out.println("the statement:: int zz = oscarMayer.method1(4); is not legal since the types are not compatible ");
    }

    private static void exer07() {
        oscarMayer.method2("Hello World");
        System.out.println("the statement:: oscarMayer.method2(\"Hello World\"); is legal ");
        System.out.println("--------------------------------");
        
    }

    private static void exer08() {
        int cv = oscarMayer.method3();
        System.out.println("the statement:: int cv = oscarMayer.method3(); is legal ");
        System.out.println("cv = " + cv);
        System.out.println("--------------------------------");
    }

    private static void exer09() {
        // int cv = oscarMayer.method3(14);//  method3 has no arguments
        System.out.println("the statement:: int cv = oscarMayer.method3(14); is not legal since the method3 has no arguments");
        System.out.println("--------------------------------");
    }

    private static void exer10() {
        // oscarMayer.z = "hotdog";
        System.out.println("the statement:: oscarMayer.z = \"hotdog\"; is NOTlegal because in class Weenie z is a private String, it cannot be accessed from outside the class");
        System.out.println("--------------------------------");
    }

    private static void exer11() {
        System.out.println("Assume following code is inside method1: method2(\"BarBQ\"); -- is this legal or not?");
        System.out.println("Ans: this is legal as it matches the method2 signature");
        System.out.println("--------------------------------");
    }

    /**
     * instantiate an object called surferDude from Surfer class. 
     * do this using two separate lines
     * one for declaring the object and second to instantiate it
     * assume that contructor has no parameters
     */
    private static void exer12() {
        System.out.println("line 1: Surfer surferDude;");
        System.out.println("line 2: surferDude = new Surfer();");
        System.out.println("--------------------------------");
    }

    /**
     * which of the following is correct?
     * assume beco is an object having a method called method33 which receives a Circle parameter.
     * a. Circle cir5 = new Circle(10);
     *    beco.method33(cir5);
     * b. beco.method33(new Circle(10));
     * c. both a and b
     * 
     */
    private static void exer13() {
        System.out.println("Ans: option c; both a dn b are correct method invocations");
        System.out.println("--------------------------------");
    }

    private static void exer14() {
        BankAccount acc = new BankAccount(10, "Sally");
        acc.deposit(5000);
        acc.withdraw(acc.getBalance() / 2);

        System.out.println("Balance after these transactions = "+acc.getBalance());

        System.out.println("--------------------------------");
    }

    private static void exer15() {
        System.out.println("What is wrong with following code ?");
        System.out.println("line 1: BankAccount b;");
        System.out.println("line 2; b.deposit(1000);");

        System.out.println("Ans: the object b is not instantiated; so the call to deposit method will cause a NUll-Pointer-Exception");
        System.out.println("--------------------------------");
        
    }

    private static void exer16() {
        System.out.println("What is wrong with the following code?");
        System.out.println("line 1: BankAccount b new BankAccount(32.75,\"Melvin\"); ");
        System.out.println("line 2: b = new BankAccount(1000,\"Bob\"); ");
        System.out.println("line 3: b.deposit(\"A thousand dollars\")");

        System.out.println("Ans: line 1 is having equalto sign missing, a syntax error; in line 3 method deposit only accepts double paramter, not String, hence that is not legal");

        System.out.println("--------------------------------");
    }

    private static void exer17() {
        System.out.println("What is printed in the following?");
        String myString = "Yellow";
        String yourString = "Yellow";
        String hisString = new String("Yellow");
        String ourString = myString;

        System.out.println("myString == yourString gives "+(myString == yourString) + "; expected false, as they are separate objects -- not sure if the String-constants on both lines are stored in same instance"); 
        System.out.println("myString == ourString gives "+(myString == ourString) + "; expected true, as both objects point to same instance of String"); 
        System.out.println("myString.equals(yourString) gives "+ myString.equals(yourString) + "; expected true as this comapres the content and not the object"); 
        System.out.println("myString.equals(ourString) gives "+myString.equals(ourString) + "; expected true as the contents of both objects are same");
        System.out.println("myString == hisString gives "+(myString == hisString) + "; expeced false as both are separate objects");

        System.out.println("--------------------------------");
    }

    

}