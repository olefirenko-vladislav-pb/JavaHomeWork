package com.pb.olefirenko.hw3;

import java.util.Arrays;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int[] array = new int[10];


        for (int i = 0; i < array.length; i++) {

            System.out.println("Введите число № " + (i + 1) + ":");


            array[i] = scan.nextInt();
            ;
        }
        System.out.println("Ваш массив: " + Arrays.toString(array));

        {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            System.out.println("Cумма введённых чисел : = " + sum);

            int pos = 0;
            int neg = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    neg++;
                } else {
                    pos++;
                }
            }
            System.out.println("отрицательных: " + neg + ", положительных: " + pos);

            boolean isSorted = false;
            int buf;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        isSorted = false;

                        buf = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = buf;
                    }
                }

            }
            System.out.println("Отсортированный массив : " + Arrays.toString(array));
        }
    }
}
