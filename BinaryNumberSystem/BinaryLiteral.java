//Binary number system Introduction
package com.Apnikaksha.BinaryNumberSystem;

public class BinaryLiteral {
    public static void main(String[] args) {

        // Addd prefix 0b or 0B to the integral values

        // Binary literal in byte
        byte b = 0b101;

        // Binary literakl in integer
        int i = 0b101;

        // Binary literal in short
        short s = 0b101;

        System.out.println("Binary literal in byte " + b);
        System.out.println("Binary literal in integer " + i);
        System.out.println("Binary literal in short " + s);

        // for negative values use (-0b)
        int binary = -0b101;
        System.out.println(binary);
    }

}
