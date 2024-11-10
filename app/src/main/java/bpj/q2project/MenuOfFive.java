package bpj.q2project;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MenuOfFive {
    public static void main(String[] args) {
        showMenu();
        int menu;
        int a, b;
        int pizzas, sodas, fries;
        String costOfFood = "";
        boolean retry = true;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your choice: ");
            menu = sc.nextInt();
            do {
                // System.out.println("debug -- choice is not 6 = "+menu);
                switch (menu) {
                    case 1 -> {
                        while(retry){
                            System.out.print("Enter two numbers, a and b to check if a is divisible by b: ");
                            a = sc.nextInt();
                            b = sc.nextInt();
                            if(isDivisible(a, b) == 1) System.out.println(a + " is divisible by " + b);
                            else if(isDivisible(a, b) == 0) System.out.println(a + " is not divisible by " + b);
                            else System.out.println("Invalid input: "+a+" and "+b);
                            System.out.println("Do you want to retry? (y/n)");
                            String ans = sc.next();
                            if (ans.equals("n")) {
                                retry = false;
                            }
                        }
                    }
                    case 2 -> {
                        while(retry){
                            System.out.println("Food Menu - enter what you want to order");
                            System.out.print("how many pizzas do you want to order: ");
                            pizzas = sc.nextInt();
                            System.out.print("\nhow many sodas do you want to order: ");
                            sodas = sc.nextInt();
                            System.out.print("\nhow many fries do you want to order: ");
                            fries = sc.nextInt();
                            System.out.println("\nYou ordered "+pizzas+" pizzas, "+sodas+" sodas and "+fries+" fries");
                            costOfFood = calculateCost(pizzas, sodas, fries);
                            System.out.println("Your total cost is: "+costOfFood);
                            System.out.println("Do you want to retry? (y/n)");
                            String ans = sc.next();
                            if (ans.equals("n")) {
                                retry = false;
                            }
                        }
                    }
                    case 3 -> {
                        while(retry){
                            System.out.print("Enter time in Military format HH:MM:SS -- ");
                            String militaryTime = sc.next();
                            String standardTime = convertTimeMillitaryToStandardFormat(militaryTime);
                            System.out.println("Time in Standard format is: "+standardTime);
                            System.out.println("Do you want to retry? (y/n)");
                            String ans = sc.next();
                            if (ans.equals("n")) {
                                retry = false;
                            }
                        }
                    }
                    case 4 -> {
                        while(retry){
                            System.out.print("\nEnter tolerance factor: ");
                            double tolerance = sc.nextDouble();
                            double farenheit = farenheitExceedingTolerance(tolerance);

                            System.out.println("the accurate vs approximate Celcius conversion exceeds tolerance of "+tolerance+" at "+farenheit+ " Farenheit");
                            System.out.println("The temperature above 32 degrees is: "+(farenheit - 32)+" Farenheit");
                            System.out.println("Do you want to retry? (y/n)");
                            String ans = sc.next();
                            if (ans.equals("n")) {
                                retry = false;
                            }
                        }
                    }
                    case 5 -> {
                        while(retry){
                            System.out.println("The Double-Yesterday problem: ");
                            System.out.print("Enter the number of days: ");
                            int days = sc.nextInt();
                            String response = doubleYesterday(days);
                            System.out.println(response);
                            
                            System.out.println("Do you want to retry? (y/n)");
                            String ans = sc.next();
                            if (ans.equals("n")) {
                                retry = false;
                            }
                        }
                    }
                    default -> {
                    }
                }

                showMenu();
                System.out.print("Enter your choice: ");
                menu = sc.nextInt();
                retry = true; // reset this flag for individual menus to process.
            } while (menu != 6);
        }
        System.out.println("Goodbye!");
    }

    private static void showMenu() {
        System.out.println("Choose from the following menu");
        System.out.println("1. Can You Divide?");
        System.out.println("2. Food Billing");
        System.out.println("3. Standard or Military?");
        System.out.println("4. Celcius-heit");
        System.out.println("5. Double Yesterday");
        System.out.println("6. Exit ");
    }


    private static int isDivisible(int a, int b) {
        if (b == 0) {
            return -1;
        }
        if (a % b == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    private static String calculateCost(int pizzas, int sodas, int fries) {
        double cost_per_pizza = 10;
        double cost_per_soda = 2;
        double cost_per_fries = 3;
        double sales_tax = 0.075;//7.5%

        double costOfPizzas = pizzas * cost_per_pizza;
        double costOfSodas = sodas * cost_per_soda;
        double costOfFries = fries * cost_per_fries;
        double subtotal = costOfPizzas + costOfSodas + costOfFries;
        double tax = subtotal * sales_tax;
        double total = subtotal + tax;

        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        String costString = nf.format(total);

        return costString;
    }   

    private static String convertTimeMillitaryToStandardFormat(String time) {
        String convertedTime = "";
        String[] parts = time.split(":");
        int mil_hours = Integer.parseInt(parts[0]);
        int std_hours = 0;
        int minutes = Integer.parseInt(parts[1]);
        int seconds=0;
        if(parts.length == 3)
            seconds = Integer.parseInt(parts[2]);

        if(mil_hours > 24 || minutes > 59 || seconds > 59){
            convertedTime = "Invalid time provided: " + time;
            return convertedTime; // return early when input validation fails
        }

        if (mil_hours > 12) {
            std_hours = mil_hours - 12;
        } else {
            std_hours = mil_hours;
        }
        String amOrPm = mil_hours >= 12 ? "PM" : "AM";
        convertedTime = String.format("%02d:%02d:%02d %s", std_hours, minutes, seconds, amOrPm);
        return convertedTime;
    }

    private static double farenheitExceedingTolerance(double tolerance) {
        // double celcius_accurate = (farenheit - 32) * 5 / 9;
        // double celcius_approximate = (farenheit - 32) / 2;

        // double tolerance = celcius_accurate - celcius_approximate;
        // t = ((F -32) * 5/9) - (F - 32)/2;
        // F = (t + 16/9) * 18;

        double farenheit = (tolerance + 16/9) * 18;

        // System.out.println("Celcius conversion with accurate approach is: "+celcius_accurate);
        // System.out.println("Celcius conversion with approximate approach is: "+celcius_approximate);

        return farenheit;
    }

    /**
     * Story time
     * One day a man named Ben Efactor offered Mike two choices
     * 1. one million dollars or
     * 2. "double yesterday" -- a penny today, two pennies tomorrow, 
     * then four pennies the day after and so on, doubling the revious days amount for a period of time
     * Mike, having heard of this supposition, and not liking math, cannot decide which to choose.
     * Of course the decision will depend on how long Ben will give him double yesterday.
     * You are being asked to help Mike determine whether the total amount with double yesterday 
     * is greater than or less than the million dollars, for various number of days.
     * Ben's a weirdo because he gives largeamounts of money to complete stranders.
     * But hey, no ones complaining.
     * Input: amount of time in days that Ben gives the double yesterday option
     * Each number on a line in the format days = <num>
     * Output: 1. Duration of Double Yesterday
     * 2. Amount generated (comma formatted)
     * 3. Whether or not amount of double yesterday is greater than million dollars
     * 4. Whether or not Mike takes the double yesterday option
     * 
     * Output example:
     * DOUBLE YESTERDAY FOR <length of time> DAYS GIVES MIKE $<amount> , WHICH IS <GREATER/LESS> THAN $1,000,000.00 , SO TAKE THE <million/double yesterday> OPTION. BYE BYE.
     * 
     */
    private static String doubleYesterday(int numberOfDays) {
        System.out.println("double yesterday");
        double million = 1000000 * 100;// converting to pennies
        double accumulator = 1;// one penny on day one

        // from day 2 till numberOfDays
        // for (int i = 2; i <= numberOfDays; i++) {
        //     accumulator = 2 * accumulator;
        // }

        //above is same as 2^(numberOfDays-1)
        accumulator = Math.pow(2, numberOfDays - 1); 

        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        String doubleYesterday = nf.format(accumulator / 100); // convert to dollars
        String greaterThanMillion = accumulator > million ? "greater than" : "less than";
        String takeOption = accumulator > million ? "double yesterday" : "million" ;

        String message = String.format("DOUBLE YESTERDAY FOR %d DAYS GIVES MIKE %s, WHICH IS %s THAN $1,000,000.00 , SO TAKE THE %s OPTION. BYE BYE.", numberOfDays, doubleYesterday, greaterThanMillion, takeOption);

        return message;
    }
}
