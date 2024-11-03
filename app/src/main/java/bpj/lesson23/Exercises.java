package bpj.lesson23;

import java.util.StringTokenizer;

public class Exercises {
    
    public static void main(String[] args) {
        System.out.println("Lesson 23: String Tokenizer");

        exer01();
        exer02();
        exer03();
        exer04();
        exer05();
        exer06();
        exer07();
        exer08();
        exer09();
        exer10();
        exer11();
        exer12();
        exer13();
        exer14();
    }

    private static void exer01() {
        System.out.println("exer01");
        StringTokenizer st = new StringTokenizer("Hello + World! + zulu", "+");
        System.out.println("number of tokens with few + signs = "+st.countTokens());

        st = new StringTokenizer("zulu", "+");
        System.out.println("number of tokens for just zulu = "+st.countTokens());

        System.out.println("--------------------");
    }

    private static void exer02() {
        System.out.println("exer02");
        System.out.println("Q: what are the things called that separate the words within a String that is to be tokenized?");
        System.out.println("Ans: the delimiter");
        System.out.println("--------------------");
    }

    private static void exer03() {
        System.out.println("exer03");
        System.out.println("Q: what are the individual parts or words called in a String that is to be tokenized?");
        System.out.println("Ans: the tokens");
        System.out.println("--------------------");
    }

    private static void exer04() {
        System.out.println("exer04");
        System.out.println("Q: what is the import we need in order to get the StringTokenizer class to work?");
        System.out.println("Ans: import java.util.StringTokenizer;");
        System.out.println("--------------------");
    }

    private static void exer05() {
        System.out.println("exer05");
        StringTokenizer t = new StringTokenizer("Hello there good buddy");
        String m = t.nextToken();
        System.out.println(m + ">>>" + t.countTokens() + " tokens left.");
        System.out.println("--------------------");
    }

    private static void exer06() {
        System.out.println("exer06");
        System.out.println("Q: rewrite the followign if statement to use countToken() in stead of hasMoreTokens()");
        System.out.println("if(st.hasMoreTokens())");
        System.out.println("Ans: if(st.countTokens() > 0)");
        System.out.println("--------------------");
    }

    private static void exer07() {
        System.out.println("exer07");
        StringTokenizer g = new StringTokenizer("Rumplestillskin", "me");
        System.out.println(g.nextToken());
        System.out.println(g.nextToken("s"));
        System.out.println("--------------------");
    }

    private static void exer08() {
        System.out.println("exer08");
        String testString = "Joy to the world!";
        String checkToken = SpecialToken.thirdToken(testString);
        System.out.println("given the string: "+testString+"; the third token is "+checkToken);
        System.out.println("--------------------");
    }

    private static void exer09() {
        System.out.println("exer09");
        System.out.println("Q: which constructor of StringTokenizer class would be simplest to use if you wanted spaces and tabs as delimiters?");
        System.out.println("Ans: public StringTokenizer(String str)");
        StringTokenizer st1 = new StringTokenizer("Hello one    two three");
        System.out.println("number of tokens = "+st1.countTokens());

        System.out.println("--------------------");
    }

    private static StringTokenizer gt = new StringTokenizer("Humpty Dumpty", " pu\n\t");

    private static void exer10() {
        System.out.println("exer10");
        System.out.println("count tokens for gt = "+gt.countTokens());
        System.out.println("--------------------");
    }

    private static void exer11() {
        System.out.println("exer11");
        String radString = gt.nextToken();
        System.out.println(gt.nextToken() + radString);
        System.out.println("--------------------");
    }

    private static void exer12() {
        System.out.println("exer12");
        System.out.println("count tokens for gt again = "+gt.countTokens());
        System.out.println("--------------------");
    }

    private static void exer13() {
        System.out.println("exer13");
        System.out.println("Q: replace ??? in while loop");
        System.out.println("Ans: while(gt.hasMoreTokens()");

        while (gt.hasMoreTokens()) {
            System.out.println(gt.nextToken());
        }

        System.out.println("--------------------");
    }

    private static void exer14() {
        System.out.println("exer14");
        StringTokenizer tux = new StringTokenizer("Ignoramus");
        System.out.println("count tokens for tux = "+tux.countTokens());
        System.out.println("next token = "+tux.nextToken());//this is the only token
        System.out.println("next token = "+tux.nextToken());// throws exception

        System.out.println("--------------------");
    }
}
