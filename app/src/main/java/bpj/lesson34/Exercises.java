package bpj.lesson34;

public class Exercises {
    public static void main(String[] args) {
        MyClass theObj = new MyClass();
        theObj.gravy = 107.43;

        String s = "hello";
        int xray[] = {1,2,3,4,5};
        double floozy = 97.4;

        myMethod(floozy, theObj, xray, s);

        System.out.println("expected 97.4 (passing by value) --> floozy = "+floozy);
        System.out.println("expected 10.001 (passing by ref) --> theObj.gravy = "+theObj.gravy);
        System.out.println("expected 100 (passing array by ref) --> xray[2] = "+xray[2]);
        System.out.println("expected 'hello' (string is immutable) --> s = "+s);
    }

    public static void myMethod(double floozy, MyClass anObj, int a[], String s){
        floozy = 13.1;
        anObj.gravy = 10.001;
        a[2] = 100;
        s = "good bye";
    }
}
