package bpj.lesson28;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MaskingTelemetry {

    private static final String SWITCH_IS_ON = "1";
    private static final String full_path = "/Users/amitrajpurkar/workspace/bluepelicanj/app/src/main/resources/Switches.in";
    

    public static void main(String[] args) {
        System.out.println("Masking Telemetry problem\n");
        String line;
        int input;
        String zeroPaddedBinary;

        try (Scanner scr = new Scanner(new File(full_path))) {
            while (scr.hasNextLine()) {
                line = scr.nextLine();
                if (line.trim().isEmpty()) {
                    continue;
                }
                input = Integer.parseInt(line.trim());
                zeroPaddedBinary = leftPadZero(Integer.toBinaryString(input));
                System.out.println("Switch status for data value " + input + " (" + zeroPaddedBinary+") is: ");
                printSwitchsState(zeroPaddedBinary);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    private static String leftPadZero(String s) {
        while (s.length() < 8) {
            s = "0" + s;
        }
        return s;
    }

    private static void printSwitchsState(String s_8char) {
        
        char[] chars = s_8char.toCharArray();
        String[] charStrings = new String[chars.length];

        for (int i = 0; i < chars.length; i++) {
            charStrings[i] = String.valueOf(chars[i]);
        }
        System.out.println("chk -- "+Arrays.toString(charStrings));
        
        if(charStrings[7].equals(SWITCH_IS_ON)) System.out.println("Switch sw56 is ON");
        else System.out.println("Switch sw56 is OFF");
        
        if(charStrings[6].equals(SWITCH_IS_ON)) System.out.println("Switch sw57 is ON");
        else System.out.println("Switch sw57 is OFF");
        
        if(charStrings[5].equals(SWITCH_IS_ON)) System.out.println("Switch sw58 is ON");
        else System.out.println("Switch sw58 is OFF");
        
        if(charStrings[4].equals(SWITCH_IS_ON)) System.out.println("Switch sw59 is ON");
        else System.out.println("Switch sw59 is OFF");
        
        if(charStrings[3].equals(SWITCH_IS_ON)) System.out.println("Switch sw60 is ON");
        else System.out.println("Switch sw60 is OFF");
        
        if(charStrings[2].equals(SWITCH_IS_ON)) System.out.println("Switch sw61 is ON");
        else System.out.println("Switch sw61 is OFF");
        
        if(charStrings[1].equals(SWITCH_IS_ON)) System.out.println("Switch sw62 is ON");
        else System.out.println("Switch sw62 is OFF");
        
        if(charStrings[0].equals(SWITCH_IS_ON)) System.out.println("Switch sw63 is ON");
        else System.out.println("Switch sw63 is OFF");

    }

}
