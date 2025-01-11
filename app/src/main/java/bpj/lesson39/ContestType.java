package bpj.lesson39;

public class ContestType {
    public static void main(String[] args) {
        System.out.println("Lesson 39: Contest Type Problems");

        //5 of them
        prob01();
        prob02();
        prob03();
        prob04();
        prob05();
    }

    private static void prob01() {
        System.out.println("Problem 01");
        System.out.println("Q: which one if the faster algorith for large value of n: O(n^2) or O(n log n) or O(n) or O(log n) ?");
        System.out.println("Ans: O(log n)");
        System.out.println("--------------------");
    }

    private static void prob02() {
        System.out.println("Problem 02");
        System.out.println("Q: what is the value of Big O for: for(int p=0; p<m; p++) for(int q=0; q<m; q++, k--)?");
        System.out.println("Ans: O(m^2)");
        System.out.println("--------------------");
    }

    private static void prob03() {
        System.out.println("Problem 03");
        System.out.println("Q: what is the Big O value for the following table below?");
        System.out.println("Number of times the loop iterates | Time (sec)");
        System.out.println("1000 | 2");
        System.out.println("2000 | 16");// 2 * 2^3
        System.out.println("3000 | 54");// 2 * 3^3
        System.out.println("Ans: O(n^3)");
        System.out.println("--------------------");
    }

    private static void prob04() {
        System.out.println("Problem 04");
        System.out.println("Q: ?");
        System.out.println("--------------------");
    }

    private static void prob05() {
        System.out.println("Problem 05");
        System.out.println("Q: what is the Big O value for: for(int j=0; j<n; j+=2) for(int k=0; k<d; k=k*8)?");
        System.out.println("Ans: O(n)");
        System.out.println("--------------------");
    }
}
