package bpj.lesson22;

public class ContestType {
    public static void main(String[] args) {
        System.out.println("Lesson 22: Contest Type Problems");

        prob01();
        prob02();
        prob03();
        prob04();
    }

    private static void prob01() {
        System.out.println("Problem 1:");
        int j=2, k=3;
        Integer bj, bk;
        while(k>0){
            j = j*k;
            k = k/2;
        }
        bj = j;
        bk = k;
        System.out.println(bj + bk);

        System.out.println("Q: what is the output?");
        System.out.println("Ans: B. 6");

        System.out.println("--------------------------------");
    }

    private static void getAsum(String a){
        int total=0;
        Integer p1, p2;
        for(int j=a.length()-1;j>1;j--){
            p1 = j-1;
            p2 = j;
            total+=j;
        }
        System.out.println(total);
    }

    private static void prob02() {
        System.out.println("Problem 2:");
        System.out.println("what is getAsum(22222)?");
        getAsum("22222");

        System.out.println("ANS: A. 9 (4 + 3 + 2  = 9 ??)");
        System.out.println("--------------------------------");
    }

    private static int theTest(int div){
        Integer trial;
        double d = Math.PI / div;
        trial = (int) d;
        return trial;
    }

    private static void prob03() {
        System.out.println("Problem 3:");
        System.out.println("Q: what is the output for theTest(2)?");
        System.out.println("trying theTest(2) = "+theTest(2));
        System.out.println("Ans: D. 1");
        System.out.println("--------------------------------");
    }

    private static double adjust(double d){
        d *= 2;
        Double dw = d;
        return dw;
    }

    private static void prob04() {
        System.out.println("Problem 4:");
        System.out.println("what is adjust(117.8) = "+adjust(117.8));
        System.out.println("Q: what is the output?");
        System.out.println("Ans: C. 235.6");

        System.out.println("--------------------------------");
    }
}
