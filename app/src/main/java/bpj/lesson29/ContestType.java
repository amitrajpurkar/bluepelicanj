package bpj.lesson29;

public class ContestType {
    public static void main(String[] args) {
        System.out.println("Contest Problems");

        prob01();
        prob02();
        prob03();
        prob04();
        prob05();
    }

    private static void prob01(){
        System.out.println("Problem 1: Q: suppose we wish to subsract bitwise-OR of m and n from bitwise-AND of m and n; which value to use?");
        System.out.println("Ans: B. (m & n) - (m | n)");
    }

    private static void prob02(){
        System.out.println("Problem 2: Q: what is the output of the following code?");
        int p=9, q=-1;
        boolean sim = (q-- > 5) & (p++ > 22);
        System.out.println(p + " " + sim);
    }

    private static int theMethod(int k[]){
        int p=0;
        try{
            for(int j=0; j<k.length; j++){
                if(k[j]>=0 & k[j]<=k.length & k[k[j]]==3) {
                    p++;
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        return p;
    }

    private static void prob03(){
        System.out.println("Problem 3: Q: what is the output of the following code?");
        int xz[] = {6,0,3,3,5,-1,12,7,3,3};
        int w = theMethod(xz);
        System.out.println(w);
    }

    private static void prob04(){
        System.out.println("Problem 4: Q: what is the output of the following code?");
        int xz[] = {2,0,3,3,5,4,2,7,3,3};
        int w = theMethod(xz);
        System.out.println(w);
    }

    private static int theMethod2(int k[]){
        int p=0;
        try {
            for(int j=0; j<k.length; j++){
                if(k[j]>=0 && k[j]<=k.length && k[k[j]]==3) {
                    p++;
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        return p;
    }

    private static void prob05(){
        System.out.println("Problem 5: Q: what is the output of the following code?");
        int xz[] = {6,0,3,3,5,-1,12,7,3,3};
        int w = theMethod2(xz);
        System.out.println(w);
    }
}
