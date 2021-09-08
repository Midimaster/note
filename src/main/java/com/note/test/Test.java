package com.note.test;

public class Test {

    public static void main(String[] args) {
        int[] a = {50, 60, 60, 45, 70};
        System.out.println(alternatingSums(a));
    }

    static int[] alternatingSums(int[] a) {
        int[] result = new int[2];
        for (int i = 0; i < a.length; i++) {
            result[i % 2] += a[i];
        }
        return result;
    }

    boolean palindromeRearranging(String inputString) {
        int map = 0;
        for(int i=0; i<inputString.length(); i++) {
            map ^= 1 << (inputString.charAt(i) - 'a');
        }
        return map == 0 || (map & -map) == map;
    }



}
