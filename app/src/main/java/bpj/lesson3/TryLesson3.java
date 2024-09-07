package bpj.lesson3;

import bpj.InputProcessor;

public class TryLesson3 implements InputProcessor {

    @Override
    public String processStringInputs(String[] a) {
        // throw new UnsupportedOperationException("Not supported yet.");
        String s="";

        if(a == null){
            s="No argument supplied";
            System.out.println(s);
        } else if (a.length > 1){
            s="we expect one argument";
            System.out.println(s);
        } else{
            switch (a[0]) {
                case "concatenation" -> {
                    String[] arr = new String[]{"hello", "good buddy"};
                    s = concatenation(arr);
                }
                case "length" -> {
                    s = tryLength("Donald Duck");
                }
                case "substring" -> {
                    s = partOfText("Sparky the Dog", 4, 12);
                }
                default -> throw new AssertionError();
            }
        }
        return s;
    }

    public String concatenation(String[] a){
        // return String.join("-", a)
        String conc="";
        for(String s: a){
            conc += s + "-";
        }
        conc = conc.substring(0, conc.length()-1);
        return conc;
    }

    public String tryLength(String input){
        return new StringBuffer().append("The given text :")
            .append(input).append(", is of ")
            .append(input.length()).append(" characters.").toString();
    }

    public String partOfText(String text, int begin, int end){
        return text.substring(begin, end);
    }
    
}
