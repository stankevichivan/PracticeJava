package com.stankevichivan.collections;

public class Task1 {
    public static void main(String[] args) {
    }

    public static int[] getResult(int[] array, int number) {
        int[] result = new int[array.length];
        int count;

        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            if (a == number) {
                count = 1;
                result = new int[count];
                result[0] = i;
                break;
            }
            for (int j = i + 1; j < array.length; j++) {
                int b = array[j];
                if (b == number) {
                    count = 1;
                    result = new int[count];
                    result[0] = j;
                    break;
                }
                if (a + b == number) {
                    count = 2;
                    result = new int[count];
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
}