package apcentral.ap2024frq;

/**
 * try out the coding examples from 2024 FRQ for AP Computer Science A
 * https://apcentral.collegeboard.org/media/pdf/ap24-frq-comp-sci-a.pdf
 */
public class Tester {
    public static void main(String[] args) {
        System.out.println("Testing AP 2024 FRQ");

        simulateSingleDays();
        //simulateMultipleDays();
        playGame1();
        
    }

    private static void playGame1() {
        System.out.println("---- Play Game 1 ----------");
        String info;
        Scoreboard game = new Scoreboard("Red", "Blue");
        info = game.getScore();
        System.out.println(info);
        game.recordPlay(1);
        info = game.getScore();
        System.out.println(info);
        game.recordPlay(0);
        info = game.getScore();
        System.out.println(info);
        info = game.getScore();
        System.out.println(info);
        game.recordPlay(3);
        info = game.getScore();
        System.out.println(info);
        game.recordPlay(1);
        game.recordPlay(0);
        info = game.getScore();
        System.out.println(info);
        game.recordPlay(0);
        game.recordPlay(4);
        game.recordPlay(0);
        info = game.getScore();
        System.out.println(info);
        System.out.println("---- End of Testing Play Game 1 ----------");
    }

    private static void playGame2() {
        System.out.println("---- Play Game 2 ----------");
        String info;
        Scoreboard match = new Scoreboard("Lions", "Tigers");
        info = match.getScore();
        System.out.println(info);
        match.recordPlay(1);
        info = match.getScore();
        System.out.println(info);
        match.recordPlay(0);
        info = match.getScore();
        System.out.println(info);
        info = match.getScore();
        System.out.println(info);
        match.recordPlay(3);
        info = match.getScore();
        System.out.println(info);
        match.recordPlay(1);
        match.recordPlay(0);
        info = match.getScore();
    }

    private static void simulateSingleDays() {
        System.out.println("---- Simulating Bird Feeder, Single Day ----------");

        Feeder fone1 = new Feeder(500);
        fone1.simulateOneDay(12);

        Feeder fone2 = new Feeder(1000);
        fone2.simulateOneDay(22);

        Feeder fone3 = new Feeder(100);
        fone3.simulateOneDay(5);
        
        System.out.println("---- End of Testing Bird Feeder, Single Day ----------");
    }

    private static void simulateMultipleDays() {
        System.out.println("---- Simulating Bird Feeder Many Days ----------");

        Feeder fmany1 = new Feeder(2400);
        fmany1.simulateManyDays(10, 4);

        Feeder fmany2 = new Feeder(250);
        fmany2.simulateManyDays(10, 5);

        Feeder fmany3 = new Feeder(0);
        fmany3.simulateManyDays(5, 10);

        System.out.println("---- End of Testing Bird Feeder ----------");
    }
}
