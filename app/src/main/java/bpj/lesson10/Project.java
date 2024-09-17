package bpj.lesson10;

import java.util.Scanner;

public class Project {
    private static double factorForVoltar=0.091;
    private static double factorForKrypton=0.720;
    private static double factorForFertos=0.865;
    private static double factorForServontos=4.612;

    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Enter your weight (in punds) on Earth: ");
            int weightOnEarth = reader.nextInt();
            System.out.println("\n 1. Voltar");
            System.out.println(" 2. Krypton");
            System.out.println(" 3. Fertos");
            System.out.println(" 4. Servontos");
            System.out.print("Enter your choice: ");
            int planet = reader.nextInt();
            switch (planet) {
                case 1 -> showWeightOn(weightOnEarth, "Voltar");
                case 2 -> showWeightOn(weightOnEarth, "Krypton");
                case 3 -> showWeightOn(weightOnEarth, "Fertos");
                case 4 -> showWeightOn(weightOnEarth, "Servontos");
                default -> System.out.println("Invalid choice");
            }
        }
    }   

    private static void showWeightOn(int weightOnEarth, String planet){
        String convertedWeight="Your weight on "+planet+" is: ";
        double wt;
        switch(planet){
            case "Voltar":
                wt = weightOnEarth * factorForVoltar;
                break;
            case "Krypton":
                wt = weightOnEarth * factorForKrypton;
                break;
            case "Fertos":
                wt = weightOnEarth * factorForFertos;
                break;
            case "Servontos":
                wt = weightOnEarth * factorForServontos;
                break;
            default:
                wt = 0;
        }
        System.out.println(convertedWeight+wt);
    }
        
}   
