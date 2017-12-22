package com.metod.ws.test;

public class ExceptionTest {
    public static void main(final String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();

        long delta = System.currentTimeMillis();
        for (int i = 0; i < 200_000; i++) {
            exceptionTest.myMethod(i);
        }
        System.out.println("Delta 1 : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int i = 0; i < 200_000; i++) {

            try {
                exceptionTest.myMethod2(i);
            } catch (Exception e) {
            }
        }
        System.out.println("Delta 2 : " + (System.currentTimeMillis() - delta));

    }

    public int myMethod(final int a) {
        return a + 100;
    }

    public int myMethod2(final int a) throws Exception {
        if (a > 0) {
            throw new Exception();
        }
        return a + 100;
    }

}
