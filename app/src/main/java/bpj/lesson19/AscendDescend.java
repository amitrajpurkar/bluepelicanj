package bpj.lesson19;

import java.util.Arrays;
import java.util.Comparator;

public class AscendDescend {
    public static void main(String[] args) {
        String[] ss = {"Bill","Mary","Lee","Agnus","Alfred","Thomas","Alvin","Bernard","Ezra","Herman"};
        System.out.println("original array = "+Arrays.toString(ss)+"\n");
        String[] cp = Arrays.copyOf(ss, ss.length);
        Arrays.sort(ss,Comparator.naturalOrder());
        Arrays.sort(cp, Comparator.reverseOrder());

        System.out.println("Ascend \t Descend\n");
        for (int i =0; i < ss.length; i++) {
            System.out.println(ss[i]+"\t"+cp[i]);
        }

    }
}
