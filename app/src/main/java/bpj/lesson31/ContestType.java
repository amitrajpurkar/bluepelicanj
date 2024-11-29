package bpj.lesson31;

public class ContestType {
    public static void main(String[] args) {
        System.out.println("Lesson 31: String Buffer -- Contest Type Problems");

        prob01();
        prob02();
        prob03();
        prob04();
        prob05();
    }

    private static void prob01() {
        System.out.println("Problem 1: ");
        System.out.println("Q: what is the possible output of below code?");
        StringBuffer sb = new StringBuffer();
        int[] t = {1, 2, 8, 9, 2};
        String s = "Do unto others as you would have them do unto you";
        char[] sc = s.toCharArray();
        for (int j = 0; j < t.length; j++) {
            if(t[j] == 2)
                sb.append(sc[j]);
        }
        System.out.println(sb);

        System.out.println("Ans: C. on");
        System.out.println("--------------------------------");
    }

    private static void prob02() {
        System.out.println("Problem 2: ");
        System.out.println("Q: what is the possible output of below code?");
        StringBuffer sb = new StringBuffer("groovy");
        String st = "dude";
        sb.append(st);
        System.out.println(sb);
        System.out.println("length = "+sb.length());

        System.out.println("Ans: A. 10");
        System.out.println("--------------------------------");
    }

    private static StringBuffer sbStuff(StringBuffer sb) {
        for (int j = 0; j < sb.length(); j++) {
            if(sb.charAt(j) >= 'q'-1) sb.setCharAt(j, 'x');
        }
        return sb;
    }

    private static void prob03() {
        System.out.println("Problem 3: ");
        System.out.println("Q: what is the possible output of below code?");
        StringBuffer asb = new StringBuffer("abcdef_mnopqrst");
        StringBuffer nsb = sbStuff(asb);
        System.out.println(nsb);

        System.out.println("Ans: D. abcdef_mnoxxxxx");
        System.out.println("--------------------------------");
    }

    private static String lefty(String s) {
        StringBuffer sb = new StringBuffer(s);
        try {
            for (int j = 0; j < sb.length(); j++) {
                if(sb.charAt(j)>='q'-1) sb.setCharAt(j, sb.charAt(j-2));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return sb.toString();
    }
    private static void prob04() {
        System.out.println("Problem 4: ");
        System.out.println("Q: what is the possible output of below code?");
        String s = lefty("Rubber ducky");
        System.out.println(s);

        System.out.println("Ans: D. Throws array index out of bounds exception");
        System.out.println("--------------------------------");
    }

    private static void prob05() {
        System.out.println("Problem 5: ");
        System.out.println("Q: what is the possible output of below code?");
        StringBuffer sb = new StringBuffer("Pepsi Cola");
        sb.insert(2, "Coke");
        System.out.println(sb);

        System.out.println("Ans: A. PeCokepsi Cola");
        System.out.println("--------------------------------");
    }
}
