package com.Apnikaksha.BinaryNumberSystem;

public class BinaryToDecimal {
    // Method to return decimal (after coverting binary to decimal)
    public int binaryToDecimal(int binary) {
        int decimal = 0;
        int power = 0;

        while (binary > 0) {
            int rem = binary % 10;
            decimal = (int) (decimal + (rem * (Math.pow(2, power))));
            binary = binary / 10;
            power++;
        }

        return decimal;
    }

    public static void main(String[] args) {
        BinaryToDecimal btd = new BinaryToDecimal();

        System.out.println(btd.binaryToDecimal(0));
        System.out.println(btd.binaryToDecimal(111));
        System.out.println(btd.binaryToDecimal(10101));

    }

}
