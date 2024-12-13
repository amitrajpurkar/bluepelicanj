package bpj.lesson37;

public class ContestType {
    public static void main(String[] args) {
        System.out.println("Lesson 37: Exceptions -- Contest Problems");

        //9 of them
        prob01();
        prob02();
        prob03();
        prob04();
        prob05();
        
        prob06();
        prob07();
        prob08();
        prob09();
    }

    private static void prob01() {
        System.out.println("Problem 01");
        System.out.println("Q: what is the output?");
        System.out.println("Ans: C. g // that is the character at index 2 of the string");
        System.out.println("--------------------");
    }

    private static void prob02() {
        System.out.println("Problem 02");
        System.out.println("Q: what is the output?");
        System.out.println("Ans: B. Error 22 // because it throws exception");
        System.out.println("--------------------");
    }

    private static void prob03() {
        System.out.println("Problem 03");
        System.out.println("Q: What is the output at <1*>?");
        System.out.println("Ans: E. None of these // since one string is not number it should return other number");
        System.out.println("--------------------");
    }

    private static void prob04() {
        System.out.println("Problem 04");
        System.out.println("Q: what is the output for product('two','5')?");
        System.out.println("Ans: B. 5 //because first parameter is not number");
        System.out.println("--------------------");
    }

    private static void prob05() {
        System.out.println("Problem 05");
        System.out.println("Q: what is the output?");
        System.out.println("Ans: C. Error with Number format // because the most specific exception is caught first");
        System.out.println("--------------------");
    }

    private static void prob06() {
        System.out.println("Problem 06");
        System.out.println("Q: what is the output?");
        System.out.println("Ans: C. <3*> // because finally block is executed always and there is no exception in this example");
        System.out.println("--------------------");
    }

    private static void prob07() {
        System.out.println("Problem 07");
        System.out.println("Q: what exceptions are thrown up the call chain?");
        System.out.println("Ans: C. IOException, its subclasses and unchecked exceptions");
        System.out.println("--------------------");
    }

    private static void prob08() {
        System.out.println("Problem 08");
        System.out.println("Q: what should replace at <*I>?");
        System.out.println("Ans: A. throws IOException");
        System.out.println("--------------------");
    }

    private static void prob09() {
        System.out.println("Problem 09");
        System.out.println("Q: Which of these is not a keyword in Java: short, continue, finally, final, none-of-these?");
        System.out.println("Ans: E. none-of-these");
        System.out.println("--------------------");
    }
}
