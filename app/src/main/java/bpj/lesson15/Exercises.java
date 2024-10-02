package bpj.lesson15;

public class Exercises {

    public static void main(String[] args) {
        System.out.println("Lesson 15: Classes and Objects");

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
    }

    /**
     * double length = 44.0;
     * int width = 13;
     * Rectangle myRect = new Rectangle(length, width);
     * a. Identify the class
     * b. Identify the object
     * c. What type of parameters are passed to the constructor
     */
    private static void exer01() {
        System.out.println("Exercise 1: ");
        System.out.println("a. the class is Rectangle");
        System.out.println("b. the object is myRect");
        System.out.println("c. the parameters are length and width");
        System.out.println("--------------------------------");
    }

    /**
     * Write out the signature for the constructor of the Rectangle class from #1 above
     */
    private static void exer02() {
        System.out.println("Exercise 2: ");
        System.out.println("The signature of the constructor is: ");
        System.out.println("public Rectangle(double length, int width) { }");
        System.out.println("--------------------------------");
    }

    /**
     * Suppose a constructor for the Lunch class is as follows
     * public Lunch(boolean diet, int cal) {
     *    diet_yes_no = diet;
     *    calorie_count = cal; 
     * }
     * write appropriate code that will create a Lunch object called yummy5. 
     * you should tell teh constructor that, yes, you are on a diet, and the number of calaries should be 900
     */
    private static void exer03() {
        System.out.println("Exercise 3:  ");
        System.out.println("yummy5 = new Lunch(true, 900);");
        System.out.println("--------------------------------");
    }

    /**
     * BankAccount account39 = new BanckAccount(500.43);
     * a. identify the class
     * b. identify the object
     * c. what type of paramters are passed to the constructor?
     */
    private static void exer04() {
        System.out.println("Exercise 4: ");
        System.out.println("a. the class is BankAccount");
        System.out.println("b. the object is account39");
        System.out.println("c. the parameter passed is an double, that possibly represents the balance");
        System.out.println("--------------------------------");
    }

    /**
     * A class is like a ---- and an object is like a ---
     * fill in teh blanks above using teh words "cookie" and "cookie cutter"
     */
    private static void exer05() {
        System.out.println("Exercise 5: ");
        System.out.println("A class is like a cookie cutter and an object is like a cookie");
        System.out.println("--------------------------------");
    }

    /**
     * whats wrong (if anything) with the following constructor for the School class?
     * public void school(int d, String m)
     * { ... some code ... }
     */
    private static void exer06() {
        System.out.println("Exercise 6: ");
        System.out.println("1. a constructor does not have a return type");
        System.out.println("2. a constructor mehtod name must match the class name -- school vs School");
        System.out.println("--------------------------------");
    }

    private static void exer07() {
        System.out.println("Exercise 7: ");
        System.out.println("a. One class, many objects <-- this is correct/ true");
        System.out.println("b. One object, many classes <-- incorrect; in Java an object can be instance of only one class");
        System.out.println("--------------------------------");
    }

    private static void exer08() {
        System.out.println("Exercise 8: ");
        System.out.println("a. The class <-- this must exist first");
        System.out.println("b. The object <-- Object is always an instance of class; so it cannot be first.");
        System.out.println("--------------------------------");
    }

    private static void exer09() {
        System.out.println("Exercise 9: ");
        System.out.println("is the following legal? House and Tester... ");
        System.out.println("The constructor defined for House is legal");
        System.out.println("The instantiation of myHouse object in Tester is not legal, because there is no constructor defined in House Class that acceepts two integer parameters.");
        System.out.println("--------------------------------");
    }


    /**
     * constructor:
     * public Band(int numMbembers, int numInstruments, String director, double amount)
     * { ... some code ... }
     * 
     * Band ourBand = new Band(mem, instrmts, "Mr Perkins", budget);
     * What should be the data types of:
     * a. mem
     * b. instrmts
     * c. budget
     */
    private static void exer10() {
        System.out.println("Exercise 10: ");
        System.out.println("a. int should be the data type of mem ");
        System.out.println("b. int should be the data type of instrmts");
        System.out.println("c. double should be the data type of budget");
        System.out.println("--------------------------------");
    }

    /**
     * use the following class definition
     * 
     * public class BibleStory {
     *    public int var1;
     *    public double var2;
     *    public String sss;
     * 
     *    public void Samson(double zorro) { ... some code ... }
     * 
     *    public String getDelilah() { ... some code ... }
     * 
     *    public BibleStory(String x, int y, double z) { ... some code ... }
     * }
     */
    private static void exer11() {
        System.out.println("Exercise 11: ");
        System.out.println("From the BibleStory class above, write the signature of the constructor");
        System.out.println("public BibleStory(String x, int y, double z) { ... some code ... }");
        System.out.println("--------------------------------");
    }

    private static void exer12() {
        System.out.println("Exercise 12: ");
        System.out.println("From the BibleStory class above, what is/are the instance fields");
        System.out.println("var1, var2, and sss are the instance fields");
        System.out.println("--------------------------------");
    }

    private static void exer13() {
        System.out.println("Exercise 13: ");
        System.out.println("From the BibleStory class above, write the signatures of the all the methods");
        System.out.println("public void Samson(double zorro) { ... some code ... }");
        System.out.println("public String getDelilah() { ... some code ... }");
        // is contructor also a method ????
        System.out.println("--------------------------------");
    }

    /**
     * write code that instantiates an object called philistine from BibleStory class
     * Pass the following paramters to the constructor
     * the integer should be 19, the String should be Ralph, and the double should be 24.18
     */
    private static void exer14() {
        System.out.println("Exercise 14: ");
        System.out.println("BibleStory philistine = new BibleStory(19, \"Ralph\", 24.18);");
        System.out.println("--------------------------------");
    }

    /**
     * Assume an object called gravy has been created from the BibleStory class
     * Write code that will set the state varaible var2 to 106.9 for the gravy object
     */
    private static void exer15() {
        System.out.println("Exercise 15: ");
        System.out.println("gravy.var2 = 106.9;");
        System.out.println("alternatively if method Samson is defined to set var2 value, then following would work:");
        System.out.println("gravy.Samson(106.9);");
        System.out.println("--------------------------------");
    }

    /**
     * write code that will print the value of the BibleStory data member, sss.
     * Assume you have already created an object called bart.
     */
    public static void exer16() {
        System.out.println("Exercise 16: ");
        System.out.println("System.out.println(bart.sss);");
        System.out.println("--------------------------------");
    }

    /**
     * Again, assume we have an object called bart instantiated from BibleStory class.
     * What should you fill in for <#1> below in order that sss bve stored in teh variable jj?
     * <#1> jj = bart.sss;
     */
    public static void exer17() {
        System.out.println("Exercise 17: ");
        System.out.println("String jj = bart.sss;");
        System.out.println("--------------------------------");
    }

    /**
     * create a class called Trail. 
     * instantiate an object of Trail and call the method called "met"
     */
    public static void exer18() {
        System.out.println("Exercise 18: ");
        Trail t = new Trail("hello");
        System.out.println("invoking t.met() returns = " + t.met());
        System.out.println("verifying hex of 10*10 = " + Integer.toHexString(100));
        System.out.println("--------------------------------");
    }

    /**
     * suppose you wish to call a method whose signature is :
     * public double peachyDandy(int z) { ... some code ... }
     * 
     * write code that would call this method (assume we have an object called zippo). 
     * Also assume that this code will be placed in the main method of Tester class
     * and that the peachyDandy method is in some other class.
     */
    public static void exer19() {
        System.out.println("Exercise 19: ");
        System.out.println("double val = zippo.peachyDandy(10);");
        System.out.println("--------------------------------");
    }

    public static void exer20() {
        System.out.println("Exercise 20: ");
        System.out.println("given the following code:");
        System.out.println("double hamburger = zippo.peachyDandy(127.31);");
        System.out.println("what is wrong with this code?");
        System.out.println("The parameter z is an int, not a double, for the method peachyDandy");
        System.out.println("--------------------------------");
    }
}
