package ru.murtazin.homeworks.homework11.task30;

import java.util.Arrays;

/**
 * ДЗ (30)
 * Реализуйте метод, который принимает массив целых чисел и одно целое число.
 * А возвращает массив, в котором удалены все вхождения переданного числа.
 */
public class ArrayUtilsRemoveElement {
    public static int[] removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        // Create a copy of arr[]
        return Arrays.copyOf(nums, index);
    }

    private ArrayUtilsRemoveElement() {

    }

    public static void main(String[] args) {
        System.out.println(
                "При вводе массива [1, 1, 2, 3, 1] и числа 1, метод должен вернуть [2, 3] - '"
                        + Arrays.toString(ArrayUtilsRemoveElement.removeElement(new int[]{1, 1, 2, 3, 1}, 1))
                        + "'"
        );
    }
}
