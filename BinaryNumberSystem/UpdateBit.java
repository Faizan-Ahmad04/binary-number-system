package com.Apnikaksha.BinaryNumberSystem;

import java.util.*;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entert  updation operation either 1 or 0 : ");
        int oper = sc.nextInt();
        // oper = 1 -> Set : oper = 0 -> clear

        int num = 5; // 0101
        int pos = 1;

        int bitMask = 1 << pos; // 0001<<1 -> 0010

        if (oper == 1) {
            int newNumber = bitMask | num;
            System.out.println(newNumber);
        } else {
            int newBitMask = ~bitMask; // ~ 0010 -> 1101

            int newNumber = num & newBitMask; // 1101 & 0101 -> 010
            System.out.println(newNumber);
        }

    }
}
