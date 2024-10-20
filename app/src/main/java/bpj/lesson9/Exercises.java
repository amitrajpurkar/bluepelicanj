package bpj.lesson9;

import java.util.Scanner;

public class Exercises {

    public static void main(String[] args) {
        System.out.println("Lesson 9: If statements");

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

        prj_odd_even();
    }

    private static int i=10, j=3;
    private static boolean true_false;

    private static void exer01() {
        System.out.println("Exercise 1:");
        true_false = j > i;
        System.out.println("true_false = " + true_false);
        System.out.println("--------------------------------");
    }

    private static void exer02() {
        System.out.println("Exercise 2:");
        true_false = i > j;
        System.out.println("true_false = " + true_false);
        System.out.println("--------------------------------");
    }

    private static void exer03() {
        System.out.println("Exercise 3:");
        true_false = (i == j);
        System.out.println("true_false = " + true_false);
        System.out.println("--------------------------------");
    }

    private static void exer04() {
        System.out.println("Exercise 4:");
        true_false = ((j <= i) || (j >= i));
        System.out.println("true_false = " + true_false);
        System.out.println("--------------------------------");
    }

    private static void exer05() {
        System.out.println("Exercise 5:");
        true_false = ((i > j) && (j == 0));
        System.out.println("true_false = " + true_false);
        System.out.println("--------------------------------");
    }

    private static void exer06() {
        System.out.println("Exercise 6:");
        true_false = ((j<50) || (j!=33));
        System.out.println("true_false = " + true_false);
        System.out.println("--------------------------------");
    }

    private static void exer07() {
        System.out.println("Exercise 7:");
        true_false = (!(j>=0) || (i<=50));
        System.out.println("true_false = " + true_false);
        System.out.println("--------------------------------");
    }

    private static void exer08() {
        System.out.println("Exercise 8:");
        true_false = (!(!(!true)));
        System.out.println("true_false = " + true_false);
        System.out.println("--------------------------------");
    }

    private static void exer09() {
        System.out.println("Exercise 9:");
        true_false = (5<=5);
        System.out.println("true_false = " + true_false);
        System.out.println("--------------------------------");
    }

    private static void exer10() {
        System.out.println("Exercise 10:");
        true_false = (j!=i);
        System.out.println("true_false = " + true_false);
        System.out.println("--------------------------------");
    }

    private static void exer11() {
        System.out.println("Exercise 11:");
        int m =2;
        boolean b = (m<=44);
        System.out.println("b = " + b);
        System.out.println("--------------------------------");
    }

    private static void exer12() {
        System.out.println("Exercise 12:");
        int r = 2;
        boolean b = !(r>=17);
        System.out.println("b = " + b);
        System.out.println("--------------------------------");
    }

    private static void exer13() {
        System.out.println("Exercise 13:");
        true_false = !( (2>3) || (5==5) && (7>1) && (4<15) || (35<=36) && (89!=34) );
        System.out.println("true_false = " + true_false);
        System.out.println("--------------------------------");
    }

    private static String s1 = "school BUS";
    private static void exer14() {
        System.out.println("Exercise 14:");
        if (s1.equals("school BUS")) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        System.out.println("--------------------------------");
    }

    private static void exer15() {
        System.out.println("Exercise 15:");
        if(s1.equalsIgnoreCase("school bus")) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        System.out.println("--------------------------------");
    }

    private static void exer16() {
        System.out.println("Exercise 16:");
        int j=19, m=200;
        if(j==18)
            m++;// IF statement ends here.
            j++;// this indentation is deliberate. this is not part of IF statement
        System.out.println("m = " + m);
        System.out.println("j = " + j);
        System.out.println("--------------------------------");
    }

    private static void exer17() {
        System.out.println("Exercise 17:");
        int g =3;
        true_false = !(g!=34);
        System.out.println("true_false = " + true_false);
        System.out.println("--------------------------------");
    }

    private static void exer18() {
        System.out.println("Exercise 18:");
        int k = 5;
        true_false = (k % 2 == 0)? true : false;
        System.out.println("true_false = " + true_false);
        System.out.println("--------------------------------");
    }

    private static void exer19() {
        System.out.println("Exercise 19:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String s = sc.nextLine();
        if(s.equals("XRay")) {
            System.out.println("Password entered successfully.");
        } else {
            System.out.println("Incorrect password.");
        }
        System.out.println("--------------------------------");
    }

    private static void exer20() {
        System.out.println("Exercise 20:");
        int k = 79;
        if(k>50){
            if(k<60){
                System.out.println("One");
            } else {
                System.out.println("Two");
            }
        } else {
            if(k>30){
                System.out.println("Three");
            } else {
                System.out.println("Four");
            }
        }
        System.out.println("--------------------------------");
    }

    private static void prj_odd_even() {
        System.out.println("Project Odd Even:");
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int i = kb.nextInt();
        String s = is_odd_or_even(i);
        System.out.println("The number is " + s);
        kb.close();
        
        System.out.println("--------------------------------");
    }

    private static String is_odd_or_even(int i) {   
        return (i % 2 == 0) ? "Even" : "Odd";
    }
}
