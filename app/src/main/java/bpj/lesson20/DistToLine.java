package bpj.lesson20;

import java.util.Scanner;

public class DistToLine {

    public static void main(String[] args) {
        System.out.println("Lesson 20: Distance to line");

        try (Scanner kb = new Scanner(System.in)) {
            System.out.println("Enter the A value for the line: ");
            A = kb.nextDouble();
            System.out.println("Enter the B value for the line: ");
            B = kb.nextDouble();
            System.out.println("Enter the C value for the line: ");
            C = kb.nextDouble();
            System.out.println("Enter the x coordinate of the point: ");
            double x = kb.nextDouble();
            System.out.println("Enter the y coordinate of the point: ");
            double y = kb.nextDouble();
            System.out.println("The distance to the line is: " + distToLine(x, y));
        }

    }

    public static double A, B, C;

    public static double distToLine(double a, double b) {
        return Math.abs(A * a + B * b + C) / Math.sqrt(A * A + B * B);
    }
}
