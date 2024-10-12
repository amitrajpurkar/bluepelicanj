/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package bpj.lesson17;


public class Crypto {

    public Crypto() {
    }

    public String encrypt(String sentence) {
        String s1 = sentence.replaceAll("v|V", "ag',r");
        String s2 = s1.replaceAll("m|M", "ssad");
        String s3 = s2.replaceAll("g|G", "jeb..w");
        String s4 = s3.replaceAll("b|B", "dug>?/");

        return s4;
    }    

    public String decrypt(String sentence) {
        return sentence;
    }

}
