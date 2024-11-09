package bpj.q2project;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MenuOfFive {
    public static void main(String[] args) {
        showMenu();
        int a, b;
        int pizzas, sodas, fries;
        String costOfFood = "";
        boolean retry = true;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            while (choice != 6) {
                switch (choice) {
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
                            System.out.print("Enter the temperature in farenheit: ");
                            double farenheit = sc.nextDouble();
                            System.out.print("\nEnter tolerance factor: ");
                            double tolerance = sc.nextDouble();
                            if(isCelciusConversionWithinTolerance(farenheit, tolerance)) {
                                System.out.println("Celcius conversion with approximate approach is within tolerance");
                            } else {
                                System.out.println("Celcius conversion with approximate approach is not within tolerance");
                            }
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
                            // double farenheit = sc.nextDouble();
                            // doubleYesterday();
                            System.out.println("some response to user: ");
                            System.out.println("Do you want to retry? (y/n)");
                            String ans = sc.next();
                            if (ans.equals("n")) {
                                retry = false;
                            }
                        }
                    }
                }

                showMenu();
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
            }
        }
        System.out.println("Goodbye!");
    }

    private static void showMenu() {
        System.out.println("Choose from the following menu");
        System.out.println("1. Divisible numbers");
        System.out.println("2. Food menu");
        System.out.println("3. Farenheit to Celcius");
        System.out.println("4. Military to Standard Time format");
        System.out.println("5. one more");
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
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds=0;
        if(parts.length == 3)
            seconds = Integer.parseInt(parts[2]);

        if (hours > 12) {
            hours -= 12;
        }
        String amOrPm = hours >= 12 ? "PM" : "AM";
        hours = hours % 12;
        if (hours == 0) {
            hours = 12;
        }
        return String.format("%02d:%02d:%02d %s", hours, minutes, seconds, amOrPm);
    }

    private static boolean isCelciusConversionWithinTolerance(double farenheit, double tolerance) {
        double celcius_accurate = (farenheit - 32) * 5 / 9;
        double celcius_approximate = (farenheit - 32) / 2;

        return Math.abs(celcius_accurate - celcius_approximate) < tolerance;
    }
}
