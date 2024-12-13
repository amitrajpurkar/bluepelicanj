package bpj.lesson37;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("Lesson 37: Exceptions");

        // 13 of them
        exer01();
        exer02();
        exer03();
        exer04();
        exer05();

        exer06();
        exer07();
        exer08();
        exer09();
        exer10();

        exer11();
        exer12();
        exer13();
    }

    private static void exer01() {
        System.out.println("Exercise 01");
        System.out.println("Q: rewrite the code to consolidate two error messages into one?");
        System.out.println("if(amount>balance || amount<=0) throw new IllegalArgumentException(\"amount withdrawn should be less than account balance and more than zero dollars\")");
        System.out.println("--------------------");
    }

    private static void exer02() {
        System.out.println("Exercise 02");
        System.out.println("Q: write a method setStudentScore(int score) , define a precondition and in the body, throw exception when pre-condition not met");
        System.out.println("//pre-condition = score should be an integer between 1 and 10");
        System.out.println("public void setStudentScore(int score) { ");
        System.out.println("  if(score <=0 || score > 10) throw new IllegalArgumentException(\"score should be between 1-10\")");
        System.out.println("  // remaining code for this method");
        System.out.println("} ");
        System.out.println("--------------------");
    }

    private static void exer03() {
        System.out.println("Exercise 03");
        System.out.println("Q: in Java we do not say program generated an error; rather, what do we say?");

        System.out.println("Ans: in Java we say, the program threw exception");
        System.out.println("--------------------");
    }

    private static void exer04() {
        System.out.println("Exercise 04");
        System.out.println("Q: What are the two types of exceptions?");
        System.out.println("Ans: checked exceptions, unchecked exceptions");
        System.out.println("--------------------");
    }

    private static void exer05() {
        System.out.println("Exercise 05");
        System.out.println("Q: which type of exception requires being handled?");
        System.out.println("Ans: checked exceptions must be handled");
        System.out.println("--------------------");
    }

    private static void exer06() {
        System.out.println("Exercise 06");
        System.out.println("Q: what are the two ways to handle checked exceptions?");
        System.out.println("Ans: 1. use try/catch/finally; 2. put throws-specifier in method signature");
        System.out.println("--------------------");
    }

    private static void exer07() {
        System.out.println("Exercise 07");
        System.out.println("Q: is it permissible for unchecked exceptions to be handled with throws or try/catch?");
        System.out.println("Ans: yes, its permissible");
        System.out.println("--------------------");
    }

    private static void exer08() {
        System.out.println("Exercise 08");
        System.out.println("Q: give an example of checked exceptions and what conditions that can cause it?");
        System.out.println("Ans: reading a text file from a folder/ path location will trigger checked exception.");
        System.out.println("and a flag of hidden file or missing file can cause this exception");
        System.out.println("--------------------");
    }

    private static void exer09() {
        System.out.println("Exercise 09");
        System.out.println("Q: give an example of unchecked exception?");
        System.out.println("Ans: division of two numbers will not throw exception unless the denominator is zero");
        System.out.println("--------------------");
    }

    private static void exer10() {
        System.out.println("Exercise 10");
        System.out.println("Q: modify code; calling method up the chain to handle try catch?");
        System.out.println("try { ");
        System.out.println("  String c1 = car(123);");
        System.out.println("} catch(ArithmeticException e) { ");
        System.out.println("  System.out.println(e.getMessage());");
        System.out.println("} ");
        System.out.println("--------------------");
    }

    private static void exer11() {
        System.out.println("Exercise 11");
        System.out.println("Q: modify code so that the ArithmeticException is handled in same method?");
        System.out.println("public String car(int xs) { ");
        System.out.println("  try { ");
        System.out.println("    //come expression or function that throws Arithmetic exception");
        System.out.println("  } catch(ArithmeticException e) {");
        System.out.println("    System.out.println(e.getMessage());");
        System.out.println("  }");
        System.out.println("} ");
        System.out.println("--------------------");
    }

    public class StuffyException extends RuntimeException{
        public StuffyException(String announcement){ super(announcement);}
        public StuffyException(){}
    }

    private static void exer12() {
        System.out.println("Exercise 12");
        System.out.println("Q: show an example of custom exception");
        System.out.println("--------------------");
    }

    private static void exer13() {
        System.out.println("Exercise 13");
        System.out.println("Q: write a code to use StuffyException");
        System.out.println("if(i < 0) throw new StuffyException(\"Hey, you messed up\");");
        System.out.println("--------------------");
    }

}
