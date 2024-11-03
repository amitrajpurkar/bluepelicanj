package bpj.lesson21;

public class Exercises {
    
    public static void main(String[] args) {
        System.out.println("Lesson 21: Wrapper Classes");

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
    }

    private static void exer01() {
        System.out.println("Exercise 1: ");
        System.out.println("Q: the classes that convert primitives to Obejects are:");
        System.out.println("Ans: Wrapper classes");
        System.out.println("for example --  Boolean, Character, Byte, Short, Integer, Long, Float, Double");
        System.out.println("--------------------------------");
    }

    private static void exer02() {
        System.out.println("Exercise 2: ");
        System.out.println("Q; name four primitive data types and their corresponding wrapper classes");
        System.out.println("Ans: byte, Byte, short, Short, int, Integer, long, Long, float, Float, double, Double, char, Character, boolean, Boolean");
        System.out.println("--------------------------------");
    }

    private static void exer03() {
        System.out.println("Exercise 3: ");
        System.out.println("Q: write code that will convert double ds into a wrapper class object called dd");
        System.out.println("double ds = 3.14;");
        System.out.println("Ans: Double dd = new Double(ds);");
        System.out.println("--------------------------------");
    }

    private static void exer04() {
        System.out.println("Exercise 4: ");
        System.out.println("Q: write code that will produce Boolean type wrapper object called bj that wraps true inside it");
        System.out.println("Ans: Boolean bj = new Boolean(true);");
        System.out.println("--------------------------------");
    }

    private static void exer05() {
        System.out.println("Exercise 5: ");
        System.out.println("Q: write code that will convert integer ip into Integer wrapper object called ozzie");
        System.out.println("Ans: Integer ozzie = new Integer(ip);");
        System.out.println("--------------------------------");
    }

    private static void exer06() {
        System.out.println("Exercise 6: ");
        System.out.println("Q: assume you have Character cw. write code that converts this to printable character");
        System.out.println("Character cw = new Character('a');");
        System.out.println("Ans: cw.charValue();");
        System.out.println("--------------------------------");
    }

    private static void exer07() {
        System.out.println("Exercise 7: ");
        System.out.println("Q: assume you have Double objects d1, d2. show how would you multiply values stored in them and store result in primitive double dd");
        System.out.println("Double d1 = new Double(3.14);");
        System.out.println("Double d2 = new Double(3.14);");
        System.out.println("Ans: double dd = d1.doubleValue() * d2.doubleValue();");
        System.out.println("--------------------------------");
    }

    private static void exer08() {
        System.out.println("Exercise 8: ");
        System.out.println("Q: assume you have Integer objects i1, i2. show how would you add values stored in them and store result in primitive integer i3");
        System.out.println("Integer i1 = new Integer(3);");
        System.out.println("Integer i2 = new Integer(3);");
        System.out.println("Ans: int i3 = i1.intValue() + i2.intValue();");
        System.out.println("--------------------------------");
    }

    private static void exer09() {
        System.out.println("Exercise 9: ");
        System.out.println("Q;write code that will extract boolean wrapped in Boolean object wnOh and test it with if statement");
        System.out.println("Boolean wnOh = new Boolean(true);");
        System.out.println("if(wnOh.booleanValue()){}");
        System.out.println("--------------------------------");
    }

    private static void exer10() {
        System.out.println("Exercise 10: ");
        System.out.println("Q: convert object jj of type Double into primitive float ff");
        System.out.println("Double jj = new Double(3.14);");
        System.out.println("Ans: float ff = jj.floatValue();");
        System.out.println("--------------------------------");
    }

    private static void exer11() {
        System.out.println("Exercise 11: ");
        System.out.println("Q: convert object pk of type Double into a primitive int called gurg. whaat is teh danger of this?");
        System.out.println("Double pk = new Double(3.14);");
        System.out.println("Ans: int gurg = pk.intValue();");
        Double pk = Double.valueOf(3.14);
        int gurg = pk.intValue();
        System.out.println("What is the danger of this?");
        System.out.println("Ans: it is possible that gurg will fail for a large value of pk since this is a narrowing primitive conversion");

        System.out.println("--------------------------------");
    }

    private static void exer12() {
        System.out.println("Exercise 12: ");
        System.out.println("Q: what is the primary purpose of wrapper classes");
        System.out.println("Ans: to wrap primitive data types into objects; classes in util package and collection framework only accept objects and not primitive types");
        System.out.println("--------------------------------");
    }
}
