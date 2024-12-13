package bpj.lesson36;

public class ExercisesA {
    public static void main(String[] args) {
        System.out.println("Lesson 36: Inheritance !!");

        //13 of them
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


     public static class Green {
        public double peabody(double y) { return 0; }
        private boolean crunch(double y) { return false; }
        public double mm;
        public long xx;
     }

     public static class Red extends Green {
        public int blue(double x) { return (int)x; }
        public String s;
        private int i;
     }

    private static void exer01() {
        System.out.println("Exercise 1: ");
        System.out.println("Q: which of the two classes is a base class?");
        System.out.println("Ans: Green");
        System.out.println("--------------------------------");
    }

    private static void exer02() {
        System.out.println("Exercise 2: ");
        System.out.println("Q: which of the two classes is a subclass?");
        System.out.println("Ans: Red");
        System.out.println("--------------------------------");
    }

    private static void exer03() {
        System.out.println("Exercise 3: ");
        System.out.println("Q: which of the two classes is a superclass?");
        System.out.println("Ans: Green");
        System.out.println("--------------------------------");
    }

    private static void exer04() {
        System.out.println("Exercise 4: ");
        System.out.println("Q: which of the two classes is a derived class?");
        System.out.println("Ans: Red");
        System.out.println("--------------------------------");
    }

    private static void exer05() {
        System.out.println("Exercise 5: ");
        System.out.println("Q: is the below code legal? if not, why?");
        Red myObj = new Red();
        // boolean b = myObj.crunch();//the method expects a double paramter, hence that is not legal
        // boolean bb = myObj.crunch(1.22);//the method is private, hence that is not legal

        System.out.println("Ans: yes this is NOT legal.. the method is private and expects double parameter");
        System.out.println("--------------------------------");
    }

    private static void exer06() {
        System.out.println("Exercise 6: ");
        System.out.println("Q: is the code below legal? if not, why?");
        Red myObj = new Red();
        int bb = myObj.blue(105.2);
        System.out.println("--------------------------------");
    }

    private static void exer07() {
        System.out.println("Exercise 7: ");
        System.out.println("Q: write code for blue method that will printout the mm state variable");
        System.out.println("Ans: public int blue(double x) { System.out.println(super.mm); return (int)x; }");
        System.out.println("--------------------------------");
    }

    private static void exer08() {
        System.out.println("Exercise 8: ");
        System.out.println("Q: write code for blue method that will printout the xx state variable");
        System.out.println("Ans: public int blue(double x) { System.out.println(super.xx); return (int)x; }");
        System.out.println("--------------------------------");
    }

    public static class Green1{
        public Green1(long j){ xx = j; }
        public double peabody(double y) { return mm; }
        private boolean crunch(double y) { return false; }
        public double mm;
        public long xx;
    }

    public static class Red1 extends Green1{
        public Red1(long j){ super(j); }
        public int blue(double x) { return (int)x; }
        public double peabody(double vv) { return vv; }
        public String s;
        private int i;
    }

    private static void exer09() {
        System.out.println("Exercise 9: ");
        System.out.println("Q: consider the constructor in Red1; what code will you use to invoke superclass constructor, passing value of 32000");
        System.out.println("Ans: public Red1() { super(32000); }");

        System.out.println("--------------------------------");
    }

    private static void exer10() {
        System.out.println("Exercise 10: ");
        System.out.println("Q: is there any method in Red1 that is overriding a method from Green1?");
        System.out.println("Ans: yes... peabody() method is overriding peabody() method from Green1");
        System.out.println("--------------------------------");
    }

    private static void exer11() {
        System.out.println("Exercise 11: ");
        System.out.println("Q: for peabody method in Red1, call super.peabody() and pass it value of 11?");
        System.out.println("Ans: public double peabody(double y) { return super.peabody(11); }");
        System.out.println("--------------------------------");
    }

    private static void exer12() {
        System.out.println("Exercise 12: ");
        System.out.println("Q: is the contructor code below legal?");
        System.out.println("public Red1(){ String s = \"Hello\"; super(49); }");
        System.out.println("Ans: yes this is legal");
        System.out.println("--------------------------------");
    }

    private static void exer13() {
        System.out.println("Exercise 13: ");
        System.out.println("Q: match the blanks with options given");

        System.out.println("this(x,y) ... b. refers to a constructor in the subclass");
        System.out.println("this.z ... d. refers to a data member in the subclass");
        System.out.println("super(j) ... a. refers to a constructor in the superclass");
        System.out.println("super.calc() ... c. refers to an overridden method in the superclass");

        System.out.println("--------------------------------");
    }
}
