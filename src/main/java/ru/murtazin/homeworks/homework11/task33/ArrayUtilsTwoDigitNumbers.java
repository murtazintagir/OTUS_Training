package ru.murtazin.homeworks.homework11.task33;

import java.util.Arrays;
import java.util.Random;

/**
 * ДЗ (33)
 * Напишите метод, который получает в качестве параметра массив и
 * заполняет его положительными случайными двузначными числами.
 * Если в массиве уже присутствуют какие-либо значения - их необходимо удалить.
 */
public class ArrayUtilsTwoDigitNumbers {
    public static int[] fillArrayByTwoDigitNumbers(int[] inputArray) {
        Random random = new Random();
        int max = 100;
        int min = 10;
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = random.nextInt(max - min) + min;
        }
        return inputArray;
    }

    private ArrayUtilsTwoDigitNumbers() {

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(
                "При вводе массива длиной 5, метод должен вернуть массив случайных двузначных чисел - '"
                        + Arrays.toString(ArrayUtilsTwoDigitNumbers.fillArrayByTwoDigitNumbers(new int[5]))
                        + "'"
        );
        System.out.println(
                "При вводе массива длиной 5, метод должен вернуть массив случайных двузначных чисел - '"
                        + Arrays.toString(ArrayUtilsTwoDigitNumbers.fillArrayByTwoDigitNumbers(arr))
        +"'"
        );
    }
}
