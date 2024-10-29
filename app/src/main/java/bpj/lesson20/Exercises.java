package bpj.lesson20;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("Lesson 20: Static methods, state variables");

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
    }

    private static void exer01(){
        System.out.println("Exercise 1:");
        System.out.println("Q: at any time, after several TvShow objects have been initialized, how will you find out how many shows were initialized");
        System.out.println("Ans: call the static method TvShow.numberOfShows()");
        System.out.println("--------------------");
    }

    private static void exer02(){
        System.out.println("Exercise 2:");
        System.out.println("Q: would the code inside the numberOfShows method still be correct, if the numberOfShows were non-static? if not why?");
        System.out.println("Ans: if numberOfShows is non-static method, the code inside will tell how many shows when that specific instance was created and not the number of shows at any time; Also we will need to call it by instance of TvShow object");
        System.out.println("--------------------");
    }

    private static void exer03(){
        System.out.println("Exercise 3:");
        System.out.println("Q: supposed the code inside numberOfShows method is replaced by 'return y;' is this legal? if not why?");
        System.out.println("Ans: this is not legal; from within static method we can only call another static method or a static variable; and y is an instance variable; it is non-static");
        System.out.println("--------------------");
    }

    private static void exer04(){
        System.out.println("Exercise 4:");
        System.out.println("Q: write a code that will return actor2, without instantiating any object.");
        System.out.println("Ans: public static String getActor2(){return actor2;}");
        System.out.println("--------------------");
    }

    private static void exer05(){
        System.out.println("Exercise 5:");
        System.out.println("Q: is the following code legal? if not why? 'TvShow.setActor1(\"Jimmy Stewart\");'");
        System.out.println("Ans: not legal; method setActor is and instance method, we need to create an instance of TvShow class to call that method");
        System.out.println("--------------------");
    }

    private static void exer06(){
        System.out.println("Exercise 6:");
        TvShow chrs = new TvShow("Cheers");
        System.out.println("number of shows = "+chrs.numberOfShows());
        System.out.println("--------------------");
    }

    private static void exer07(){
        System.out.println("Exercise 7:");
        System.out.println("val of x = "+TvShow.x);

        TvShow chrs = new TvShow("Cheers");
        System.out.println("tv show x = "+ TvShow.x);
        System.out.println("chrs x = "+chrs.x);

        TvShow hc = new TvShow("Histor Channel");
        System.out.println("tv show x = "+TvShow.x);
        System.out.println("hc x = "+hc.x);

        System.out.println("--------------------");
    }

    static public char c = 'K';
    private static void exer08(){
        System.out.println("Exercise 8:");
        System.out.println("Q: is the following code legal \n static public char c = 'K';");
        System.out.println("Ans: yes this is legal");
        System.out.println("--------------------");
    }

    public static double zxb = 0.0;
    private static void exer09(){
        System.out.println("Exercise 9:");
        System.out.println("Q: write code to cause zxb to be static variable; zxb is a double");
        System.out.println("Ans: public static double zxb;");
        System.out.println("--------------------");
    }


    private static void exer10(){
        System.out.println("Exercise 10:");
        System.out.println("Q: write code to cause sb to be static variable; sb is an empty String");
        System.out.println("Ans: public static String sb = \"\";"); 
        System.out.println("--------------------");
    }

    private static void exer11(){
        System.out.println("Exercise 11:");
        System.out.println("Q: what is the significance of the word Math when we use Math.pow(3.2, 4.001)");
        System.out.println("Ans: Math is a class and pow is its static method.");
        System.out.println("--------------------");
    }

    private static void exer12(){
        System.out.println("Exercise 12:");
        System.out.println("Q: Class variables are also called ____ variables");
        System.out.println("Ans: state variables");
        System.out.println("--------------------");
    }

    private static void exer13(){
        System.out.println("Exercise 13:");
        System.out.println("Q: assume static imports and rewrite code");
        System.out.println("Ans: double xop = pow(sqrt(x - zv), 3.1);");
        System.out.println("--------------------");
    }

    private static void exer14(){
        System.out.println("Exercise 14:");
        System.out.println("Q: what are the two primary reason for using static keyword");
        System.out.println("Ans: first to access class variables and methods without instantiating the class; \n second static data members are shared among all objects of that class; ");
        System.out.println("--------------------");
    }
}
