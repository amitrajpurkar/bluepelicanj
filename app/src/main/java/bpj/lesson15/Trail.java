package bpj.lesson15;

public class Trail {
    private int x=10, y=10;
    private String s;

    public Trail(String str) {
        s = str;
    }

    public String met(){
        return Integer.toHexString(x * y);
    }
}
