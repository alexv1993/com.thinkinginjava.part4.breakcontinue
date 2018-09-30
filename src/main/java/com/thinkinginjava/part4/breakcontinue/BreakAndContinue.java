package com.thinkinginjava.part4.breakcontinue;

/**
 * Created by Alex on 30.09.2018.
 */
public class BreakAndContinue {
    public static void main(String[] args) {
        BreakAndContunue.doSmth(99);
        BreakAndContinue.doSmth(74);
        BreakAndContinue.doSmth(99);
    }

    public static void doSmth(int val) {

        for (int i = 0; i < 100; i++) {
            if (i == val) {
                return;
            }
            if (i % 9 != 0) continue;
            System.out.println(i + " ");
        }
        System.out.println();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i : arr) {
            if (i == val) return;
            if (i % 9 != 0) continue;
            System.out.println(i + " ");
        }

        System.out.println();
        int i = 0;
        while (true) {
            i++;
            int j = i * 27;
            if (j == 1269) return;
            if (i % 10 != 0) continue;
            System.out.println(i + " ");
        }
    }

}
