package bpj.lesson19;

import java.util.Arrays;

import bpj.lesson15.BankAccount;
import bpj.lesson15.Circle;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("Lesson 19: more on Arrays");

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
    }

    private static void exer1(){
        System.out.println("Exercise 1: ");
        BankAccount[] accounts = new BankAccount[300];
        accounts[47] = new BankAccount(97);
        accounts[102] = new BankAccount(1007);
        System.out.println("--------------------------------");
    }

    private static void exer2(){
        System.out.println("Exercise 2: ");
        int[] k = {1,2,3,4,4,5,6};
        int[] jm = {4,5,7,8,9,1,2,3};
        if(k[3] == jm[5])
            System.out.println("the two elements k[3] and jm[5] have equal values");
            else System.out.println("the two elements are not equal");
        System.out.println("--------------------------------");
    }

    private static void exer3(){
        System.out.println("Exercise 3: ");
        String[] s = {"my","jolly","folks","are","so","pleasing"};
        String[] ss = {"even","when","times","get","tough","the","tough","gets","going","and","they","keep","going","again","and","again","such","are","my","folks"};

        if(s[2].equals(ss[19])) System.out.println("the two String elements are having same values");
        else System.out.println("the String elements are not equal");
        System.out.println("--------------------------------");
    }

    private static void exer4(){
        System.out.println("Exercise 4: ");
        Circle[] cir = new Circle[12];
        Circle[] cirr = new Circle[12];
        cir[2] = new Circle(20);
        cirr[10] = new Circle(20);

        if(cir[2].equals(cirr[10])) System.out.println("the two circles have same radius");
        else System.out.println("the two circles are not same");
        System.out.println("--------------------------------");
    }

    private static void exer5(){
        System.out.println("Exercise 5: ");
        char months[];
        // months[0] = 'j';
        System.out.println("The months array is not initialized and hence we cannot assign a character value to it");
        System.out.println("--------------------------------");
    }

    private static void exer6(){
        System.out.println("Exercise 6: ");
        String suv[] = new String[20];
        int j=0;
        while(j < 17){
            suv[j] = "hello";
            j++;
        }
        System.out.println("the Logical size of suv array is 20; suv.length = "+suv.length);
        System.out.println("the Physical size of suv array is 17, as we assign string values only till that index");
        System.out.println("--------------------------------");
    }

    private static void exer7(){
        System.out.println("Exercise 7: ");
        String d = "the quick brown fox jumped over the lazy dog";
        char[] qbf = d.toCharArray();
        System.out.println("array qbf = "+Arrays.toString(qbf));
        System.out.println("--------------------------------");
    }

    private static void exer8(){
        System.out.println("Exercise 8: ");
        double rub[] = {23.0,-102.1,88.23,111,12.02,189.119,299.88};
        double dub[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Array dub initially = "+Arrays.toString(dub));
        System.arraycopy(rub, 3, dub, 4, 3);
        System.out.println("Array dub after arraycopy = "+Arrays.toString(dub));
        System.out.println("--------------------------------");
    }

    private static void exer9(){
        System.out.println("Exercise 9: ");
        double[] zz, top = {12.1,13.1,14.1,15.1,18};
        zz = top;
        zz[2]=99;
        top[3]=100.2;
        System.out.println("array zz "+Arrays.toString(zz));
        System.out.println("array top "+Arrays.toString(top));
        System.out.println("--------------------------------");
    }

    private static void exer10(){
        System.out.println("Exercise 10: ");
        char[] a,b;
        a = "Groovy dude".toCharArray();
        b = "I like this".toCharArray();

        System.arraycopy(a, 1, b, 0, 4);
        System.out.println("updated array b = "+Arrays.toString(b));
        System.out.println("--------------------------------");
    }

    private static void exer11(){
        System.out.println("Exercise 11: ");
        System.out.println("Q: what must be true of any arrays before we can use Arrays.binarySearch()");
        System.out.println("A:");
        System.out.println("--------------------------------");
    }

    private static double[] myArray = {189.01,2000,-32,56,182,2};
    private static void exer12(){
        System.out.println("Exercise 12: ");
        System.out.println("myArray before sorting = "+Arrays.toString(myArray));
        Arrays.sort(myArray);
        System.out.println("myArray after sorting = "+Arrays.toString(myArray));
        System.out.println("--------------------------------");
    }

    private static void exer13(){
        System.out.println("Exercise 13: ");
        System.out.println("binary search for 56 = "+Arrays.binarySearch(myArray, 56));
        System.out.println("binary search for 102 = "+Arrays.binarySearch(myArray, 102));
        System.out.println("--------------------------------");
    }

    private static void exer14(){
        System.out.println("Exercise 14: ");
        int[] xc = {123,97,-102,17};
        int[] pk = {123,79,-102,17};
        int[] gs = {123,97,-102,17};
        System.out.println("check --> xc?=pk and xc?=gs");
        System.out.println(Arrays.equals(xc, pk) +"\n"+ Arrays.equals(xc, gs));
        System.out.println("--------------------------------");
    }

    private static void exer15(){
        System.out.println("Exercise 15: ");
        int pickle[] = {1,2,3,4,5,6,7,8};
        System.out.println("when initialized, at 4th position: "+pickle[4]);
        Arrays.fill(pickle, -1);
        System.out.println("after filling, at 4th position: "+pickle[4]);
        System.out.println("--------------------------------");
    }

    private static void exer16(){
        System.out.println("Exercise 16: ");
        System.out.println("command line reads: java BigClass Munster Herman dude");
        System.out.println("Q: inside main method what will the next line print?");
        System.out.println("System.out.println(\"Name=\"+args[2]+args[1])");
        System.out.println("A: Name = dudeHerman");
        System.out.println("--------------------------------");
    }

    private static void exer17(){
        System.out.println("Exercise 17: ");
        int[] px = {3,4,5,6,7,8,9};
        System.out.println("Q: what does the following print");
        System.out.println(px[ px[1] + 1 ]);
        System.out.println("A: that should show element at index 4+1 which is 8");
        System.out.println("--------------------------------");
    }

    private static void exer18(){
        System.out.println("Exercise 18: ");
        DummyClass[] objArray = new DummyClass[4];
        objArray[0] = new DummyClass(2);
        objArray[1] = new DummyClass(5);
        objArray[2] = new DummyClass(8);
        objArray[3] = new DummyClass(1);

        int accumulatedValue=1;
        for(DummyClass dc: objArray){
            accumulatedValue *= dc.getJj();
        }
        System.out.println("accumulated value = "+accumulatedValue);

        System.out.println("--------------------------------");
    }
}
