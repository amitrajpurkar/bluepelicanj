package bpj.lesson8;

import bpj.InputProcessor;

public class TryLesson8 implements InputProcessor {

    private int z=23, x=-109;
    private double c=2345.19, v=157.03;
    private boolean a=false, s=true;
    private String str;

    @Override
    public String processStringInputs(String[] a) {
        if(a == null){
            str="No argument supplied";
            System.out.println(s);
        } else if (a.length > 1){
            str="we expect one argument";
            System.out.println(s);
        } else{
            switch (a[0]) {
                case "ex1" -> ex1();
                case "ex2" -> ex2();
                default -> throw new AssertionError();
            }
            str="boolean operations done";
        }
        return str;
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    // TODO: implement the rest of the methods
    private void ex1() {
        boolean gus = (x>0) && (c==v);
        System.out.println(gus);
    }

    private void ex2() {
        System.out.println(a||s);
    }
}