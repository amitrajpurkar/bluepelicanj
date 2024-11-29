package bpj.lesson31;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("Lesson 31: String Buffer ");

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
    }

    private static final StringBuffer sb = new StringBuffer("Humpty Dumpty sat on a wall");

    private static void exer1() {
        System.out.println("exer1");
        System.out.println("Q: write a code to create a StringBuffer object and store \"Hello\" in it. then convert it to String and print it.");
        StringBuffer sb = new StringBuffer("Hello");
        String s = sb.toString();
        System.out.println(s);

        System.out.println("--------------------------------");
    }


    private static void exer2() {
        System.out.println("exer2");
        System.out.println("Q: what is the value of sb.substring(3, 8)");
        String str = sb.substring(3, 8);
        System.out.println(str);

        System.out.println("--------------------------------");
    }

    private static void exer3() {
        System.out.println("exer3");
        System.out.println("Q: what is the value of sb.substring(3)");
        String str = sb.substring(3);
        System.out.println(str);

        System.out.println("--------------------------------");
    }

    private static void exer4() {
        System.out.println("exer4");
        System.out.println("Q: what is printed after sb.append(K)");
        StringBuffer s1 = new StringBuffer(sb); // create a new instance to clone original StringBuffer... Else a copy is still referencing same object, with two pointers !!
        s1.append('K');
        System.out.println(s1);

        System.out.println("--------------------------------");
    }

    private static void exer5() {
        System.out.println("exer5");
        StringBuffer sss = new StringBuffer();
        sss.append("Hello");
        StringBuffer s1 = new StringBuffer(sb);
        s1.append(sss);
        System.out.println(s1.toString());

        System.out.println("--------------------------------");
    }

    private static void exer6() {
        System.out.println("exer6");
        System.out.println("Q: what is the value of sb.length()");
        int len = sb.length();
        System.out.println(len);

        System.out.println("--------------------------------");
    }

    private static void exer7() {
        System.out.println("exer7");
        System.out.println("Q: what is the value of sb.chartAt(4)");
        char ch = sb.charAt(4);
        System.out.println(ch);

        System.out.println("--------------------------------");
    }

    private static void exer8() {
        System.out.println("exer8");
        System.out.println("Q: what is the effect of sb.setCharAt(7,'C')?");
        StringBuffer s1 = new StringBuffer(sb);
        s1.setCharAt(7,'C');
        String s = s1.toString();
        System.out.println(s);

        System.out.println("--------------------------------");
    }

    private static void exer9() {
        System.out.println("exer9");
        System.out.println("Q: what is the effect of sb.delete(7,9)?");
        StringBuffer s1 = new StringBuffer(sb);
        s1.delete(7,9);
        String s = s1.toString();
        System.out.println(s);

        System.out.println("--------------------------------");
    }

    private static void exer10() {
        System.out.println("exer10");
        System.out.println("Q: what is the effect of sb.deleteCharAt(9)?");
        StringBuffer s1 = new StringBuffer(sb);
        s1.deleteCharAt(9);
        String s = s1.toString();
        System.out.println(s);

        System.out.println("--------------------------------");
    }

    private static void exer11() {
        System.out.println("exer11");
        System.out.println("Q: what is the effect of sb.insert(0,'B')?");
        StringBuffer s1 = new StringBuffer(sb);
        s1.insert(0, 'B');
        String s = s1.toString();
        System.out.println(s);

        System.out.println("Q: what is the effect of sb.reverse()?");
        s1.reverse();
        s = s1.toString();
        System.out.println(s);

        System.out.println("--------------------------------");
    }

    private static void exer12() {
        System.out.println("exer12");
        System.out.println("Q: what is the effect of sb.insert(1,\"xxx\")?");
        StringBuffer s1 = new StringBuffer(sb);
        s1.insert(1, "xxx");
        String s = s1.toString();
        System.out.println(s);

        System.out.println("--------------------------------");
    }
}
