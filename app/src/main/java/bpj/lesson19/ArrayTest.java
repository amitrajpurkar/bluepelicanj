package bpj.lesson19;

public class ArrayTest {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        prob8();
    }

    private static void prob7(){
        String s1 = "abcdefghijk";
        char[] x = s1.toCharArray();
        String s2 = "mnopqrstuvw";
        char[] y = s2.toCharArray();

        int[] vv = {0,1,0,1};
        for(int j=0;j<vv.length;j++){
            //System.out.println(vv[j]);
            switch(vv[j]){
                case 0: System.out.print(x[j]); break;
                case 1: System.out.print(y[j+1]); break;
            }
        }
        System.out.println("\n-------------------");
    }

    private static void prob8(){
        int[] a = {0,1,2,3};
        int[] b = a;
        int sum = 0;
        for(int j=0;j<3;j++){
            sum += (a[j+1] * b[j]) + (a[j] * b[j+1]);
        }
        System.out.println("Value of sum = " + sum);
        System.out.println("-------------------");
    }

    private static void prob9(){
        int[] z1 = {2,3,4,5,6};
        int[] z2 = {1,2,1,2,1};
        double d = 0;
        for(int j=0;j<3;j++){
            d = d + Math.pow((z1[j+1]), 2) + Math.pow((z2[j]), 2);
        }
        System.out.println("Value of d = " + d);
        System.out.println("-------------------");
    }
}
