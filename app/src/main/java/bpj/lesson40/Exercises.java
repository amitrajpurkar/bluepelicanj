package bpj.lesson40;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("Lesson 40: Recursions");

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
    }

    private static int rig(int n) {
        if(n==0) return 5;
        else if(n==1) return 8;
        else return rig(n-1)-rig(n-3);
    }

    private static void exer01() {
        System.out.println("Exer 1");
        System.out.println("rig(4) = " + rig(4));
    }

    private static int mm(int n){
        if(n<=0) return 10;
        else return n + mm(n-1);
    }

    private static void exer02() {
        System.out.println("Exer 2");
        System.out.println("mm(6) = " + mm(6));
    }

    private static int adrml(int n){
        if(n<=1) return n;
        else return n * adrml(n-2);
    }

    private static void exer03() {
        System.out.println("Exer 3");
        System.out.println("adrml(5) = " + adrml(5));
    }

    private static int bud(int n){
        if(n>5) return n-2;
        else return n + bud(n+1);
    }

    private static void exer04() {
        System.out.println("Exer 4");
        System.out.println("bud(6) = " + bud(1));
    }

    private static int zing(int n){
        if(n>10) return n-2;
        else {
            n = n * 3;
            return n + zing(n+2);
        }
    }

    private static void exer05() {
        System.out.println("Exer 5");
        System.out.println("zing(0) = " + zing(0));
    }

    private static void crch(int n){
        if(n<=0) {
            System.out.print(n);
        } else {
            crch(n/3);
            System.out.print(", "+n);
        }
        System.out.println("\n---");
    }

    private static void exer06() {
        System.out.println("Exer 6");
        crch(12);
    }

    private static void elvis(int n){
        if(n<=3) System.out.print(n+1);
        else {
            elvis(n-3);
            System.out.print(">> "+(n-1));
        }
    }

    private static void exer07() {
        System.out.println("Exer 7");
        elvis(11);
    }

    private static int sal(int n){
        if(n==2) return 100;
        else if(n==3) return 200;
        else return (2 * sal(n-1) + sal(n-2) + 1);
    }

    private static void exer08() {
        System.out.println("Exer 8");
        System.out.println("sal(5) = " + sal(5));
    }

    private static void puf(int n){
        if(n==1) System.out.print("x");
        else if(n% 2 == 0) //n is even 
        {
            System.out.print("{");
            puf(n-1);
            System.out.print("}");
        }
        else //n is odd
        {
            System.out.print("<");
            puf(n-1);
            System.out.print(">");
        }
    }

    private static void exer09() {
        System.out.println("Exer 9");
        puf(4);
    }

    private static void bc(int p, int q){
        if(p/q == 0) System.out.println(p+q+1);
        else {
            System.out.println(p);
            bc(p/q, q);
        }
    }

    private static void exer10() {
        System.out.println("Exer 10");
        bc(6, 2);
    }
}
