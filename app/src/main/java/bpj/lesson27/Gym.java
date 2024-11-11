package bpj.lesson27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gym {
    public static void main(String[] args) throws Exception {
        System.out.println("Gym main method");

        String full_path = "/Users/amitrajpurkar/workspace/bluepelicanj/app/src/main/resources/DataGym.in";

        List<String> lines = BaseClass.readLinesFromFile(full_path);
        List<Double> scores = new ArrayList<>();
        double accumulator = 0.0;
        
        List<String> playerAverages = new ArrayList<>();
        int playerNumber = 0;

        for(String playersScores: lines) {
            playerNumber++;
            scores = BaseClass.getScoresPerCompetitor(playersScores);
            Double[] sortedScores = new Double[scores.size()];
            Arrays.sort(scores.toArray(sortedScores));
            for (int i = 1; i < sortedScores.length -1; i++) {
                accumulator += sortedScores[i];
            }
            double average = accumulator / (sortedScores.length - 2);
            
            playerAverages.add("For Competitor #"+playerNumber+", the average is "+BaseClass.formatAverage(average));
            accumulator = 0.0;
        }

        for (String line : playerAverages) {
            System.out.println(line);
        }
    }
}
