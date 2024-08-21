package com.Apnikaksha.BinaryNumberSystem;

import java.util.*;

public class ShiftOperator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt();

        System.out.println("Enter number num shifat by: ");
        int pos = sc.nextInt();

        // Left shift number num by given position num<<position
        int leftResult = num << pos;
        System.out.println("Left shift " + num + " by " + pos + ": " + leftResult);

        // Right Shift number by given position num>>position
        int rightResult = num >> pos;
        System.out.println("Right shift " + num + " by " + pos + ": " + rightResult);

    }
}
