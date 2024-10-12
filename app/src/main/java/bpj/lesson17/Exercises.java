package bpj.lesson17;

import java.util.Scanner;

public class Exercises {

    private static String s = "Lucky hockey puck";
    private static String m = "uck";
    private static int j=6, z=99;

    public static void main(String[] args) {
        exer1();
        exer2();
        exer3();
        exer4();
        exer5();

        exer6();
        exer7();
        exer8();
        exer9();
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
        exer25();

        exer26();
    }

    private static void exer1() {
        System.out.println("Lesson 17: Exceptions");
        int k = s.indexOf(m);
        System.out.println(k);
        System.out.println("--------------------------------");
    }

    private static void exer2() {
        System.out.println("Exercise 2: ");
        int k = s.indexOf("uck",j);
        System.out.println(k);
        System.out.println("--------------------------------");
    }

    private static void exer3() {
        System.out.println("Exercise 3: ");
        int k = s.indexOf('c');
        System.out.println(k);
        System.out.println("--------------------------------");
    }

    private static void exer4() {
        System.out.println("Exercise 4: ");
        String str = s.replace('o','p');
        System.out.println(str);
        System.out.println("--------------------------------");
    }

    private static void exer5() {
        System.out.println("Exercise 5: ");
        int k = s.lastIndexOf(m,j+3);
        System.out.println(k);
        System.out.println("--------------------------------");
    }

    private static void exer6() {
        System.out.println("Exercise 6: ");
        char p = s.charAt(7);
        System.out.println(p);
        System.out.println("--------------------------------");
    }

    private static void exer7() {
        System.out.println("Exercise 7: ");
        int k = s.indexOf(z);
        System.out.println(k);
        System.out.println("--------------------------------");
    }

    private static void exer8() {
        System.out.println("Exercise 8: ");
        int k = s.lastIndexOf(m);
        System.out.println(k);
        System.out.println("--------------------------------");
    }

    private static void exer9() {
        System.out.println("Exercise 9: ");
        int k = s.indexOf('y',j);
        System.out.println(k);
        System.out.println("--------------------------------");
    }

    private static void exer10() {
        System.out.println("Exercise 10: ");
        char p = s.charAt(z-90);
        System.out.println(p);
        System.out.println("--------------------------------");
    }

    private static void exer11() {
        System.out.println("Exercise 11: ");
        int k = s.indexOf(m,15);
        System.out.println(k);
        System.out.println("--------------------------------");
    }

    private static void exer12() {
        System.out.println("Exercise 12: ");
        int k = s.indexOf(z+2,4);
        System.out.println(k);
        System.out.println("--------------------------------");
    }

    private static void exer13() {
        System.out.println("Exercise 13: ");
        int k = s.lastIndexOf('h');
        System.out.println(k);
        System.out.println("--------------------------------");
    }

    private static void exer14() {
        System.out.println("Exercise 14: ");
        int k = s.lastIndexOf(121);
        System.out.println(k);
        System.out.println("--------------------------------");
    }

    private static void exer15() {
        System.out.println("Exercise 15: ");
        String str = s.replace('y','A');
        System.out.println(str);
        System.out.println("--------------------------------");
    }

    private static String xyz="bathtub";
    private static String ddd="bathTUB";
    private static String ccc=xyz;
    private static String wc="Whooping crane";
    private static String s1 = "    \t\tGu daay, mates \n";

    private static void exer16() {
        System.out.println("Exercise 16: ");
        int j = xyz.compareTo(wc);
        boolean bb;
        if(j>0) bb = true;
        else bb = false;
        System.out.println(bb);
        System.out.println("--------------------------------");
    }
    
    private static void exer17() {
        System.out.println("Exercise 17: ");
        String v = ddd.toLowerCase();
        int fg = xyz.compareTo(v);
        System.out.println(fg+1);
        System.out.println("--------------------------------");
    }

    private static void exer18() {
        System.out.println("Exercise 18: ");
        System.out.println(ddd.compareTo(ccc));
        System.out.println("--------------------------------");
    }

    private static void exer19() {
        System.out.println("Exercise 19: ");
        System.out.println(xyz.compareTo(ccc));
        System.out.println("--------------------------------");
    }

    private static void exer20() {
        System.out.println("Exercise 20: ");
        System.out.println("Stupid".compareTo(ddd));
        System.out.println("--------------------------------");
    }

    private static void exer21() {
        System.out.println("Exercise 21: ");
        System.out.println(">>>"+s1.trim()+"<<<");
        System.out.println("--------------------------------");
    }

    private static String m1 = "Good morning, how may i help you? I289 56";
    private static Scanner sc = new Scanner(m1);

    private static void exer22() {
        System.out.println("Exercise 22: ");
        System.out.println(sc.next());
        System.out.println("--------------------------------");
    }

    private static void exer23() {
        System.out.println("Exercise 23: ");
        sc.skip("\\s*mo");
        String s = sc.next();
        System.out.println(s);
        System.out.println("--------------------------------");
    }

    private static void exer24() {
        System.out.println("Exercise 24: ");
        sc.useDelimiter("\\s+I");
        System.out.println(""+sc.next());
        System.out.println("--------------------------------");
    }

    private static void exer25() {  
        System.out.println("Exercise 25: ");
        sc.findInLine("el");
        System.out.println(sc.hasNext());
        System.out.println(sc.next());
        System.out.println("--------------------------------");
    }

    private static void exer26() {
        System.out.println("Exercise 26: ");
        sc.useDelimiter("\\s+");
        System.out.println(sc.nextInt());
        System.out.println("--------------------------------");
    }
}
