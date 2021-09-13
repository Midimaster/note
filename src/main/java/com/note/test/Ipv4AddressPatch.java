package com.note.test;

import org.apache.commons.lang3.StringUtils;

public class Ipv4AddressPatch {

    public static void main(String[] args) {
//
//        System.out.print(isIPv4Address("64.233.161.00"));
        int[] a = {5, 3, 6, 7, 9};
        System.out.println(avoidObstacles(a));
    }


    static boolean isIPv4Address(String inputString) {
        return inputString.matches("(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|1[0-9][0-9]?|0[1-9][0-9]?|00[1-9]|0[1-9])");
    }

    static int avoidObstacles(int[] inputArray) {
        int jump = 1;
        boolean fail = true;
        while (fail) {
            jump++;
            fail = false;
            for (int i = 0; i < inputArray.length; i++) {
                if (inputArray[i] % jump == 0) {
                    fail = true;
                    break;
                }
            }
        }
        return jump;
    }


}
