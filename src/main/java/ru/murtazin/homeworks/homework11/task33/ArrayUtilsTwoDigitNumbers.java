package ru.murtazin.homeworks.homework11.task33;

import java.util.Arrays;

/**
 * ДЗ (33)
 * Напишите метод, который получает в качестве параметра массив и
 * заполняет его положительными случайными двузначными числами.
 * Если в массиве уже присутствуют какие-либо значения - их необходимо удалить.
 */
public class ArrayUtilsTwoDigitNumbers {
    public static int[] fillArrayByTwoDigitNumbers(int[] inputArray) {
// TODO
        return new int[0];
    }

    private ArrayUtilsTwoDigitNumbers() {

    }

    public static void main(String[] args) {
        System.out.println(
                "При вводе массива длиной 5, метод должен вернуть массив случайных двузначных чисел - '"
                        + Arrays.toString(ArrayUtilsTwoDigitNumbers.fillArrayByTwoDigitNumbers(new int[5]))
                        + "'"
        );
    }
}
