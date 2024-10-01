package bpj.lesson14;

public class Sampler {

    public static void main(String[] args) {
        System.out.println("Hello World");

        exer21();
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
            sum_of_positions = Integer.parseInt(charFrmLong) + carry_over;
            if (shorterParam.length() - i - 1 >= 0) {
                charFrmShort = "" + shorterParam.charAt(shorterParam.length() - i - 1);
                sum_of_positions += Integer.parseInt(charFrmShort);
            }
            // divide by 2
            carry_over = sum_of_positions / 2;// carry over was added at start, new value for last
                                              // loop
            positional_value.append(Integer.toString(sum_of_positions % 2));// accumulate reminder
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
}
