package com.stankevichivan.collections;

public class Task2 {

    public static void main(String[] args) {

        int[] array = {2, 2, 2, 2, 2};
        var duplicate = getDuplicate(array);
        System.out.println(duplicate);
    }

    public static String getDuplicate(int[] array) {
        int number;
        int count;
        for (int i = 0; i < array.length; i++) {
            number = array[i];
            count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == number) {
                    count++;
                }
            }
            if (count > 1) {
                return String.format("Число %d повторяется %d раза", number, count);
            }
        }
        return "Дубликатов нет";
    }
}
