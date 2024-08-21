package com.Apnikaksha.BinaryNumberSystem;

public class TogglingABit {
    public static void main(String[] args) {
        int num = 5; // 0101
        int pos = 1;

        int bitMask = 1 << pos;
        int newNumber = num ^ bitMask;

        System.out.println(newNumber);
    }

}
