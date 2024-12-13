package bpj.lesson36;


public class ExercisesB {
    public static void main(String[] args) {
        System.out.println("Lesson 36: more Inheritance");

        //26 exercises
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
        exer14();
        exer15();

        exer16();
        exer17();
        exer18();
        exer19();
        exer20();
        
        exer21();
        exer22();
        exer23();
        exer24();
        exer25();
        exer26();
    }

    public static abstract class Hammer{
        public abstract void duty();
        public abstract int rule(int d);
    }
    public static class Lurch extends Hammer{
        private int Y = 30;
        private int x;

        public void duty(){int x = Y;}
        public int rule(int d){Y = d + 1; return Y;}
    }

    private static void exer01() {
        System.out.println("Exercise 1: ");
        System.out.println("Q: what is the purpose of making the two methods abstract in above Hammer class?");
        System.out.println("Ans: to defer the implementation of those two methods to the subclasses that extends Hammer class");
        System.out.println("--------------------------------");
    }

    private static void exer02() {
        System.out.println("Exercise 2: ");
        System.out.println("Q: write the full signature of Rule method");
        System.out.println("Ans: public int Rule(int d) is the signature");
        System.out.println("--------------------------------");
    }

    private static void exer03() {
        System.out.println("Exercise 3: ");
        System.out.println("Q: which class actually implements duty method");
        System.out.println("Ans: the Lurch class implements the duty method");
        System.out.println("--------------------------------");
    }

    private static void exer04() {
        System.out.println("Exercise 4: ");
        System.out.println("Q: a class for which you cannot create objects is called an xxxx class?");
        System.out.println("Ans: its called Abstract Class");
        System.out.println("--------------------------------");
    }

    private static void exer05() {
        System.out.println("Exercise 5: ");
        System.out.println("Q: given an abstract class, Felix, can we instantiate this class?");
        System.out.println("Ans: by defination an abstract class contains one or more abstract methods which needs to be implemented by a subclass that extends it.");
        System.out.println("--------------------------------");
    }

    private static void exer06() {
        System.out.println("Exercise 6: ");
        System.out.println("Q: given an abstract class, Lupe, which contains a final class variables, is it legal to have such code?");
        System.out.println("Ans: yes. In an Abstract Class it is legal to have implemented methods and class variables along side atleast one method that is defined as abstract");
        System.out.println("--------------------------------");
    }

    private static void exer07() {
        System.out.println("Exercise 7: ");
        System.out.println("Q: what is the main reason for using abstract class?");
        System.out.println("Ans: one key reason is to define a Base / Parent class that contains common methods, class variables and defines standard method signatures as abstract to be implemented by each of its Subclasses (or children classes) that extends it.");
        System.out.println("--------------------------------");
    }

    private static void exer08() {
        System.out.println("Exercise 8: ");
        System.out.println("Q: modify the following class so that its impossible to subclass from it:: public class MyClass{}");
        System.out.println("Ans: (make the class final)  public final class MyClass{}");
        System.out.println("--------------------------------");
    }

    private static void exer09() {
        System.out.println("Exercise 9: ");
        System.out.println("Q: why would the following code be pointless? public final abstract class MyClass{}");
        System.out.println("Ans: the code is pointless because by definition, a final class cannot be subclassed and on contrary, an abstract class must have a subclass");
        System.out.println("--------------------------------");
    }

    private static void exer10() {
        System.out.println("Exercise 10: ");
        System.out.println("Given: public class ChevyClass{ public void Chicago(int x){} }");
        System.out.println("Q: modify above code to make it impossible for any subclass to override the Chicago method");
        System.out.println("Ans: make the Chicagi method as final");
        System.out.println("--------------------------------");
    }

    private static void exer11() {
        System.out.println("Exercise 11: ");
        System.out.println("Q: is it possible to overide instance fields on Abstract class");
        System.out.println("Ans: it is possible for subclass to have same instance fields as superclass. but this is not called override. It is called Shadowing");
        System.out.println("--------------------------------");
    }

    private static void exer12() {
        System.out.println("Exercise 12: ");
        System.out.println("Q: what is the term 'shadowing' as it applies to superclasses and subclasses");
        System.out.println("Ans: shadowing is when subclass has same named instance variables as superclass. here the subclass variables get preference. This does not override or alter the superclass variable. Within the subclass, we can reference both using this and super key words. when we instantiate subclass, then we reference only subclass variables.");
        System.out.println("--------------------------------");
    }

    public static class Parent{
        public void rubyDoo(){System.out.println("rubyDoo");}
        public int x = 0;
    }
    public static class Child extends Parent{
        public void busterStein(){System.out.println("busterStein");}
        public int getParentsX(){return super.x;}
        public int getMyX(){return this.x;}
        public int x = 39;
    }

    private static void exer13() {
        System.out.println("Exercise 13: ");
        Child myChild = new Child();
        System.out.println("child.x --> "+myChild.x);
        System.out.println("Q: what gets printed?");
        System.out.println("Ans: expecting 39, the value from Child subclass.");

        System.out.println("--------------------------------");
    }

    private static void exer14() {
        System.out.println("Exercise 14: ");
        System.out.println("Q: is there anyway to print the x variable from Parent when you instantiate Child");

        Child myChild = new Child();
        System.out.println(" child's x --> "+myChild.getMyX());
        System.out.println("parent's x --> "+myChild.getParentsX());

        System.out.println("--------------------------------");
    }

    private static void exer15() {
        System.out.println("Exercise 15: ");
        System.out.println("Q; what is the name of Cosmic Superclass?");
        System.out.println("Ans: its the Object class");
        System.out.println("--------------------------------");
    }

    private static void exer16() {
        System.out.println("Exercise 16: ");
        System.out.println("Q: What is the name of the class that every class automatically extends?");
        System.out.println("Ans: its the Object class");
        System.out.println("--------------------------------");
    }

    private static void exer17() {
        System.out.println("Exercise 17: ");
        System.out.println("Q: what are the three main methods of Object class?");
        System.out.println("Ans: the 3 main methods of Object class are: equals, hashCode, toString");
        System.out.println("--------------------------------");
    }

    private static void exer18() {
        System.out.println("Exercise 18: ");
        System.out.println("Q: is the following legal?");
        Child theObj = new Child();
        Parent newObj = theObj;
        // newObj.busterStein();//child's method is undefined for a Parent
        System.out.println("Ans: its not legal because childs method is undefined for the parent");
        System.out.println("--------------------------------");
    }

    private static void exer19() {
        System.out.println("Exercise 19: ");
        System.out.println("Q: is the following legal?");
        Child theObj = new Child();
        Parent newObj = theObj;
        newObj.rubyDoo();
        System.out.println("Ans: this is legal since we are invoking parent's method");
        System.out.println("--------------------------------");
    }

    private static void exer20() {
        System.out.println("Exercise 20: ");
        System.out.println("Q: is the following legal?");
        Parent meatloaf = new Child();
        System.out.println("Ans: yes, this is legal.");
        System.out.println("--------------------------------");
    }

    public static class A{
        public int x;
        public A(int i){ x = i;}
        public int f(){return x;}
        public int g(){return x;}
    }
    public static class B extends A{
        public int x;
        public B(int x, int y){super(x); this.x = y;}
        public int f(){return x + g();}
        public int zorro(){return x + g();}
    }

    private static void exer21() {
        System.out.println("Exercise 21: ");
        System.out.println("Q: what is the result of the following?");
        A a = new B(5, 10);
        System.out.println(a.g());
        System.out.println("Ans: expecting 5");
        System.out.println("--------------------------------");
    }

    private static void exer22() {
        System.out.println("Exercise 22: ");
        System.out.println("Q: what is the result of the following?");
        A a = new B(5, 10);
        System.out.println(a.f());
        System.out.println("Ans: expecting 15");
        System.out.println("--------------------------------");
    }

    private static void exer23() {
        System.out.println("Exercise 23: ");
        System.out.println("Q: what is the result of the following?");
        A a = new B(5, 10);
        System.out.println(a.x);
        System.out.println("Ans: expecting 10");
        System.out.println("--------------------------------");
    }

    private static void exer24() {
        System.out.println("Exercise 24: ");
        System.out.println("Q: what is the result of the following?");
        B a = new B(5, 10);
        System.out.println(a.x);
        System.out.println("Ans: expecting 10");
        System.out.println("--------------------------------");
    }

    private static void exer25() {
        System.out.println("Exercise 25: ");
        System.out.println("Q: what is the result of the following?");
        A a = new B(5, 10);
        // System.out.println(a.zorro());
        System.out.println("Ans: it does not compile since Class A does not have a zorro method");
        System.out.println("--------------------------------");
    }

    private static void exer26() {
        System.out.println("Exercise 26: ");
        System.out.println("Given: consider classes Food, Cheese, Velveta, where Cheese is subclass of Food and Velveta is subclass of Cheese");
        System.out.println("Q: what is the result of the following?");
        System.out.println("Cheese c = new Food(); // --- this is not legal");
        System.out.println("Velveta v = new Food(); // --- this is not legal");
        System.out.println("Cheese c = new Velveta(); // --- this is legal");
        System.out.println("Food f = new Velveta(); // --- this is legal");
        System.out.println("Food f = new Cheese(); // --- this is legal");
        System.out.println("--------------------------------");
    }
}
