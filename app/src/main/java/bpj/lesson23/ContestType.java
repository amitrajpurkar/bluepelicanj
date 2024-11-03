package bpj.lesson23;

import java.util.StringTokenizer;

public class ContestType {
    public static void main(String[] args) {
        System.out.println("Lesson 23: Contest Type Problems");

        prob01();
        prob02();
        prob03();
        prob04();
        prob05();
        prob06();
    }

    private static void prob01() {
        System.out.println("Problem 1:");
        int m=3, n=4, p=5;
        String s="5;4+5=9;3";
        StringTokenizer st = new StringTokenizer(s, ";");
        while(st.hasMoreTokens()){
            System.out.print(st.nextToken());
        }
        System.out.println("Q: check the value printed above");
        System.out.println("Ans: C. 54+5=93");
        System.out.println("--------------------------------");
    }

    private static int total(String str){
        StringTokenizer t = new StringTokenizer(str);
        int sum = 5;
        while(t.hasMoreTokens()){
            sum += Integer.parseInt(t.nextToken());
        }
        return sum+1;
    }

    private static void prob02() {
        System.out.println("Problem 2:");
        System.out.println("Q: what should be passed as parameter to total() to get back 17?");
        System.out.println("A. 11 gives... "+ total("11"));//17
        System.out.println("B. 3 8 0 gives... "+ total("3 8 0"));//17
        System.out.println("C. 7\\n2 1\\n1 gives... "+ total("7\n2 1\n1"));//17
        System.out.println("D. 15 -1 -2 -1 gives... "+ total("15 -1 -2 -1"));//17
        System.out.println("E. All of above ");
        System.out.println("Ans: E all of above");

        System.out.println("--------------------------------");
    }

    private static void prob03() {
        System.out.println("Problem 3:");
        double[] md = {100.3, 100.4, 100.5, 100.6};
        int k = 0;
        String b = "0 1 2";
        StringTokenizer st = new StringTokenizer(b);
        while(st.hasMoreTokens()){
            String str = new String(st.nextToken());
            System.out.println(str);
            double val = Double.parseDouble(str);
            ++k;
            md[k]+=val;
        }
        System.out.println("md[1] = "+md[1]);   
        System.out.println("Q: what is the output?");
        System.out.println("A. 100.4");

        System.out.println("--------------------------------");
    }

    private static void prob04() {
        System.out.println("Problem 4:");
        double[] md = {1,2,3,4};
        int j;
        String b = "0 1 2";
        StringTokenizer st = new StringTokenizer(b);
        int k = st.countTokens();
        for(j=1; j<=k; j++){
            double f = Double.parseDouble(st.nextToken());
            System.out.println(j+" "+f+" "+md[j]);
            if(j%2 == 1){
                md[j]*=f;
            } else{
                md[j]/=f;
            }
        }
        System.out.println("md[j-1] = "+md[j-1]);
        System.out.println("Q: what is the output?");
        System.out.println("Ans: B. 8");

        System.out.println("--------------------------------");
    }

    private static void prob05() {
        System.out.println("Problem 5:");
        String s = "Four-score and seven years ago";
        StringTokenizer st = new StringTokenizer(s, " -");
        for(int j=0;j<5;j++) System.out.print(st.nextToken());
        System.out.println("Q: what is the output?");
        System.out.println("Ans: C. Fourscoreandsevenyears");

        System.out.println("--------------------------------");
    }

    private static void prob06() {
        System.out.println("Problem 6:");
        System.out.println("Q: how will the output change is for-looop is this:: for(int j=1;j<=5;j++)?");
        System.out.println("Ans: B. No change");//iterations in for-loop are exactly same. 0-till-4 vs 1-till-5

        System.out.println("--------------------------------");
    }
}
