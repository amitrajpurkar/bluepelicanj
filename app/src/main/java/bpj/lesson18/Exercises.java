package bpj.lesson18;

import java.util.Arrays;

public class Exercises {

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
        // exer15();

        exer16();
        exer17();
        exer18();
        exer19();
    }

    private static void exer1() {
        System.out.println("Exercise 1: ");
        double[] sgt = new double[800];
        System.out.println("length of sgt array is "+sgt.length);
        System.out.println("--------------------------------");
    }

    private static void exer2() {
        System.out.println("Exercise 2: ");
        double []dfw = new double[21];
        System.out.println("length of dfw array is "+dfw.length);
        System.out.println("--------------------------------");
    }

    private static void exer3() {
        System.out.println("Exercise 3: ");
        double[] sgt = new double[800];
        for (int i = 0; i < sgt.length; i++) {
            sgt[i] = Math.sqrt(i);
        }
        int r = (int) Math.round(Math.random()* 800);
        System.out.println("element at index "+r +" is "+sgt[r]);
        System.out.println("--------------------------------");
    }

    private static void exer4() {
        System.out.println("Exercise 4: ");
        String[] rtl = new String[10];
        double rtl_len = rtl.length;
        System.out.println("we can use rtl.length and NOT rtl.length()... length is not a method, its a property");
        System.out.println("--------------------------------");
    }

    private static char[] cr = {'a','b','c','d','e'};
    private static void exer5() {
        System.out.println("Exercise 5: ");
        
        System.out.println("char array cr is "+Arrays.toString(cr));//cr.toString() will print representation of object
        System.out.println("--------------------------------");
    }

    private static void exer6() {
        System.out.println("Exercise 6: ");
        System.out.println("value of cr.length is "+cr.length);
        System.out.println("--------------------------------");
    }

    private static void exer7() {
        System.out.println("Exercise 7: ");
        int[] ref = {1, 2, 3, 4, 5, 6, 7};
        double sum_of_squares=0;
        for (int i = 0; i < ref.length; i++) {
            sum_of_squares += Math.pow(i, 2);
        }
        System.out.println("given the array = "+Arrays.toString(ref)
            +"; the sum of squares of each element is"+sum_of_squares);
        System.out.println("--------------------------------");
    }

    private static void exer8() {
        System.out.println("Exercise 8: ");
        int[] homer = {1,2,3,4};
        try {
            for (int k = 2; k < homer.length; k++) {
                homer[k+1]=k;
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("--------------------------------");
    }

    private static void exer9() {
        System.out.println("Exercise 9: ");
        System.out.println("line 1: double[] dbx = {1,2,3,4};");
        System.out.println("line 2: boolean bbc = heroWorship(dbx);");
        System.out.println("line 3: public boolean heroWorship(double[] vb);");
        System.out.println("--------------------------------");
    }

    private static int[] adc = {34,56,-102,18,5};
    private static void exer10() {
        System.out.println("Exercise 10: ");
        System.out.println("elem at index 1 = "+adc[1]);
        System.out.println("--------------------------------");
    }

    private static void exer11() {
        System.out.println("Exercise 11: ");
        System.out.println("sum of elem at idx 3, 4 is "+(adc[3] + adc[4]));
        System.out.println("--------------------------------");
    }

    private static void exer12() {
        System.out.println("Exercise 12: ");
        try {
            System.out.println("elem at index 5 "+adc[5]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("--------------------------------");
    }

    private static void exer13() {
        System.out.println("Exercise 13: ");
        System.out.println("what will the following code do?");
        System.out.println("line 1: for(int j=0; j<b.length; j++)");
        System.out.println("line 2: b[j]=Maths.abs(b[j])");
        System.out.println("ans:  the loop will replace each element of array b, with its absolute value");
        System.out.println("--------------------------------");
    }

    private static void exer14() {
        System.out.println("Exercise 14: ");
        int[] c = {1,2,3,4};
        String ss = ">>>";
        int len = ss.length();
        for (int j = 0; j < len; j++) {
            ss+=c[j];
        }
        System.out.println("string ss = "+ss);
        System.out.println("--------------------------------");
    }

    private static void exer15() {
        System.out.println("Exercise 15: ");
        int[] i1 = {1,2,3,4};
        int[] i2 = {5,6,7,-8};
        int[] i3 = {1,2,3,-5,6,7,8};
        System.out.println("index of first negative number in i1 = "+firtOccuranceOfNeg(i1)+"; expecting lenth of i1 = "+i1.length);
        System.out.println("index of first negative number in i2 = "+firtOccuranceOfNeg(i2)+"; expecting 3");
        System.out.println("index of first negative number in i3 = "+firtOccuranceOfNeg(i3)+"; expecting 3");
        System.out.println("--------------------------------");
    }

    private static int firtOccuranceOfNeg(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < 0) {
                return j;//index of negative number
            }
        }
        return arr.length;
    }

    private static void exer16() {
        System.out.println("Exercise 16: ");
        String wc = "Whooping crane";
        String sp[] = wc.split("oo");
        for (int j = 0; j < sp.length; j++) {
            System.out.println("sp[j] = "+sp[j]);
        }
        System.out.println("--------------------------------");
    }

    private static void exer17() {
        System.out.println("Exercise 17: ");
        String[] sArray = "fee   fi fo  ".split("\\s+");
        for (String elem : sArray) {
            System.out.println("element = "+elem);
        }
        System.out.println("--------------------------------");
    }

    private static void exer18() {
        System.out.println("Exercise 18: ");
        String[] sp = "One two".split("Q");
        for (String elem : sp) {
            System.out.println("element = "+elem);
        }
        System.out.println("--------------------------------");
    }

    private static void exer19() {
        System.out.println("Exercise 19: ");
        String s = "The best THERE is is Barth";
        String[] sp = s.toLowerCase().split("th");
        int occurances = sp.length;
        System.out.println("occurances of TH (should be 3) using split method = "+occurances);
        System.out.println("--------------------------------");
    }
}
