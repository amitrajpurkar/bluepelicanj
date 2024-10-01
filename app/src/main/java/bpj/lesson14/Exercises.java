package bpj.lesson14;

import java.util.Map;
import static java.util.Map.entry;

public class Exercises {

    private static final Map<String, Integer> hexCodes = Map.ofEntries(entry("0", 0), entry("1", 1), entry("2", 2),
            entry("3", 3), entry("4", 4), entry("5", 5), entry("6", 6), entry("7", 7), entry("8", 8), entry("9", 9),
            entry("A", 10), entry("B", 11), entry("C", 12), entry("D", 13), entry("E", 14), entry("F", 15));

    private static final Map<String, Integer> octalCodes = Map.ofEntries(entry("0", 0), entry("1", 1), entry("2", 2),
            entry("3", 3), entry("4", 4), entry("5", 5), entry("6", 6), entry("7", 7));

    public static void main(String[] args) {
        System.out.println("Lesson 14: Binary, Hex, Octal");

        project_basically_speaking();

        hexToDecimal("3C4F");
        binaryToDecimal("100011");
        octalToDecimal("637");
        exer04();
        exer05();

        hexToDecimal("9A4E");
        binaryToDecimal("1011011");
        octalToDecimal("6437");
        exer09();
        exer10();

        exer11();
        exer12();
        exer13();
        exer14();
        exer15();

        exer16();
        exer17();
        exer18();
        exer19();
        exer20();

        exer21();
        exer22();
        exer23();
        exer25();

        
        exer24();
        exer26(); //using library methods
        exer27(); //using library methods
        exer28();
        exer29(); //using library methods
    }

    private static void project_basically_speaking() {
        int i = 0;
        System.out.println("Decimal \tBinary \t\tOctal \tHex \tCharacter");
        for (i = 65; i <= 90; i++) {
            System.out.println("" + i + "\t\t" + Integer.toBinaryString(i) + "\t\t" + Integer.toOctalString(i) + "\t"
                    + Integer.toHexString(i) + "\t" + (char) i);
        }
    }

    /**
     * convert hex to decimal
     * conversion makes use of a Map that gives code/values for hex characters
     * parse the given hex string; and loop from character in units place, go in reverse order
     * for each character pick the value from the Map and multiply by the power of 16 for that position
     * keep adding each positional value to the total
     * finally you get the decimal value
     * 
     * Java offers an alternate technique to convert hex to decimal; which you may use outside the class.
     */
    private static int hexToDecimal(String hexString) {
        int decimalValue = 0;
        String char_at_i;
        int position;
        int hex_char_value;
        for (int i = 0; i < hexString.length(); i++) {
            char_at_i = "" + hexString.charAt(hexString.length() - i - 1);
            position = i;
            hex_char_value = hexCodes.get(char_at_i);
            // System.out.println("char_at_i = " + char_at_i + " position = " + position + " hex_char_value = " + hex_char_value);
            hex_char_value = hex_char_value * (int) Math.pow(16, position);
            // System.out.println("positional_value = " + hex_char_value);
            decimalValue = decimalValue + hex_char_value;
        }
        System.out.println("Decimal value of " + hexString + " is " + decimalValue);
        System.out.println("to confirm, converting back it shows hex = " + Integer.toHexString(decimalValue));
        System.out.println("Shortcut method to convert hex to decimal shows value = " + Integer.parseInt(hexString, 16));
        return decimalValue;
    }

    /**
     * convert octal to decimal
     * conversion makes use of a Map that gives code/values for octal characters
     * parse the given octal string; and loop from character in units place, go in reverse order
     * for each character pick the value from the Map and multiply by the power of 8 for that position
     * keep adding each positional value to the total
     * to understand the accumulation process, uncomment print statements
     * finally you get the decimal value
     * 
     * Java also provides alternate technique to convert octal to decimal; which you may use outside the class.
     */
    private static int octalToDecimal(String octalString) {
        int decimalValue = 0;
        String char_at_i;
        int position;
        int octal_char_value;
        for (int i = 0; i < octalString.length(); i++) {
            char_at_i = "" + octalString.charAt(octalString.length() - i - 1);
            position = i;
            octal_char_value = octalCodes.get(char_at_i);
            // System.out.println("char_at_i = " + char_at_i + " position = " + position + " binary_char_value = " + octal_char_value);
            octal_char_value = octal_char_value * (int) Math.pow(8, position);
            // System.out.println("positional_value = " + octal_char_value);
            decimalValue = decimalValue + octal_char_value;
        }
        System.out.println("Decimal value of " + octalString + " is " + decimalValue);
        System.out.println("to confirm, converting back it shows octal = " + Integer.toOctalString(decimalValue));
        System.out.println("Shortcut method convert octal to decimal shows value = " + Integer.parseInt(octalString, 8));
        return decimalValue;
    }

    private static int binaryToDecimal(String binaryString) {
        int decimalValue = 0;
        String char_at_i;
        int position;
        int binary_char_value = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            char_at_i = "" + binaryString.charAt(binaryString.length() - i - 1);
            position = i;
            binary_char_value = Integer.parseInt(char_at_i);
            // System.out.println("char_at_i = " + char_at_i + " position = " + position + " binary_char_value = " + binary_char_value);
            binary_char_value = binary_char_value * (int) Math.pow(2, position);
            // System.out.println("positional_value = " + binary_char_value);
            decimalValue = decimalValue + binary_char_value;
        }
        System.out.println("Decimal value of " + binaryString + " is " + decimalValue);
        System.out.println("to confirm, converting back it shows binary = " + Integer.toBinaryString(decimalValue));
        return decimalValue;
    }

    private static void exer04() {
        System.out.println("Exercise 4: ");
        // int i = 04923; //digit 9 is not part of Octal number 0-7
        int i = 04723; // this is allowed
        // long i = 04723; //alternate if int is out of range
        System.out.println("original statement was not legal 'int i = 04923;'; the Octal-number can be "
                + Integer.toOctalString(i) + "; in the orginal number digit 9 was supplied, Octal allows 0-7");
    }

    private static void exer05() {
        System.out.println("Exercise 5: ");
        int i = 0xAAFF;
        System.out.println("the given statement is legal 'int i = 0xAAFF;'");
        System.out.println("the hex value is " + Integer.toHexString(i));
        System.out.println("the decimal value of that hex number is " + i);
    }

    private static void exer09() {
        int i = hexToDecimal("5C3B");
        System.out.println("the hex value is " + Integer.toHexString(i));
        System.out.println("the decimal value of that hex number is " + i);
    }

    private static void exer10() {
        int i = octalToDecimal("3365");
        System.out.println("the octal value is " + Integer.toOctalString(i));
        System.out.println("the decimal value of that octal number is " + i);
    }

    private static void exer11() {
        int i = 478;
        System.out.println("given int value is " + i);
        System.out.println("binary value of that int is " + Integer.toBinaryString(i));
    }

    private static void exer12() {
        int i = 5678;
        System.out.println("given int value is " + i);
        System.out.println("hex value of that int is " + Integer.toHexString(i));
    }

    private static void exer13() {
        int i = 5678;
        System.out.println("given int value is " + i);
        System.out.println("octal value of that int is " + Integer.toOctalString(i));
    }

    /**
     * multiply two hex numbers and give answer in hex
     */
    private static void exer14() {
        // shortcut method
        int i = 0x2C6;// this converts hex to decimal
        int j = 0x3F;// this converts hex to decimal
        int result = i * j;
        String s = Integer.toHexString(result);
        System.out.println("hex product for: 2C6 x 3F is " + s);

        // show the algorithm
        int k = hexToDecimal("2C6");
        int l = hexToDecimal("3F");
        int m = k * l;
        String n = Integer.toHexString(m);
        System.out.println("hex product for: 2C6 x 3F is " + n);

    }

    /**
     * add two octal numbers
     */
    private static String add_two_octal(String oct1, String oct2) {
        String longerOct;
        String shorterOct;
        String charFrmLong;
        String charFrmShort;
        int carry_over = 0;
        StringBuffer positional_value = new StringBuffer();
        int sum_of_positions;

        if (oct1.length() > oct2.length()) {
            longerOct = oct1;
            shorterOct = oct2;
        } else {
            longerOct = oct2;
            shorterOct = oct1;
        }
        for (int i = 0; i < longerOct.length(); i++) {
            charFrmLong = "" + longerOct.charAt(longerOct.length() - i - 1);
            sum_of_positions = Integer.parseInt(charFrmLong) + carry_over;//carryover is added here
            if (shorterOct.length() - i - 1 >= 0) {
                charFrmShort = "" + shorterOct.charAt(shorterOct.length() - i - 1);
                sum_of_positions += Integer.parseInt(charFrmShort);
            }
            // divide by 8
            carry_over = sum_of_positions / 8;// new carryover calculated
            positional_value.append(Integer.toString(sum_of_positions % 8));// accumulate remainder
            System.out.println(positional_value);
        }
        // if final carryover is non-zero accumulate it
        if (carry_over > 0) {
            positional_value.append(Integer.toString(carry_over));
        }
        positional_value = positional_value.reverse();
        System.out.println();
        System.out.println("octal number by algorithm: " + oct1 + " + " + oct2 + " = " + positional_value);

        // alternative method
        int i = Integer.parseInt(oct1, 8) + Integer.parseInt(oct2, 8);
        System.out.println("octal number using library: " + oct1 + " + " + oct2 + " = " + Integer.toOctalString(i));

        return positional_value.toString();
    }

    /**
     * add two octal numbers
     */
    private static void exer15() {
        String oct1 = "3456";
        String oct2 = "745";

        String octal_sum = add_two_octal(oct1, oct2);
        System.out.println("octal sum: " + oct1 + " + " + oct2 + " = " + octal_sum);
    }

    private static void exer16() {
        int i = hexToDecimal("A");
        System.out.println("the int value hex-A is " + i);
    }

    private static void exer17() {
        int i = hexToDecimal("8");
        System.out.println("the int value hex-8 is " + i);
    }

    private static void exer18() {
        System.out.println("the base of hex system is 16");
    }

    private static void exer19() {
        int i = 16;
        System.out.println("given int value is " + i);
        System.out.println("hex value of that int is " + Integer.toHexString(i));
    }

    private static void exer20() {
        System.out.println("the base of binary system is 2");
    }

    /**
     * add two binary numbers
     */
    private static String addBinaryNums(String one, String two) {
        // using algorithm
        String longerParam;
        String shorterParam;
        String charFrmLong;
        String charFrmShort;
        int carry_over = 0;
        StringBuffer positional_value = new StringBuffer();
        int sum_of_positions;

        if (one.length() > two.length()) {
            longerParam = one;
            shorterParam = two;
        } else {
            longerParam = two;
            shorterParam = one;
        }
        for (int i = 0; i < longerParam.length(); i++) {
            charFrmLong = "" + longerParam.charAt(longerParam.length() - i - 1);
            sum_of_positions = Integer.parseInt(charFrmLong) + carry_over;//carryover is added here
            if (shorterParam.length() - i - 1 >= 0) {
                charFrmShort = "" + shorterParam.charAt(shorterParam.length() - i - 1);
                sum_of_positions += Integer.parseInt(charFrmShort);
            }
            // divide by 2
            carry_over = sum_of_positions / 2;// new carryover calculated
            positional_value.append(Integer.toString(sum_of_positions % 2));// accumulate remainder
            System.out.println(positional_value);
        }
        // if final carryover is non-zero accumulate it
        if (carry_over > 0) {
            positional_value.append(Integer.toString(carry_over));
        }
        positional_value = positional_value.reverse();
        System.out.println();
        System.out.println("binary number by algorithm: " + one + " + " + two + " = " + positional_value);

        // shortcut method
        int i1 = Integer.parseInt(one, 2);
        int i2 = Integer.parseInt(two, 2);
        int sum = i1 + i2;
        String addedBinary = Integer.toBinaryString(sum);
        System.out.println("binary number using library: " + one + " + " + two + " = " + addedBinary);

        if (positional_value.toString().equalsIgnoreCase(addedBinary)) {
            System.out.println("value from algorithm and shortcut method are same");
        } else {
            System.out.println("value from algorithm and shortcut method are not same");
        }

        return positional_value.toString();
    }

    private static void exer21() {
        String s = addBinaryNums("1111000", "1001110");
        System.out.println("binary 1111000 + 1001110 = " + s);
    }

    private static void exer22() {
        String s = addBinaryNums("1000001", "1100001");
        System.out.println("binary 1000001 + 1100001 = " + s);
    }

    private static void exer23() {
        int i = Integer.parseInt("10", 2);
        System.out.println(" binary 10 type = " + i + " in decimal");
        System.out.println(
                "which means there are only TWO TYPE of people in the world... those who understand binary, and those who don't.");
    }

    /**
     * Suppose you have a String s that represents a number that you know is expressed in a base given by int b.
     * Write code that will convert this into an equivalent decimal based integer and store the result in int i.
     */
    private static void exer24() {
        String s = "10";//string representing number
        int b = 2;// base of the number
        int i = Integer.parseInt(s, b);
        System.out.println("a number s = " + s + " in base " + b + " = " + i + " in decimal");
    }

    private static void exer25() {
        String base33Num = "9322gf";
        int i = Integer.parseInt(base33Num, 33);
        System.out.println("base33Num = " + base33Num + " in decimal = " + i);
        String s = Integer.toString(i, 28);
        System.out.println("decimal = " + i + " in base28 = " + s);
    }

    /**
     * add two hex numbers
     */
    private static String add_two_hex(String one, String two) {
        // shortcut method
        int i1 = Integer.parseInt(one, 16);
        int i2 = Integer.parseInt(two, 16);
        int sum = i1 + i2;
        String sum_of_num = Integer.toHexString(sum);
        System.out.println("binary number using library: " + one + " + " + two + " = " + sum_of_num);

        return sum_of_num;
    }

    private static void exer26() {
        String hex1 = "3FA6";
        String hex2 = "E83A";
        String hex_sum = add_two_hex(hex1, hex2);
        System.out.println("hex sum: " + hex1 + " + " + hex2 + " = " + hex_sum);
    }

    private static void exer27() {
        String oct1 = "7267";
        String oct2 = "4645";
        int i1 = Integer.parseInt(oct1, 8);
        int i2 = Integer.parseInt(oct2, 8);
        int product = i1 * i2;
        String oct_product = Integer.toOctalString(product);
        System.out.println("octal product: " + oct1 + " + " + oct2 + " = " + oct_product);
    }

    private static void exer28() {
        String oct1 = "2376";
        String oct2 = "567";

        String octal_sum = add_two_octal(oct1, oct2);
        System.out.println("octal sum: " + oct1 + " + " + oct2 + " = " + octal_sum);
    }

    private static void exer29() {
        String hex1 = "3E";
        String hex2 = "5B";
        int i1 = Integer.parseInt(hex1, 16);
        int i2 = Integer.parseInt(hex2, 16);
        int prod_of_hex = i1 * i2;
        String hex_product = Integer.toHexString(prod_of_hex);
        System.out.println("hex sum: " + hex1 + " + " + hex2 + " = " + hex_product);
    }

}
