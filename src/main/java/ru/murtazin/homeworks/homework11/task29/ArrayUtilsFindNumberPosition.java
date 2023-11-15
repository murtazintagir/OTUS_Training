package ru.murtazin.homeworks.homework11.task29;

import java.util.Arrays;

/**
 * ДЗ (29)
 * Напишите метод, который получает в качестве параметров двумерный массив целых чисел и целое число.
 * Метод возвращает массив из двух элементов - номера строки и колонки, по которым располагается переданное число.
 * Если число не обнаружено - вывести пустой массив. Если таких чисел несколько вывести последнее.
 */
public class ArrayUtilsFindNumberPosition {

    public static int[] findNumberPosition(int[][] input, int number) {
        int[] arr = new int[2];
        boolean find = false;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j] == number) {
                    find = true;
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        if (find) {
            return arr;
        } else {
            return new int[0];
        }
    }

    private ArrayUtilsFindNumberPosition() {

    }

    public static void main(String[] args) {
        int[][] input = new int[][]{{5, 7, 3, 17}, {7, 0, 1, 12}};
        System.out.println(
                "При вводе массива [[5, 7, 3, 17], [7, 0, 1, 12]] и числа 7, метод должен вернуть массив [1, 0] - '"
                        + Arrays.toString(ArrayUtilsFindNumberPosition.findNumberPosition(input, 7))
                        + "'"
        );
        System.out.println(
                "При вводе массива [[5, 7, 3, 17], [7, 0, 1, 12]] и числа 7, метод должен вернуть массив [1, 0] - '"
                        + Arrays.toString(ArrayUtilsFindNumberPosition.findNumberPosition(input, 10))
                        + "'"
        );
    }
}
