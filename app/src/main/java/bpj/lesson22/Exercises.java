package bpj.lesson22;

public class Exercises {
    
    public static void main(String[] args) {
        System.out.println("Lesson 22: More on Wrapper Classes");

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
    } 

    private static void exer01() {
        System.out.println("Exercise 01: ");
        System.out.println("Q: write code that will convert a String called rr into an int type called i");
        System.out.println("String rr = \"3\";");
        System.out.println("Ans: int i = Integer.parseInt(rr);");
        System.out.println("--------------------------------");
    }

    private static void exer02() {
        System.out.println("Exercise 02: ");
        System.out.println("Q: String s contains 123.456 ; how will you convert it to a double called dd");
        System.out.println("String s = \"123.456\";");
        System.out.println("Ans: double dd = Double.parseDouble(s);");
        System.out.println("--------------------------------");
    }

    private static void exer03() {
        System.out.println("Exercise 03: ");
        System.out.println("Q: what evidence is there in the code that the method is static?");
        System.out.println("Ans: the Integer class is not instantiated and the parseInt method is invoked using the class name.");
        System.out.println("--------------------------------");
    }

    private static void exer04() {
        System.out.println("Exercise 04: ");
        System.out.println("Q: how will you convert decimal equivalent String sd into String sh in hex?");
        System.out.println("String sd = \"35\";");
        System.out.println("Ans: String sh = Integer.toHexString(sd);");
        System.out.println("--------------------------------");
    }

    private static void exer05() {
        System.out.println("Exercise 05: ");
        System.out.println("Q: suppose you have int type stored in jj; how will you convert this into String called ss");
        System.out.println("int jj = 3;");
        System.out.println("Ans: String ss = String.valueOf(jj);");
        System.out.println("--------------------------------");
    }

    private static void exer06() {
        System.out.println("Exercise 06: ");
        System.out.println("Q: suppose you must pass Integer object equivalent of 1000 as a parameter to a methodA; however all you have is a String representation ss of that Integer. Show how will you manipulate ss and change it into an object called obj so that it would be used as a parameter for methodA");
        System.out.println("String ss = \"1000\";");
        System.out.println("Ans: Integer obj = Integer.valueOf(ss);");
        System.out.println("methodA(obj);");
        System.out.println("--------------------------------");
    }

    private static void exer07() {
        System.out.println("Exercise 07: ");
        System.out.println("Q: what is the output of following code?");
        String pdq = "-772.29";
        System.out.println(3 + Double.parseDouble(pdq));
        System.out.println("Ans: is -769.29 ... and not  3-772.29");
        System.out.println("--------------------------------");
    }

    private static void exer08() {
        System.out.println("Exercise 08: ");
        System.out.println("Q: what will the code print?");
        
        Integer iObj = Integer.valueOf(-186);
        int ip = iObj;
        String mz = "3" + Integer.toString(ip) + "3";
        System.out.println(mz);
        System.out.println("Ans: expecting this 3-1863");
        
        System.out.println("--------------------------------");
    }

    private static void exer09() {
        System.out.println("Exercise 09: ");
        System.out.println("Q: write a code that will convert 3pfh, a String representation of a base 33 number, into int i");
        System.out.println("String 3pfh = \"3pfh\";");
        System.out.println("Ans: int i = Integer.parseInt(3pfh, 33);");
        
        System.out.println("--------------------------------");
    }

    private static void exer10() {
        System.out.println("Exercise 10: ");
        System.out.println("Q: write a code that will convert int i into its String equivalent in base 6");
        System.out.println("int i = 3;");
        System.out.println("Ans: String s = Integer.toString(i, 6);");
        
        System.out.println("--------------------------------");
    }
}
