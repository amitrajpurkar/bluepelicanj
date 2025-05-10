package bpj._lessonXX;

public class quickTry {
    public static void main(String[] args) {
        System.out.println("Quick and dirty try");
        System.out.println(comboStr("hello", "hi"));
        System.out.println(comboStr("hi", "hello"));
        System.out.println(comboStr("aaa", "b"));
    }

    private static String comboStr(String small, String large) {
        if (small == null || small.length() == 0) {
            return large;
        } else if (large == null || large.length() == 0) {
            return small;
        } else if(small.length() == large.length()) {
            System.out.println("both strings are the same length");
            return "------";
        } else if (large.length() > small.length()) {
            return small + large + small;
        } else {
            return large + small + large;
        }
    }

    /**
     * given a string, return a version without the first and last char, so "Hello" yields "ell". the length will be at least 2
     */
    public static String middleTwo(String str) {
        if (str.length() < 3) {
            // System.out.println("length is less than 3");
            return "";//return empty
        } else
            return str.substring(1, str.length()-1);
    }
}
