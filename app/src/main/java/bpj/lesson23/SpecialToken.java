package bpj.lesson23;

import java.util.StringTokenizer;

public class SpecialToken {
    private SpecialToken() { }

    public static String thirdToken(String wordsWithSpaces) {
        StringTokenizer st = new StringTokenizer(wordsWithSpaces);
        st.nextToken();// skip the first token  
        st.nextToken();// skip the second token
        return st.nextToken();// return the third token
    }
}
