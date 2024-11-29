package bpj.lesson30;

import java.util.Random;

public class MonteCarlo {

    public double x_coord, y_coord, radius;
    private final Random rndm = new Random();

    public MonteCarlo(double h, double k, double r) {
        x_coord = h;
        y_coord = k;
        radius = r;
    }

    public double nextRainDrop_x(){
        return x_coord + rndm.nextDouble() * 2 * radius - radius;
    }

    public double nextRainDrop_y(){
        return y_coord + rndm.nextDouble() * 2 * radius - radius;
    }

    public boolean insideCircle(double x, double y){
        double dx = x - x_coord;
        double dy = y - y_coord;
        return (dx * dx + dy * dy) < radius * radius;
    }
}
