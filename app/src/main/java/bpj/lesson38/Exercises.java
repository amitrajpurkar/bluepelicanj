package bpj.lesson38;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("Lesson 38: Interfaces....");

        // 7 of them
        exer01();
        exer02();
        exer03();
        exer04();
        exer05();

        exer06();
        exer07();
    }

    public interface Sports{
        void method1();
        void method2();
        int method3(double d);
    }
    public class Baseball implements Sports{
        public Baseball(){}
        public Baseball(int i){statevar1 = i;}
        public void method1(){System.out.println("from Baseball.. method1");}
        public void method2(){System.out.println("from Baseball.. method2");}
        public int method3(double d){return statevar1;}
        private int statevar1 = 22;
    }
    public class Football implements Sports{
        public Football(){}
        public Football(int i){statevar1 = i;}
        public void method1(){System.out.println("from Football.. method1");}
        public void method2(){System.out.println("from Football.. method2");}
        public int method3(double d){return statevar1;}
        private int statevar1 = 44;
    }

    private static void exer01(){
        System.out.println("Exercise 01:");
        System.out.println("Q: which methods if any in Sports interface are abstract?");
        System.out.println("Ans: all 3 methods are abstract");
        System.out.println("--------------------");
    }

    private static void exer02(){
        System.out.println("Exercise 02:");
        System.out.println("Q: if a class Hockey implements Sports, which methods need to be implemented?");
        System.out.println("Ans: all 3 methods must be implemented by Hockey");
        System.out.println("--------------------");
    }

    private static void exer03(){
        System.out.println("Exercise 03:");
        System.out.println("Q: if two subclasses implement Sports, do both of them need to have same implementation of the abstract method, method1?");
        System.out.println("Ans: the two subclasses can have different implementation for method1, that does not need to be same.");
        System.out.println("--------------------");
    }

    Sports x = new Baseball();
    Sports y = new Football();
    boolean b1 = x instanceof Sports;
    boolean b2 = y instanceof Football;

    private static void exer04(){
        System.out.println("Exercise 04:");
        System.out.println("Q: what is returned by x instanceof Sports?");
        System.out.println("Ans: expecting true");
        System.out.println("--------------------");
    }

    private static void exer05(){
        System.out.println("Exercise 05:");
        System.out.println("Q: what is returned by y instanceof Football");
        System.out.println("Ans: expecting true");
        System.out.println("--------------------");
    }

    private static void exer06(){
        System.out.println("Exercise 06:");
        System.out.println("Q: the property of two classes being able to have method of same name, and different implementation, is known as what?");
        System.out.println("Ans: this is called overriding");
        System.out.println("--------------------");
    }

    private static void exer07(){
        System.out.println("Exercise 07:");
        System.out.println("Q: modify a class Austria so that it simultaneously inherits Red class and implement both Eagle and Bobcat interfaces");
        System.out.println("Ans: public class Austria extends Red implements Eagle, Bobcat {}");
        System.out.println("--------------------");
    }
}
