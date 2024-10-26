package bpj.lesson19;

import java.util.Arrays;

public class ContestType {
    public static void main(String[] args) {
        System.out.println("Lesson 19: Contest Type Problems");

        // prob01();
        // prob02();
        // prob03();
        // prob04();
        // prob05();

        prob06();
        // prob07();
        // prob08();
        // prob09();
        // prob10();
    }

    private static int[] gem = {-102,14,5,100,-100};
    private static void prob01(){
        System.out.println("Problem 1:");
        System.out.println("Q: what is the value of gem[1]");
        System.out.println("check the value ="+gem[1]);
        System.out.println("Ans: B. 14");
        System.out.println("--------------------------------");
    }

    private static void prob02(){
        System.out.println("Problem 2:");
        int[] c1 = Arrays.copyOf(gem, gem.length);
        int[] c2 = Arrays.copyOf(gem, gem.length);
        System.out.println("original array = "+Arrays.toString(gem));
        Arrays.sort(c1);
        System.out.println("sort by Arrays.sort = "+Arrays.toString( c1 ));
        // ArrayList l = new ArrayList<>(gem);
        // Collections.sort(Arrays.asList(gem));//collections work on List

        System.out.println("Q: which code will sort the array");
        System.out.println("Ans: C. Arrays.sort(gem); // this is the only one. Collections work on List");
        System.out.println("--------------------------------");
    }

    private static int nerdStuff(int[] arr){
        int counter =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<3){
                ++counter;
            }
        }
        return counter;
    }
    private static void prob03(){
        System.out.println("Problem 3:");
        int[] stk = {1,5,19,2,20,180};
        int g = nerdStuff(stk) + 1;
        System.out.println("Q: what is the value of g");
        System.out.println("Ans: A. 3; lets see = "+g);
        System.out.println("--------------------------------");
    }

    private static void prob04(){
        System.out.println("Problem 4:");
        System.out.println("Q: which one is the proper way to declare and initialize an array");
        System.out.println("one option-- int[] arr = new int[10];// defaults to value zero for each element");
        System.out.println("another option-- int[] arr = {1,2,3,4,5,6,7,8,9,10};");

        int [] c1 = new int[]{1,2,3,4};
        // int[10] c2 = {1,2,3,4};
        // int c3 = {1,2,3,4};
        // int [] c4 = new int {1,2,3,4};

        System.out.println("Ans: A is correct");

        System.out.println("--------------------------------");
    }

    private static void testLoop(int[] arr){
        for (int idx = 0; idx < arr.length; idx++) {
            ++arr[idx];
        }
    }
    private static void prob05(){
        System.out.println("Problem 5:");
        System.out.println("Q: what should replace at <*I>");
        System.out.println("it needs to be i < arr.length");
        System.out.println("Ans: E none of these ... each one has error");
        System.out.println("--------------------------------");
    }

    private static void prob06(){
        System.out.println("Problem 6:");
        int[] a = {1,2,3,19,5,6,7,8,9,10};
        System.out.println("the value of a[3] before calling method is = "+a[3]);
        testLoop(a);
        System.out.println("the value of a[3] after calling method is = "+a[3]);
        System.out.println("Ans: D. 20");

        System.out.println("--------------------------------");
    }

    private static void prob07(){
        System.out.println("Problem 7:");
        System.out.println("Ans: C aocq is the answer... check ArrayTest class");
        System.out.println("--------------------------------");
    }

    private static void prob08(){
        System.out.println("Problem 8:");
                
        System.out.println("--------------------------------");
    }

    private static void prob09(){
        System.out.println("Problem 9:");

        System.out.println("--------------------------------");
    }

    private static void prob10(){
        System.out.println("Problem 10:");

        System.out.println("--------------------------------");
    }
}
