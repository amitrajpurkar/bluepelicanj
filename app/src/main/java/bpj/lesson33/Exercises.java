package bpj.lesson33;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("Lesson 33: Selection/ Tertiary Operator");

        exer01();
        exer02();
        exer03();
        exer04();

        exer05();
        exer06();
        exer07();
        exer08();
    }

    private static void exer01(){
        System.out.println("Exercise 01:");
        System.out.println("Q: write equivalent code using if statement");
        System.out.println("original code :: j = kimTrq < jDorch ? Math.pow(3, p) : p*p ");
        System.out.println("if(kimTrq < jDorch) {");
        System.out.println("  j = Math.pow(3,p);");
        System.out.println("} else { ");
        System.out.println("  j = p*p;");
        System.out.println("} ");
        System.out.println("---------------------");
    }

    private static void exer02(){
        System.out.println("Exercise 02:");
        System.out.println("what is the output?");
        boolean a=true, b=false;
        int m=200;
        System.out.println("((a && b)? m*m : --m) == "+(a&&b ? m*m : --m));
        System.out.println("Expected:: 199");
        System.out.println("---------------------");
    }

    private static void exer03(){
        System.out.println("Exercise 03:");
        System.out.println("what is the output?");
        boolean m=true, n=true;
        boolean v = m||n ? (m && !n) : (m || !n);
        System.out.println("expect false --> v = "+v);
        System.out.println("---------------------");
    }

    private static void exer04(){
        System.out.println("Exercise 04:");
        double g=5.0, h=-2.0, s=9.0;
        int ii = (g >= h) ? (int)(h+2) : (int)(s++);
        System.out.println("expect 0 --> ii = "+ii);
        System.out.println("---------------------");
    }

    private static void exer05(){
        System.out.println("Exercise 05:");
        System.out.println("what is the output?");
        int soy=12, tobasco=10, noodles=4, sauce=0;
        int ugh = (Math.pow(soy, noodles)<tobasco) ? 12 : sauce == tobasco? 11: 122;
        System.out.println("expect 122 --> ugh = "+ugh);
        System.out.println("---------------------");
    }

    private static void exer06(){
        System.out.println("Exercise 06:");
        System.out.println("rewrite if statement as tertiary");
        int bq=2, j=10, z=0;
        if(bq<j+1){
            z = 1;
        } else {
            z = 2;
        }
        z = (bq < j+1)? 1 : 2;
        System.out.println("z = (bq < j+1)? 1 : 2;");
        System.out.println("---------------------");
    }

    private static void exer07(){
        System.out.println("Exercise 07:");
        System.out.println("what is the output?");
        String toy = "Tickle me Elmo";
        double price = 20.13;
        String s = (toy.equals("Barbie"))? (price > 20.13)? "maybe" : "yes" : "no way";
        System.out.println("expect 'no way' -- > s = "+s);
        System.out.println("---------------------");
    }

    private static void exer08(){
        System.out.println("Exercise 08:");
        System.out.println("what would have been answer to exercise 7, if toy was indeed Barbie?");
        System.out.println("Ans: the answer would have been 'yes' !!");
        System.out.println("---------------------");
    }
}
