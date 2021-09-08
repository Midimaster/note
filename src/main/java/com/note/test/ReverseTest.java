package com.note.test;

public class ReverseTest {

    public static void main(String[] args) {
        System.out.printf(reverseInParentheses("a(rab)a"));
    }

    /**
     * 反转括号内的字符串
     * @param inputString
     * @return
     */
    static String reverseInParentheses(String inputString) {
        StringBuilder str = new StringBuilder(inputString);
        int start, end;
        while (str.indexOf("(") != -1) {
            start = str.lastIndexOf("(");
            end = str.indexOf(")", start);
            str.replace(start, end + 1, new StringBuilder(str.substring(start + 1, end)).reverse().toString());
        }
        return str.toString();
    }

}
