package com.Apnikaksha.BinaryNumberSystem;

public class SetBit {
    public static void main(String[] args) {
        int num = 5; // 0101
        int pos = 1;

        int bitMask = 1 << pos; // 0001<<1 -> 0010
        int newNumber = bitMask | num; // 0101 | 0010 -> 0111 so bit 1 is set 0 -> 1

        System.out.println(newNumber);
    }
}
