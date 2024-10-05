package bpj.lesson16;

public class Tester {
    public static void main(String[] args) {
        Automobile myBmw = new Automobile(24);
        myBmw.fillUp(20);
        myBmw.takeTrip(100);
        double fuelLeft = myBmw.reportFuel();

        System.out.println("fuel remaining = "+fuelLeft);

        System.out.println("Contest problems based on Student class");
        System.out.println("Problem 1: what should replace <#1> -- Ans: option b name = nm;");
        System.out.println("Problem 2: create obj stu1 and set name as Sally -- Ans: option d is corect; \n opt a is wrong because name does not refer to state variable of Student; \n opt b is wrong because name is private in Student class and cannot be accessed outside that class. \n opt c is wrong because it does not define variable stu1 as object of data-type Student ");
        System.out.println("Problem 3: Ans: opt e is correct; \n opt a is not legal as sa is int and value returned is double. \n opt b is wrong because state variable sum is private/ cannot be accessed. \n opt c is wrong because we cannot cast double to int");
        System.out.println("Problem 4: opt a is correct");
        System.out.println("Problem 5: opt a is correct, because only this variable is public");
    }
}
