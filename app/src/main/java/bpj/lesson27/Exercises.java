package bpj.lesson27;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("Lesson 27: Formatters... ");

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
    }

    private static void exer01(){
        System.out.println("Exercise 01:");
        double cv = 18.7713;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(1);
        nf.setMinimumFractionDigits(1);// atleast 1 decimal place is printed
        String formattedNumber = nf.format(cv);
        System.out.println("formattedNumber = " + formattedNumber);

        System.out.println("---------------------------");
    }

    private static void exer02(){
        System.out.println("Exercise 02:");
        System.out.println("Q: what type variable is returned by format method of NumberFormat class?");
        System.out.println("Ans: String");

        System.out.println("---------------------------");
    }

    private static void exer03(){
        System.out.println("Exercise 03:");
        double dv = 184.767123;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(3);// rounded to thousandth
        nf.setMinimumFractionDigits(2);// atleast 2 decimals printed
        String formattedNumber = nf.format(dv);
        System.out.println("formattedNumber = " + formattedNumber);

        System.out.println("---------------------------");
    }

    private static void exer04(){
        System.out.println("Exercise 04:");
        double db;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(4);// rounded to thousandth
        nf.setMinimumFractionDigits(3);// atleast 2 decimals printed

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        db = sc.nextDouble();
        String formattedNumber = nf.format(db);
        System.out.println("formattedNumber = " + formattedNumber);

        System.out.println("---------------------------");
    }

    private static void exer05(){
        System.out.println("Exercise 05:");
        float mn;
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "US"));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a dollar amount (dollar.cents): ");
        mn = sc.nextFloat();
        String formattedNumber = nf.format(mn);
        System.out.println("formatted amount = " + formattedNumber);

        System.out.println("---------------------------");
    }

    private static void exer06(){
        System.out.println("Exercise 06:");
        System.out.println("Q: what import does the NumberFormat class need?");
        System.out.println("Ans: import java.text.NumberFormat;");

        System.out.println("---------------------------");
    }

    private static void exer07(){
        System.out.println("Exercise 07:");
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println( nf.format(487.0871));

        System.out.println("---------------------------");
    }

    private static void exer08(){
        System.out.println("Exercise 08:");
        NumberFormat nf = NumberFormat.getPercentInstance();
        nf.setMinimumFractionDigits(3);
        nf.setMaximumFractionDigits(3);
        String str = nf.format(4.708832);
        System.out.println(str);

        System.out.println("---------------------------");
    }

    private static void exer09(){
        System.out.println("Exercise 09:");
        System.out.println("Q: what class lets you specify patterns like 0,000,000.## in determining the format of a number?");
        System.out.println("Ans: DecimalFormat");

        DecimalFormat df = new DecimalFormat("0,000,000.##");
        System.out.println(df.format(487.0871));

        System.out.println("---------------------------");
    }

    private static void exer10(){
        System.out.println("Exercise 10:");
        System.out.println("Q: in calling the getNumberInstance method of NumberFormat class, why do we have to preface it with NumberFormat as in NumberFormat.getNumberInstance()?");
        System.out.println("Ans: because NumberFormat is a static class and getNumberInstance is an instance method");

        System.out.println("---------------------------");
    }

    private static void exer11(){
        System.out.println("Exercise 11:");
        Formatter fmt = new Formatter();
        fmt.format("%s--->%-,10.3f--->%08.1e", "Formatting example", 189.11081, .07642);
        System.out.println(fmt);

        System.out.println("---------------------------");
    }

    /**
     * suppose you have a Formatter object called f.
     * Write code that will use f to produce String s
     * having double d left justified in a field 12 characters wide and rounded to 4 decimal places
     */
    private static void exer12(){
        System.out.println("Exercise 12:");
        Formatter f = new Formatter();
        double d = 189.11081;
        f.format("%-12.4f", d);
        String s = f.toString();
        System.out.println(s);

        System.out.println("---------------------------");
    }

    /**
     * Supose you have a Formatter object called f.
     * Write code that will use f to produce String s
     * having int i left justified in a field 11 characters wide. use comma separators
     */
    private static void exer13(){
        System.out.println("Exercise 13:");
        Formatter f = new Formatter();
        int i = 189;
        f.format("%-,11d", i);
        String s = f.toString();
        System.out.println(s);

        System.out.println("---------------------------");
    }

    private static void exer14(){
        System.out.println("Exercise 14:");
        System.out.println("Q: what is the output of the following code?");
        System.out.printf("--->|%3.6s|<---", "x");

        System.out.println("---------------------------");
    }

    private static void exer15(){
        System.out.println("Exercise 15:");
        int[] num = {57012, 26, 729};
        double[] money = {1200586.22, 187.91, 571267.03};

        for (int j = 0; j < 3; j++) {
            System.out.printf("%05d\t$%,12.2f\n", num[j], money[j]);
        }
        


        System.out.println("---------------------------");
    }

    private static void exer16(){
        System.out.println("Exercise 16:");
        System.out.println("Q: what is the output of the following code?");
        Formatter fmt = new Formatter();
        int i = 4893;
        fmt.format("start%012dend", i);
        String s = fmt.toString();
        System.out.println(s);
        fmt.close();

        System.out.println("---------------------------");
    }
}
