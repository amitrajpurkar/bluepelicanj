package bpj.lesson38;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Linear Function of a line:: y = mx + b");
        System.out.println("------------------------------");
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);

            System.out.print("What is the Slope of your line?  ");
            double slope = sc.nextDouble();

            System.out.print("/nWhat is the y-intercept of your line?  ");
            double yIntercept = sc.nextDouble();

            LinearFunction line = new LinearFunction(slope, yIntercept);

            System.out.println("/nSlope of this line is: "+line.getSlope());
            System.out.println("Y Intercept of this line is: "+line.getYintercept());
            System.out.println("Root of this line is: "+line.getRoot());

            System.out.print("/n What is an x value for which you wish to solve for y?");
            double x = sc.nextDouble();
            System.out.println("/n The y-value corresponding to x = "+x+" is "+line.getYvalue(x));


            System.out.print("/n What is an y value for which you wish to solve for x?");
            double y = sc.nextDouble();
            System.out.println("/n The x-value corresponding to y = "+y+" is "+line.getXvalue(y));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
