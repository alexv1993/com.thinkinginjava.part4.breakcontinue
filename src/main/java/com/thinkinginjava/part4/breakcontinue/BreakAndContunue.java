package com.thinkinginjava.part4.breakcontinue;

/**
 * Created by Alex on 30.09.2018.
 */
public class BreakAndContunue {
    public static void main(String[] args) {
        doSmth(74);
    }

    public static void doSmth(int val) {

        for (int i = 0; i < 100; i++) {
            if (i == val) {
                break;
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
            if (i == val) break;
            if (i % 9 != 0) continue;
            System.out.println(i + " ");
        }

        System.out.println();
        int i = 0;
        while (true) {
            i++;
            int j = i * 27;
            if (j == 1269) break;
            if (i % 10 != 0) continue;
            System.out.println(i + " ");
        }


    }
}
