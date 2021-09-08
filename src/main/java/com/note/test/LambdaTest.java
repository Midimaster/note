package com.note.test;

public class LambdaTest {

    public static void main(String[] args) {
        MathOperation addition = (int a, int b) -> a + b;
//        String a = () -> 5;
//        String a = () -> 5;
    }

    void test(int a){
        System.out.println(a);
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
