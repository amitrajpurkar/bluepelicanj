package bpj.lesson30;

import java.util.Random;

public class Coin {
    public Coin(){
        r = new Random();
    }

    public int toss(){
        int i  = r.nextInt();
        if(i<0){
            return HEADS;
        }else{
            return TAILS;
        }
    }

    public static final int HEADS = 0;
    public static final int TAILS = 1;

    private Random r;
}
