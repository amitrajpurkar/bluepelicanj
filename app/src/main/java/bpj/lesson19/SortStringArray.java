package bpj.lesson19;

import java.util.Arrays;

public class SortStringArray {
    public static void main(String[] args) {
        String[] ss = {"Bill","Mary","Lee","Agnus","Alfred","Thomas","Alvin","Bernard","Ezra","Herman"};
        System.out.println("original array = "+Arrays.toString(ss));

        System.out.println("one style:");
        String[] copy = Arrays.copyOf(ss, ss.length);
        Arrays.sort(copy);
        for(String s:copy) System.out.println(s);

        System.out.println("style as per 19-3... thats same as above");

    }
}
