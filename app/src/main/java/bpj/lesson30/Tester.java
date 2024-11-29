package bpj.lesson30;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Lesson 30: Random Numbers -- testing Monte Carlo Simulation");
        
        testPiUsingMonteCarlo(100);
        testPiUsingMonteCarlo(1000);
        testPiUsingMonteCarlo(10000);
        testPiUsingMonteCarlo(100000);
        testPiUsingMonteCarlo(1000000);
    }


    private static void testPiUsingMonteCarlo(int iterations) {
        MonteCarlo mcObj = new MonteCarlo(5, 3, 2);
        double x, y;
        int cirCount = 0, sqrCount = 0;
        double pi = 0.0;
        double actual_pi =  Math.PI;

        for (int i = 0; i < iterations; i++) {
            x = mcObj.nextRainDrop_x();
            y = mcObj.nextRainDrop_y();
            // System.out.println("x = " + x + " y = " + y);

            if (mcObj.insideCircle(x, y)) {
                cirCount++;
            }
            sqrCount++;
        }

        System.out.println("Circle count = " + cirCount + "; Square count = " + sqrCount);
        double areaOfSquare = (2 * mcObj.radius) * (2 * mcObj.radius);
        pi = (cirCount * areaOfSquare) / (sqrCount * mcObj.radius * mcObj.radius);
        System.out.println("pi = " + pi + "; Actual pi = " + actual_pi);

        System.out.println("Difference = " + Math.abs(pi - actual_pi));
        System.out.println("--------------------------------");
    }

}
