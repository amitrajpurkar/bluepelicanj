package bpj.lesson16;

public class Weenie {

    private double x;
    private int y;
    private String z;

    public Weenie(double x, int y, String z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Weenie() {
        System.out.println("empty constructor");
    }

    public String method1(int jj){
        System.out.println("you gave int "+jj);
        return Integer.toHexString(jj);
    }

    public void method2(String b){
        System.out.println("you gave String "+b);
    }

    public int method3(){
        return y;
    }
}
