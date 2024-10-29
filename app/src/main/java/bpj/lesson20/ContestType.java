package bpj.lesson20;

public class ContestType {

    public static void main(String[] args) {
        System.out.println("Lesson 20: Static methods, state variables");

        exer01();
        exer02();
        exer03();
        exer04();
        exer05();
        exer06();
    }

    private static void exer01() {
        System.out.println("Problem 1:");
        System.out.println("Q: which of the following is not legal to access static variable vehicleCount?");
        TvShow t = new TvShow("dummy");
        String ss = t.actor2;
        t.actor2 = "dummy2";
        System.out.println("Ans: E. all are legal options");
        System.out.println("--------------------");
    }

    private static void exer02() {
        System.out.println("Problem 2:");
        System.out.println("Q: which one is not a class variable.");
        System.out.println("Ans: C vehicleID is not a class variable");
        System.out.println("--------------------");
    }

    private static void exer03() {
        System.out.println("Problem 3:");
        System.out.println("Q: what is the value of GpsTracker.vehicleCount?");
        System.out.println("Ans: C 2 is the answer; because the counter increments two times.");
        System.out.println("--------------------");
    }

    private static void exer04() {
        System.out.println("Problem 4:");
        System.out.println("Q: which line can be used in <#1>");
        System.out.println("Ans: A, B, C are all legal options");
        System.out.println("--------------------");
    }

    private static void exer05() {
        System.out.println("Problem 5:");
        System.out.println("Q: is it possible for a constant to be static?");
        System.out.println("Ans: Yes it is possible");
        System.out.println("--------------------");
    }

    private static void exer06() {
        System.out.println("Problem 6:");
        System.out.println("Q: statement double d = Math.sqrt(pow(3.1, 4.67)) is which of the following?");
        System.out.println("Ans: B. and C. evidence that sqrt is static method and static import is used for pow");
        System.out.println("--------------------");
    }
}
