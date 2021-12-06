package com.ld.test.dataStruct;

public class Test {
    public static void main(String[] args) {
        Boolean bol1 = true;
        boolean bol2 = true;
        Test.test1(bol1, bol2);
        System.out.println(bol1 + " " +bol2);
    }
    private static void test1(Boolean bol1, boolean bol2) {
        bol1 = false;
        bol2 = false;
    }
}
