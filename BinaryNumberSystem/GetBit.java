package com.Apnikaksha.BinaryNumberSystem;

public class GetBit {
    public static void main(String[] args) {
        int num = 5; // 0101
        int pos = 2;

        int bitMask = 1 << pos; // 0001<<2 -> 0100

        if ((bitMask & num) == 0) { // 0100 & 0101 -> 0100 non zero
            System.out.println("Bit was zero");
        } else {

            System.out.println("Bit was one"); // O/P is bit was one in this case
        }
    }

}
