package com.Apnikaksha.BinaryNumberSystem;

public class ClearBit {
    public static void main(String[] args) {
        int num = 5; // 0101
        int pos = 2;

        int bitMask = 1 << pos;
        int newBitMask = ~bitMask;

        int newNumber = num & newBitMask;
        System.out.println(newNumber);

    }

}
