package bpj.lesson27;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public final class BaseClass {

    //prevent instantiation
    private BaseClass() {}

    public static void main(String[] args) {
        System.out.println("Base class main method");
        String full_path = "/Users/amitrajpurkar/workspace/bluepelicanj/app/src/main/resources/NerdData.txt";

        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(3);
        nf.setMinimumFractionDigits(3);

    }

    public static String formatAverage(double average){
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(4);
        nf.setMinimumFractionDigits(4);
        return nf.format(average);
    }

    public static List<String> readLinesFromFile(String filepath) throws FileNotFoundException {
        List<String> lines = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(filepath))) {
            while (sc.hasNextLine()) {
                lines.add(sc.nextLine());
            }
        }
        return lines;
    }

    public static List<Double> getScoresPerCompetitor(String playersScores){
        StringTokenizer st = new StringTokenizer(playersScores);
        List<Double> scores = new ArrayList<>();
        while (st.hasMoreTokens()) {
            scores.add(Double.valueOf(st.nextToken()));
        }
        return scores;
    }
}
