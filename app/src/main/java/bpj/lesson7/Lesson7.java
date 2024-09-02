/*
 * Copyright (c) DB Schenker Australia Pty Ltd
 *
 * All rights reserved.
 */
package bpj.lesson7;

import java.util.Scanner;

import bpj.InputProcessor;

/**
 * @author amitrajpurkar
 *
 */
public class Lesson7 implements InputProcessor {

    /**
     * @see bpj.InputProcessor#processStringInputs(java.lang.String[])
     */
    @Override
    public String processStringInputs(String[] a) {
        String s = "";

        if (a == null) {
            try (Scanner kbReader = new Scanner(System.in)) {
                System.out.print("enter few words: ");
                s = kbReader.nextLine();
            }
        } else if (a.length == 1 && a[0].toLowerCase().contentEquals("integer")) {
            try (Scanner kb2 = new Scanner(System.in)) {
                System.out.print("enter an integer: ");
                int i = kb2.nextInt();
                s = String.valueOf(i * 3);
            }
        } else if (a.length == 1 && a[0].toLowerCase().contentEquals("double")) {
            try (Scanner kb3 = new Scanner(System.in)) {
                System.out.print("enter an floating point number: ");
                double d = kb3.nextDouble();
                s = String.valueOf(d * 3);
            }
        } else if (a.length == 1 && a[0].toLowerCase().contentEquals("going in circles")) {
            try (Scanner kb = new Scanner(System.in)) {
                System.out.print("provide an area of circle: ");
                double area = kb.nextDouble();
                double radius = Math.sqrt(area / Math.PI);
                s = "Radius of your circle is " + String.valueOf(Math.round(radius));
            }
        } else if (a.length == 1 && a[0].toLowerCase().contentEquals("whats my name")) {
            try (Scanner kb = new Scanner(System.in)) {
                System.out.print("What is your first name? ");
                String fname = kb.next();
                System.out.print("What is your last name? ");
                String lname = kb.next();
                s = "Your full name is " + fname + " " + lname;
            }
        }

        return s;
    }

}
