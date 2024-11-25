package bpj.lesson28;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("Lesson 28: Bitwise operators");

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
    }

    private static void exer01(){
        System.out.println("Exercise 01:");
        System.out.println("Q: what is the bitwise operator for AND");
        System.out.println("Ans: & ");
        System.out.println("--------------------");
    }

    private static void exer02(){
        System.out.println("Exercise 02:");
        System.out.println("Q: what is the boolean operator for AND");
        System.out.println("Ans: && ");
        System.out.println("--------------------");
    }

    private static void exer03(){
        System.out.println("Exercise 03:");
        System.out.println("Q: what is the bitwise operator for OR");
        System.out.println("Ans: | ");
        System.out.println("--------------------");
    }

    private static void exer04(){
        System.out.println("Exercise 04:");
        System.out.println("Q: what is the boolean operator for OR");
        System.out.println("Ans: || ");
        System.out.println("--------------------");
    }

    private static void exer05(){
        System.out.println("Exercise 05:");
        System.out.println("Q: what is the bitwise operator for exclusive-OR");
        System.out.println("Ans: ^ ");
        System.out.println("--------------------");
    }

    private static void exer06(){
        System.out.println("Exercise 06:");
        System.out.println("Q: what is the bitwise operator for NOT");
        System.out.println("Ans: ~ ");
        System.out.println("--------------------");
    }

    private static void exer07(){
        System.out.println("Exercise 07:");
        System.out.println("Q: what is the boolean operator for NOT");
        System.out.println("Ans: ! ");
        System.out.println("--------------------");
    }

    private static int j = 79, k = 82, p = 112, q = 99;

    private static void exer08(){
        System.out.println("Exercise 08:");
        System.out.println((137) | q);
        System.out.println("--------------------");
    }

    private static void exer09(){
        System.out.println("Exercise 09:");
        System.out.println((137) & (121));
        System.out.println("--------------------");
    }

    private static void exer10(){
        System.out.println("Exercise 10:");
        int a = 137;
        int b = 0x3A;
        // boolean bln = (a && b);
        // System.out.println((137) && (0x3A));// binary operator or boolean operator only works on boolean parameters
        System.out.println("wont compile -- binary operator needs boolean operands");
        System.out.println("--------------------");
    }

    private static void exer11(){
        System.out.println("Exercise 11:");
        System.out.println((137) ^ (121));
        System.out.println("--------------------");
    }

    private static void exer12(){
        System.out.println("Exercise 12:");
        System.out.println(p|j);
        System.out.println("--------------------");
    }

    private static void exer13(){
        System.out.println("Exercise 13:");
        System.out.println(~465);
        System.out.println("--------------------");
    }

    private static void exer14(){
        System.out.println("Exercise 14:");
        System.out.println(j^(0x4B));
        System.out.println("--------------------");
    }

    private static void exer15(){
        System.out.println("Exercise 15:");
        System.out.println(j&k);
        System.out.println("--------------------");
    }

    private static void exer16(){
        System.out.println("Exercise 16:");
        // System.out.println(p||j);
        System.out.println("wont compile -- binary operator needs boolean parameters");
        System.out.println("--------------------");
    }

    private static void exer17(){
        System.out.println("Exercise 17:");
        System.out.println(p^q);
        System.out.println("--------------------");
    }

    private static void exer18(){
        System.out.println("Exercise 18:");
        System.out.println(~(-k));
        System.out.println("--------------------");
    }

    private static void exer19(){
        System.out.println("Exercise 19:");
        System.out.println("Q: what does 'msb' stand for");
        System.out.println("Ans: msb = most significant bit");
        System.out.println("--------------------");
    }

    private static void exer20(){
        System.out.println("Exercise 20:");
        System.out.println("Q: what will you get if you bitwise-exclusive-OR two 1s");
        System.out.println(1 ^ 1);
        System.out.println("Ans: 0");
        System.out.println("--------------------");
    }

    private static void exer21(){
        System.out.println("Exercise 21:");
        System.out.println("Q: what can be said about an integer if its most significant bit is 1");
        System.out.println("Ans: msb of 1 means the integer is a negative number");
        System.out.println("--------------------");
    }

    private static void exer22(){
        System.out.println("Exercise 22:");
        System.out.println("Q: an integers msb is 1. if this integer is multiplied by -27 what will be the resulting sign?");
        System.out.println("Ans: the resulting sign will be positive, msb will be 0.");
        System.out.println("--------------------");
    }
}
