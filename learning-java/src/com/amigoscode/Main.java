package com.amigoscode;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        primitiveDataTypes();
    }

    public static void primitiveDataTypes() {
        /*
            NUMBERS
         */
        // -128 to 127 - 1 byte
        byte aByte = 127;

        // -32,768 to 32,767 - 2 bytes
        short aShort = 32_767;

        // -2,147,483,648 to 2,147,483,647 - 4 bytes
        int anInt = 2_147_483_647;

        // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long aLong = 9_223_372_036_854_775_807L;

        // 4 bytes
        float aFloat = 1.1232F;

        // 8 bytes
        double aDouble = 1.2222222222222222222222;

        /*
            TEXT
         */
        // 2 bytes
        char aChar = 'A';

        /*
            OTHER
         */
        // 2 bytes
        boolean aBoolean = true; // false

        System.out.println("----------PRIMITIVE DATA TYPES-----------------");
        System.out.println("----------Numbers-----------------");
        System.out.println("byte: " + aByte);
        System.out.println("short: " + aShort);
        System.out.println("int: " + anInt);
        System.out.println("long: " + aLong);
        System.out.println("float: " + aFloat);
        System.out.println("double: " + aDouble);
        System.out.println();

        System.out.println("----------Text-----------------");
        System.out.println("char: " + aChar);
        System.out.println();

        System.out.println("----------Others-----------------");
        System.out.println("boolean: " + aBoolean);
        System.out.println();
    }
}