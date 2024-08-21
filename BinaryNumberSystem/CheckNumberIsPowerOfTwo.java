package com.Apnikaksha.BinaryNumberSystem;

import java.util.*;

public class CheckNumberIsPowerOfTwo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number: ");
            int num1 = sc.nextInt();

            int num2 = num1 - 1;

            if (num1 == 0 || num1 == 1) {
                System.out.println("number " + num1 + " is not power of  2");
            }

            else if ((num1 & num2) == 0) {
                System.out.println("number " + num1 + " is power of  2");
            } else {
                System.out.println("number " + num1 + " is not power of  2");
            }
        }
    }
}
