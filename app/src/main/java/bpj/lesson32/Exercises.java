package bpj.lesson32;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("Lesson 32: Boolean Algebra");
    }

    private static boolean a, b, c, d;
    // * means && (AND)
    // + means || (OR)
    // a && (b || c) == a(b + c) == ab + ac
    // deMorgans laws
    // !(a + b) == !a * !b  ... and !(a * b) == !a + !b
    // Obvious Theorems
    // a + false = a  ... a + true = true ... a * false = false ... a * true = a
    // a + a = a ... a * a = a
    // a + !a = true ... a * !a = false .. !!a = a
    // Subtle Theorems
    // a + b = a + (!a)(b)
    // Law of Absorbtion
    // a * (a + b) = a ... a + (a * b) = a


    private static void exer01() {
        System.out.println("Exercise 1: ");
        System.out.println("Q: show the algebraic simplification of ab(!c)+!ab(!c) to b(!c)");
        System.out.println("Ans:");
        System.out.println("ab(!c) + !ab(!c)");
        System.out.println(" = (!c)(ab + !ab)");
        System.out.println(" = (!c)b(a + !a)");
        System.out.println(" = (!c)b(true)");
        System.out.println(" = b(!c)");
        System.out.println("--------------------------------");
    }

    private static void exer02() {
        System.out.println("Exercise 2: ");
        System.out.println("Q: show the algebraic simplification of a(!b)c + abc + !abc + !ab(!c) + a(!b) to !ba + !ab + ac");
        System.out.println("Ans:");
        System.out.println("a(!b)c + abc + !abc + !ab(!c) + a(!b)");
        System.out.println(" = (a(!b)c + abc + !abc + !ab(!c) + a(!b))");
        System.out.println(" = (a(!b)c + bc(a + !a) + !ab(!c) + a(!b))");
        System.out.println(" = (a(!b)c + bc(true) + !ab(!c) + a(!b))");
        System.out.println(" = (a(!b)c + bc + !ab(!c) + a(!b))");
        System.out.println(" = (ac(!b) + a(!b) + bc + !ab(!c))");
        System.out.println(" = ((!b)(ac + a) + bc + !ab(!c))");
        System.out.println("--------------------------------");
    }

    private static void exer03() {
        System.out.println("Exercise 3: ");
        System.out.println("Q: show algebraic simplification of !(!a * !c) + !b + !(ad) to true");
        System.out.println("Ans:");
        System.out.println("!(!a * !c) + !b + !(ad)");
        System.out.println(" = (!(!a * !c) + !b + !(ad))");
        System.out.println(" = (!(!a * !c) + !(!a * !c) + !b + !(ad))");
        System.out.println(" = (!(!a * !c) + !(!a * !c) + !b + !(ad))");
        System.out.println(" = (!(!a * !c) + !(!a * !c) + !b + !(!a * !c))");
        System.out.println("--------------------------------");
    }

    private static void exer04() {
        System.out.println("Exercise 4: ");
        System.out.println("Q: show algebraic simplification of !( (a + bc)(a + c) ) to !a(!b + !c) + !a(!c)");
        System.out.println("Ans:");
        System.out.println("!( (a + bc)(a + c) )");
        System.out.println("--------------------------------");
    }

    private static void exer05() {
        System.out.println("Exercise 5: ");
        System.out.println("Q: express ab(!c) + !ab(!c) using proper Java syntax &&, ||, !");
        System.out.println("Ans:");
        System.out.println("ab(!c) + !ab(!c)");
        System.out.println(" = (a && b && !c) || (!a && b && !c)");
        System.out.println("--------------------------------");
    }

    private static void exer06() {
        System.out.println("Exercise 6: ");
        System.out.println("Q: express a(!b)c + abc + !abc + !ab(!c) + a(!b) using proper Java syntax (&&, ||, !)");
        System.out.println("--------------------------------");
    }

    private static void exer07() {
        System.out.println("Exercise 7: ");
        System.out.println("Q: express !(!a * !c) + !b + !(ad) using proper Java syntax (&&, ||, !)");
        System.out.println("--------------------------------");
    }

    private static void exer08() {
        System.out.println("Exercise 8: ");
        System.out.println("Q: simplify x + (x * y) where x and y are boolean variables");
        System.out.println("--------------------------------");
    }

    private static void exer09() {
        System.out.println("Exercise 9: ");
        System.out.println("Q: express !((a + bc) (a + c)) using proper Java syntax (&&, ||, !)");
        System.out.println("--------------------------------");
    }

    private static void exer10() {
        System.out.println("Exercise 10: ");
        System.out.println("Q: express !(a && b && c) using ORs instead of ANDs");
        System.out.println("!(a && b && c) == (a || b || c)");
        System.out.println("--------------------------------");
    }

    private static void exer11() {
        System.out.println("Exercise 11: ");
        System.out.println("Q: express (a && b && c) using ORs instead of ANDs");
        System.out.println("(a && b && c) == (!a || !b || !c)");
        System.out.println("--------------------------------");
    }

    private static void exer12() {
        System.out.println("Exercise 12: ");
        System.out.println("Q: illustrate the equivalence of !(a * b) and (!a + !b) using truth tables");
        System.out.println("--------------------------------");
    }

    private static void exer13() {
        System.out.println("Exercise 13: ");
        System.out.println("Q: which of the following is equivalent of ((p>3) || (q<b))");
        System.out.println("--------------------------------");
    }

    private static void exer14() {
        System.out.println("Exercise 14: ");
        System.out.println("Q: write a boolean expression that produces following truth table");
        System.out.println("--------------------------------");
    }
}
