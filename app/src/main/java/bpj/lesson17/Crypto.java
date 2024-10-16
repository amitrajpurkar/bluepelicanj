/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package bpj.lesson17;


public class Crypto {

    public Crypto() {
    }

    /**
     * encrypt method will accept a String that represents a sentence to be encrypted.
     * it will return a String that is a sentence with
     * all v's (big or small) replaced with ag',r
     * all m's replaced with ssad
     * all g's replaced with jeb..w
     * all b's replaced with dug>?/
     * 
     * @param sentence
     * @return
     */
    public String encrypt(String sentence) {
        StringBuilder encrypted = new StringBuilder();
        for(char c: sentence.toCharArray()) {
            Character.toLowerCase(c);
            switch (Character.toLowerCase(c)) {
                case 'v' -> encrypted.append("ag',r");
                case 'm' -> encrypted.append("ssad");
                case 'g' -> encrypted.append("jeb..w");
                case 'b' -> encrypted.append("dug>?/");
                default -> encrypted.append(c);
            }
        }

        return encrypted.toString();
    }    

    public String decrypt(String sentence) {

        // Matcher m = Pattern.compile("ag',r|ssad|jeb..w|dug>?/").matcher(sentence);

        // while(m.find()) {
        //     sentence = sentence.replace(m.group(), m.group().charAt(0) == 'v' ? "v" : m.group().charAt(0) == 'm' ? "m" : m.group().charAt(0) == 'g' ? "g" : "b");
        // }
        String s1 = sentence.replaceAll("dug\\>\\?\\/", "b");
        String s2 = s1.replaceAll("jeb..w", "g");
        String s3 = s2.replaceAll("ssad", "m");
        String s4 = s3.replaceAll("ag',r", "v");

        return s4;
    }

}
