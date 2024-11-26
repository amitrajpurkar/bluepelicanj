package bpj.lesson29;

public class TweakingForSpeed {
    public static void main(String[] args) {
        System.out.println("Tweaking for Speed..");
        int p=386, q=581, n=0;
        long start = System.currentTimeMillis();
        System.out.println("calling firstLoop at ..."+start);
        n = firstLoop(p,q);
        System.out.println("n = "+n);
        System.out.println("checking time at end of firstLoop ..."+(System.currentTimeMillis()-start) +" ms");

        start = System.currentTimeMillis();
        System.out.println("calling secondLoop at ..."+start);
        n = secondLoop(p, q);
        System.out.println("n = "+n);
        System.out.println("checking time at end of secondLoop ..."+(System.currentTimeMillis()-start) +" ms");

        start = System.currentTimeMillis();
        System.out.println("calling thirdLoop at ..."+start);
        n = thirdLoop(p,q);
        System.out.println("n = "+n);
        System.out.println("checking time at end of thirdLoop ..."+(System.currentTimeMillis()-start) +" ms");

    }

    private static int firstLoop(int p, int q){
        int value = 0;
        for(int j =0; j<2000000000; j++){
            value = ((p * 2) + q)/2;
        }

        return value;
    }

    private static int secondLoop(int p, int q){
        int value = 0;
        for(int j =0; j<2000000000; j++){
            value = p + q/2;
        }

        return value;
    }

    private static int thirdLoop(int p, int q){
        int value = 0;
        for(int j =0; j<2000000000; j++){
            value = ((p * 2) + q)>>1;
        }

        return value;
    }
}
