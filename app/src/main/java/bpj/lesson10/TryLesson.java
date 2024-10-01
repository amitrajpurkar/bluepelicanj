package bpj.lesson10;

import java.util.Scanner;

import bpj.InputProcessor;

public class TryLesson implements InputProcessor {

    private final double factorForVoltar = 0.091;
    private final double factorForKrypton = 0.720;
    private final double factorForFertos = 0.865;
    private final double factorForServontos = 4.612;

    // public List planetsWithWeights = new ArrayList();
    // new Map<String, Double>("Voltar", 0.091),
    // new Map<String, Double>("Krypton", 0.720),
    // new Map<String, Double>("Fertos", 0.865),
    // new Map<String, Double>("Servontos", 4.612)
    // };

    @Override
    public String processStringInputs(String[] a) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your weight (in punds) on Earth: ");
        int weightOnEarth = reader.nextInt();

        System.out.println("\n");
        // for(List p: planetsWithWeights){
        // System.out.println(p.get(0) + " " + p.get(1));
        // }

        System.out.println("\n 1. Voltar");
        System.out.println(" 2. Krypton");
        System.out.println(" 3. Fertos");
        System.out.println(" 4. Servontos");
        System.out.print("Enter your choice: ");
        int planet = reader.nextInt();
        return switch (planet) {
        case 1 -> showWeightOn(weightOnEarth, "voltar");
        case 2 -> showWeightOn(weightOnEarth, "krypton");
        case 3 -> showWeightOn(weightOnEarth, "fertos");
        case 4 -> showWeightOn(weightOnEarth, "servontos");
        default -> String.valueOf(weightOnEarth);
        };
    }

    // TODO: implement the rest of the methods
    public String showWeightOn(int weightOnEarth, String planet) {
        double wt = switch (planet) {
        case "voltar" -> weightOnEarth * factorForVoltar;
        case "krypton" -> weightOnEarth * factorForKrypton;
        case "fertos" -> weightOnEarth * factorForFertos;
        case "servontos" -> weightOnEarth * factorForServontos;
        default -> 0;
        };
        return String.valueOf(wt);
    }

}
