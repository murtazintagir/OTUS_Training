package ru.murtazin.homeworks.homework11.task32;

import java.util.Arrays;

/**
 * ДЗ (32)
 * Даны два массива с целочисленными элементами.
 * Напишите метод, который возвращает массив со смежными элементами (их пересечение).
 * Если пересечений нет, метод должен вернуть пустой массив.
 */
public class ArrayUtilsFindIntersection {
    public static int[] findIntersection(int[] rightArray, int[] leftArray) {
        for (int i = 0; i < rightArray.length; i++) {
            for (int j = 0; j < leftArray.length; j++) {
                if (rightArray[i] == leftArray[j]) {
                    System.out.println(rightArray[i]);
                }
            }
        }
        return new int[0];
    }

    private ArrayUtilsFindIntersection() {

    }

    public static void main(String[] args) {
        System.out.println(
                "При вводе массивов [1,4,7,3,8] и [9,12,7,4] метод должен вернуть массив [4,7] - '"
                        + Arrays.toString(ArrayUtilsFindIntersection.findIntersection(new int[]{1, 4, 7, 3, 8}, new int[]{9, 12, 7, 4}))
                        + "'"
        );
    }
}
