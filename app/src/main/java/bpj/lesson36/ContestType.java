package bpj.lesson36;

public class ContestType {
    public static void main(String[] args) {
        System.out.println("Lesson 36: Inheritance -- Contest Problems");

        //16 of them
        prob01();
        prob02();
        prob03();
        prob04();
        prob05();

        prob06();
        prob07();
        prob08();
        prob09();
        prob10();
        
        prob11();
        prob12();
        prob13();
        prob14();
        prob15();
        prob16();
    }

    public abstract class AccountDetails{
        public abstract double getPrincipal();
        public abstract String getName();
    }
    public class Info extends AccountDetails {
        private double principal;
        private String name;
        public Info(double principal, String name) {
            this.principal = principal;
            this.name = name;
        }
        public double getPrincipal() { return principal; }
        public String getName() { return name; }
    }
    public abstract class Financial {
        public abstract double interestEarned();
        public abstract double paymentDue();
    }
    public class Loan extends Financial {
        private double rate;
        private int months;
        private AccountDetails ad;
        public Loan(double rate, int months, AccountDetails ad) {
            this.rate = rate;
            this.months = months;
            this.ad = ad;
        }
        public double interestEarned() { return 0.0; }
        public double paymentDue() { return 0.0; }
    }

    private static void prob01() {
        System.out.println("Problem 01");
        System.out.println("Q: what are the right qualifiers for class, methods in AccountDetails and Financial class?");
        System.out.println("Ans: A abstract, abstract for both AccountDetails and Financial; because the methods are not implemented");
        System.out.println("--------------------");
    }

    private static void prob02() {
        System.out.println("Problem 02");
        System.out.println("Given: the interest earned on loan is the product of 1/12 the principle, rate and months.");
        System.out.println("Q: what is the right implementation for the interestEarned() method in Loan class?");
        System.out.println("Ans: A: return months/12 * rate * ad.getPrincipal(); and also B. return months * rate * ad.getPrincipal()/12; and also C.");
        System.out.println("so its More than one answer -- E");
        System.out.println("--------------------");
    }

    private static void prob03() {
        System.out.println("Problem 03");
        System.out.println("Q: what is the right code to instantiate Loan class?");
        System.out.println("Ans: D: Loan p = new Loan(0.07, 4, new Info(450.0, \"Bob\"));");
        System.out.println("--------------------");
    }

    public static class Parent{
        public Parent(int q){this.q = q;}
        public int work(){ return q; }
        private int q;
    }
    public static class Child extends Parent{
        public Child(int q, int y){super(q); this.y=y;}
        public int work(){ return y + super.work(); }
        private int y;
    }

    private static void prob04() {
        System.out.println("Problem 04");
        Parent pr = new Parent(7);
        System.out.println("Q: what is the output?");
        System.out.println(pr.work());
        System.out.println("Ans: expecting D: 7");
        System.out.println("--------------------");
    }

    private static void prob05() {
        System.out.println("Problem 05");
        Parent pr = new Child(4, 11);
        System.out.println("Q: what is the output?");
        System.out.println(pr.work());
        System.out.println("Ans: expecting B: 4");
        System.out.println("--------------------");
    }

    private static void prob06() {
        System.out.println("Problem 06");
        System.out.println("Q: what code tells class Z inherits class A?");
        System.out.println("Ans: D: public class Z extends A{}");
        System.out.println("--------------------");
    }

    private static void prob07() {
        System.out.println("Problem 07");
        System.out.println("Q: what is the code for default contructor?");
        System.out.println("Ans: A: this(2, 5);");
        System.out.println("--------------------");
    }

    private static void prob08() {
        System.out.println("Problem 08");
        System.out.println("Q: what is the code ?");
        System.out.println("Ans: D: et.area();");
        System.out.println("--------------------");
    }

    private static void prob09() {
        System.out.println("Problem 09");
        System.out.println("Q: what is the answer to instanceOf scenarios ?");
        System.out.println("Ans: E: None of these");
        System.out.println("--------------------");
    }

    private static void prob10() {
        System.out.println("Problem 10");
        System.out.println("Q: which statement is correct ?");
        System.out.println("Ans: B: House.getInfo((Town)st);");
        System.out.println("--------------------");
    }

    private static void prob11() {
        System.out.println("Problem 11");
        System.out.println("Q: what is the value of st instanceOf Town ?");
        System.out.println("Ans: B: true");
        System.out.println("--------------------");
    }

    private static void prob12() {
        System.out.println("Problem 12");
        System.out.println("Q: which of the statements is correct ?");
        System.out.println("Ans: D: lm instanceOf Car");
        System.out.println("--------------------");
    }

    private static void prob13() {
        System.out.println("Problem 13");
        System.out.println("Q: which of the statements is correct ?");
        System.out.println("Ans: C: Engine.doStuff(lm);");
        System.out.println("--------------------");
    }

    private static void prob14() {
        System.out.println("Problem 14");
        System.out.println("Q: which of the statements is correct ?");
        System.out.println("Ans: E: All of these");
        System.out.println("--------------------");
    }

    private static void prob15() {
        System.out.println("Problem 15");
        System.out.println("Q: which of the statements is correct ?");
        System.out.println("Ans: C: super.meth();");
        System.out.println("--------------------");
    }

    private static void prob16() {
        System.out.println("Problem 16");
        System.out.println("Q: which of the statements is correct ?");
        System.out.println("Ans: B: super(g);");
        System.out.println("--------------------");
    }
}
