package bpj.lesson19;

public class ArrayTest {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        prob7();
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
}
