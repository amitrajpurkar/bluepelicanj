package bpj.lesson34;

import bpj.lesson15.Circle;

public class ContestType {
    public static void main(String[] args) {
        System.out.println("Contest Type Problems");

        int[] prf = {13,22,89,15};
        double d = 30.89;
        Circle myCir = new Circle(18);
        myCir.setRadius(14);

        fg(prf, d, myCir);

        System.out.println("in main.. d = "+d);
        System.out.println("prf[2] = "+ prf[2]);
        System.out.println("myCir.rad = "+myCir.getRadius());

        System.out.println("Problem 1: A. 30.89 ... value of d in main remains unchanged");
        System.out.println("Problem 2: B. 16 ...  array is passed by ref.. hence value at index 2 is changed");
        System.out.println("Problem 3: C. 122.. Object Circle is passed by ref.. hence radius is changed");
        System.out.println("Problem 4: B. 32.89.. inside the method that value of the copy of d changes");
        System.out.println("Problem 5: A. 0th and 3rd index elements are exchanged");

        int[] gem = {2,3,4,5,6};
        harvest(gem);
        for (int k = 0; k < gem.length; k++) System.out.print(gem[k] + " ");
        System.out.println("\n");

        System.out.println("Problem 6: A. is the answer as seen above");
    }

    public static void fg(int[] x, double d, Circle c){
        d++;
        x[2] = 16;
        c.setRadius(122);
        System.out.print("inside fg.. ");
        System.out.println(d++);

        /**
         * int[] nn = new int[x.length];
         * nn[3] = x[0];
         * x = nn;
         */
    }

    public static void harvest(int[] h){
        int z[] = new int[h.length];
        for (int j = 0; j < z.length; j++) z[j] = j * 2;
        
        h[2] = 7;

        for (int k = 0; k < h.length; k++) System.out.print(h[k] + " ");
        System.out.println("\n");
        h = z;
        for (int k = 0; k < h.length; k++) System.out.print(h[k] + " ");
        System.out.println("\n");

    }
}
