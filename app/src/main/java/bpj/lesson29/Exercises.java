package bpj.lesson29;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("Lesson 29: Bitwise operators more");

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
    }

    private static int m=45, k=102, p=4;

    private static void exer01(){
        System.out.println("Exercise 01:");
        System.out.println("m=45: m<<2 = "+(m<<2));

        System.out.println("-----------------------");
    }

    private static void exer02(){
        System.out.println("Exercise 02:");
        System.out.println("m=45: (m/2)>>2 = "+((m/2)>>2));

        System.out.println("-----------------------");
    }

    private static void exer03(){
        System.out.println("Exercise 03:");
        System.out.println("k=102,p=4: k<<p = "+(k<<p));

        System.out.println("-----------------------");
    }

    private static void exer04(){
        System.out.println("Exercise 04:");
        System.out.println("m=45: -m>>2 = "+(-m>>2));

        System.out.println("-----------------------");
    }

    private static void exer05(){
        System.out.println("Exercise 05:");
        System.out.println("k=102: k<<1 = "+(k<<1));

        System.out.println("-----------------------");
    }

    private static void exer06(){
        System.out.println("Exercise 06:");
        System.out.println("222>>>2 = "+(222>>>2));

        System.out.println("-----------------------");
    }

    private static void exer07(){
        System.out.println("Exercise 07:");
        System.out.println("p=4: p>>p = "+(p>>p));

        System.out.println("-----------------------");
    }

    private static void exer08(){
        System.out.println("Exercise 08:");
        int jz=3;
        int ii=5;
        System.out.println("(ii>2)&(jz==ii--) = "+((ii>2)&(jz==ii--)));//true & false = false
        System.out.println("ii = "+ii);

        System.out.println("-----------------------");
    }

    private static void exer09(){
        System.out.println("Exercise 09:");
        int mk=3;
        int sd=-4;
        System.out.println("(sd>2)&(sd==++mk) = "+((sd>2)&(sd==++mk)));//false & false = true
        System.out.println("mk = "+mk);

        System.out.println("-----------------------");
    }

    private static void exer10(){
        System.out.println("Exercise 10:");
        int mk=3;
        int sd=-4;
        System.out.println("(Math.abs(sd)>2)|(sd==++mk) = "+((Math.abs(sd)>2)|(sd==++mk)));//false |= false = false
        System.out.println("check mk values ");
        System.out.print(mk++);
        System.out.println(mk++);

        System.out.println("-----------------------");
    }

    private static void exer11(){
        System.out.println("Exercise 11:");
        System.out.println("122 & 18 & 79 = "+(122 & 18 & 79));

        System.out.println("-----------------------");
    }

    private static void exer12(){
        System.out.println("Exercise 12:");
        System.out.println("122 | 18 | 79 = "+(122 | 18 | 79));

        System.out.println("-----------------------");
    }

    private static void exer13(){
        System.out.println("Exercise 13:");
        System.out.println("122 | 18 & 79 = "+(122 | 18 & 79));

        System.out.println("-----------------------");
    }

    private static void exer14(){
        System.out.println("Exercise 14:");
        System.out.println("122 & 18 | 79 = "+(122 & 18 | 79));

        System.out.println("-----------------------");
    }
}
