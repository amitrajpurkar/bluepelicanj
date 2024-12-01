package bpj.lesson33;

public class ContestType {
    public static void main(String[] args) {
        System.out.println("Contest Type Problems");

        prob1();
        prob2();
        prob3();
        prob4();
    }

    private static void prob1(){
        System.out.println("Problem 1: D. boolean bb = obj.vogue(false, a&&b?a:!b)");
    }

    private static void prob2(){
        System.out.println("Problem 2: C. true.... vogue(true, false) will return this (!p||q)? p&&q : p||q");
    }

    private static void prob3(){
        System.out.println("Problem 3: A. m = (j==g)?++j:37; .... this is equivalent to the if statement");
    }

    private static void prob4(){
        System.out.println("Problem 4: B. 18.3 .. after applying x=false, y=false to !(x&&y)? 18.3 : 5 * Math.PI");
    }
}
