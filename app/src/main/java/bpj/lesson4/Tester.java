package bpj.lesson4;

public class Tester {

    public static void main(String[] args) {
        System.out.println("Hello World");

        // exercise 1
        int h = 103;
        int p=5;
        System.out.println("exercise 1: "+(++h + p)+" ::expected 109");
        System.out.println("exercise 1: "+(h)+" ::expected 104");
        System.out.println(h++);// expect 104
        System.out.println("exercise 1: "+(h)+" ::expected 105");

        // exercise 2
        int j = 0;
        System.out.println("exercise 2: "+ (++j)+" ::expected 1");
        System.out.println(j++);// expect 1 again
        System.out.println("exercise 2: "+ (j+1)+" ::expected 3");

        // exercise 3
        double def;
        double f = 1992.37;
        def = f;
        System.out.println("exercise 3: "+ def);

        // exercise 4
        int zulu = 10;
        System.out.println("zulu = " + zulu--);
        System.out.println("zulu = " + zulu);

        // exercise 5
        int a=100;
        int b=200;
        b/=a;
        System.out.println(b+1);

        // exercise 6
        int v = 100;
        int p1=40;
        v-= p1 - 30;
        System.out.println(v + " ::expected 90");

        // exercise 7
        v =100;
        v = v - (p1 - 30);
        System.out.println(v + " ::expected 90");

        // exercise 8
        int p2 = p1;
        int q=4;
        System.out.println((2 + 8 * q / 2 - p2)+" ::expected -22");

        // exercise 9
        int sd = 12;
        int x=4;
        System.out.println((sd % (++x))+" ::expected 0");

        // exercise 10
        int g;
        g = 3;//3=g; compile error
        System.out.println(++g * 79);

        // exercise 11
        double m1= 3.14, b1= 3.14, f1 = 3.14;
        System.out.println(m1 == f1);

        // exercise 12
        int x1, y1, z1;

        // exercise 13
        int m = 36;
        int j1=5;
        m = m/j1;
        System.out.println(m);

        // exercise 14
        System.out.println(3/4 + 5*2/33 -3 +8*3);// expected 22.xx

        // exercise 15: what is the assignment operator?

        // exercise 16
        int i2 = 100;
        int j2 = 30;
        int k = i2 % j2;
        System.out.println(k);

        // exercise 17
        int j3=2;
        System.out.println(7%3 + j3++ + (j3-2));// expected 3

        // exercise 18
        System.out.println(--j2);// expected 29
        System.out.println(j2--);// expected 29
        System.out.println(j2 - 1);// expected 27


        // project: cheating on your arithmetic assignment
        String expression1 = "79 + 3 * (4 + 82 - 68) - 7 + 19 = ";
        String expression2 = "(179 + 21 + 10) / 7 + 181 = ";
        String expression3 = "10389 * 56 * 11 + 2246 = ";
        System.out.println(expression1 + (79 + 3 * (4 + 82 - 68) - 7 + 19) + " ::expected 145");
        System.out.println(expression2 + ((179 + 21 + 10) / 7 + 181) + " ::expected 211");
        System.out.println(expression3 + (10389 * 56 * 11 + 2246) + " ::expected 6401870");

    }
}
