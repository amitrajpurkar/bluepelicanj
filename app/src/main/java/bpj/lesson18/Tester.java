package bpj.lesson18;

public class Tester {

    public static void main(String[] args) {
        exer5();
    }

    private static void exer5() {
        System.out.println("Exercise 5: ");
        String s = "The best THERE is is Barth";
        String[] sp = s.toLowerCase().split("th");
        int occurances = sp.length;
        System.out.println("occurances of TH (should be 3) using split method = "+occurances);
        System.out.println("--------------------------------");
    }
}
