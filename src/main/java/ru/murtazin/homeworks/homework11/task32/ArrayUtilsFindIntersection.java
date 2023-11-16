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
        int[] interArr = new int[rightArray.length];
        int num = 0;
        for (int i = 0; i < rightArray.length; i++) {
            for (int j = 0; j < leftArray.length; j++) {
                if (rightArray[i] == leftArray[j]) {
                    interArr[num] = rightArray[i];
                    num++;
                }
            }
        }
        int[] result = new int[num];
        System.arraycopy(interArr, 0, result, 0, num);
        System.out.println(Arrays.toString(interArr));
        return result;
    }

    private ArrayUtilsFindIntersection() {

    }

    public static void main(String[] args) {
        System.out.println(
                "При вводе массивов [1,4,7,3,8] и [9,12,7,4] метод должен вернуть массив [4,7] - '"
                        + Arrays.toString(ArrayUtilsFindIntersection.findIntersection(new int[]{1, 4, 7, 3, 8}, new int[]{9, 12, 7, 4}))
                        + "'"
        );
        System.out.println(
                "При вводе массивов [1,4,7,3,8] и [9,12,7,4] метод должен вернуть массив [4,7] - '"
                        + Arrays.toString(ArrayUtilsFindIntersection.findIntersection(new int[]{1, 5, 1, 3, 8}, new int[]{9, 12, 7, 4}))
                        + "'"
        );
    }
}
