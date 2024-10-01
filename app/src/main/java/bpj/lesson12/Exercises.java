package bpj.lesson12;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("Starting exercises for lesson 12");

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

        // contest questions
    // 1 --> E (both A, B) ... control expression is at the start of loop
    // 2 --> D .. check the continue statement.. and see how it will step through
    // 3 --> A ... substitute the values of k, p and step through the loop 3 times and see
    // 4 --> E (its 1 times) .. check the truth-table for OR ... on the line if(b || !b).. step thru the code
    // 5 --> E (both A, B) ... control expression is at start of loop

    }

    /**
     * show the basic skeleton of a while loop
     */
    private static void exer01() {
        System.out.println("Basic skeleton of While Loop");
        System.out.println("while (condition) {");
        System.out.println("    statement;");
        System.out.println("}");
        System.out.println("condition is evaluated at the start of the loop");
    }

    /**
     * show the basic skeleton of a do-while loop
     */
    private static void exer02() {
        System.out.println("Basic skeleton of do-while Loop");
        System.out.println("do {");
        System.out.println("    statement;");
        System.out.println("} while (condition);");
        System.out.println("condition is evaluated at the end of the loop");
    }

    /**
     * implement a while loop
     */
    private static void exer03() {
        int m=97;
        double k=0, p=0;
        while (m<=195){
            k = k * k + 3 * m;
            p = p + m + 1;
            m++;
        }
        System.out.println(String.format("here are the values of k = %f and p = %f and m = %d", k, p, m));
    }

    /**
     * implement a do-while loop
     */
    private static void exer04() {
        int v=2;
        double k=0, q=0;
        do { 
            k = k * k + 3 * v;
            q = Math.sqrt(q + v + 1);
            v*=3;
        } while (v<=195);
        System.out.println(String.format("the values are k = %f and q = %f and v = %d", k, q, v));
    }

    /**
     * what is the loop control expression in the code segment below?
     * while(!done){
     *     if(i<1)
     *         {done=true;}
     *     i--;
     }
     */
    private static void exer05() {
        System.out.println("the control expression is `while(!done)`");
    }

    /**
     * what is the error in the code segment below?
     * do;
     * {
     *     if(i<1)
     *         {done=true;}
     *     i--;
     * } while(!done);
     */
    private static void exer06() {
        //todo
        System.out.println("the first statement `do` has a semicolon at the end; `do;` instead of `do{statement}while(condition);`");
    }

    /**
     * how many times will the loop iterate?
     * int j=0;
     * while(j<50){
     *     System.out.println("Hello World");
     * }
     */
    private static void exer07() {
        System.out.println("the loop will execute infinite times; value of j is always 0; there is no increment of j in the loop"); 
    }

    /**
     * how many times will the loop iterate?
     * int j=25;
     * while(j<=100 || j>=25){
     *     System.out.println("Hello World");
     *     j++;
     * }
     */
    private static void exer08() {
        //todo
        int j=25, counter=0;
        while(j<=100 || j>=25){
            //System.out.println("Hello World");
            j++;
            counter++;
        }
        System.out.println("the loop will execute "+counter+" times");
    }

    /**
     * identify teh error(s) in the code below
     * j=155  <------- variable j is not defined as int; there is no semicolon at the end of the statement
     * while(!done){  <------- boolean variable done is not defined as boolean
     *     if(j<=25)
     *          done=true;
     *     j=j-5;
     * }
     */
    private static void exer09() {
        System.out.println("the variable j is not defined as int;");
        System.out.println("there is no semicolon at the end of the statement");
        System.out.println("the variable done is not defined as boolean");
    }

    private static void exer10() {
        int i=0, j=0;
        while(i<=3){
            for(j=0;j<=2;j++){
                System.out.println(i+","+j+" ");
            }
            i++;
        }
        System.out.println("output will only be 0,0 0,1 0,2 and it stops because j is not reset to zero for next iteration of i");
    }

    private static void exer11() {
        System.out.println("to exit a loop prematurely use break statement");
    }

    private static void exer12() {
        System.out.println("to guarantee the control expression is alwawys tested before loop; we should use WHILE-loop");
    }

    private static void exer13() {
        //todo
        double m=92.801;
        int j=0;
        do { 
            j=j+2;
            if(j> -100) continue;
            m+=3;
        } while (j<6);
        System.out.println(m);
        System.out.println("because of continue statement, value of m never changes");
    }

    /**
     * write a program that will prompt the user to enter an integer.
     * the program should square the number and print the squared number.
     * repeat this process untill zero is entered as input.
     * use a do-while-loop to solve this problem.
     */
    private static void exer14() {
        //todo
        int input;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.print("Enter an integer (to exit, enter 0): ");
                input = sc.nextInt();
                System.out.println("The square of "+input+" is "+   input*input);
            } while (input!=0);
        }
        System.out.println("The program stopped as you enter 0");
    }

}