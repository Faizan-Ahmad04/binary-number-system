package com.Apnikaksha.BinaryNumberSystem;

import java.util.*;

public class DecimalToBinaryUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt();

        // declare an array for storing binary digits
        int binary[] = new int[40];

        int i = 0;
        while (num > 0) {
            binary[i] = num % 2;
            num = num / 2;
            i++;
        }

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binary[j]);
        }

    }
}
