package bpj.lesson1;

import bpj.InputProcessor;

/**
 *
 * @author amitrajpurkar
 * @apiNote intention is to have a service class having utility methods that show-case concepts in
 *          Lesson 1
 *
 */
public class Lesson1 implements InputProcessor {

    @Override
    public String processStringInputs(String[] a) {
        // TODO Auto-generated method stub
        String s = "";

        if (a == null) {
            s = "Hello Work!";
        } else if (a.length == 1 && a[0].toLowerCase().contentEquals("multiline string")) {
            s = """
                    From: Bill Smith
                    Address: Dell Computer, Bldg 13
                    Date: April 12, 2005

                    To: Jack Jones

                    Message: Help! I'm trapped inside a computer!
                    """;
        } else if (a.length > 1) {
            s = String.join("-", a);
        }

        return s;
    }

}
