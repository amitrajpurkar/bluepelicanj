package apcentral.ap2024frq;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Testing AP 2024 FRQ");

        simulateSingleDays();
        //simulateMultipleDays();
        
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
