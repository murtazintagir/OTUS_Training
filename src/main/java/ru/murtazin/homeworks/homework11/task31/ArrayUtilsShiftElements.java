package ru.murtazin.homeworks.homework11.task31;
import java.util.Arrays;

/**
 * ДЗ (31)
 * Дан массив целочисленных элементов. Реализуйте метод, который сдвигает все элементы массива, кроме первого, \
 * на одну позицию влево.
 * Значение, находившееся в начальной ячейке массива, должно перейти в последнюю ячейку (левый сдвиг).
 */
public class ArrayUtilsShiftElements {
    public static int[] shiftElements(int[] inputArray) {
        int[] shiftArray = new int[inputArray.length];
        if (shiftArray.length == 1) {
            return inputArray;
        }
        for (int i = 0; i < shiftArray.length - 1; i++) {
            if (i == 0) {
                shiftArray[shiftArray.length - 1] = inputArray[i];
                shiftArray[i] = inputArray[i + 1];
            } else {
                shiftArray[i] = inputArray[i + 1];
            }
        }
        return shiftArray;
    }
    private ArrayUtilsShiftElements() {

    }

    public static void main(String[] args) {
        System.out.println(
                "При вводе массива [1, 2, 3, 4, 5], метод должен вернуть массив [2, 3, 4, 5, 1] - '"
                        + Arrays.toString(ArrayUtilsShiftElements.shiftElements(new int[]{1, 2, 3, 4, 5}))
                        + "'");
        System.out.println(
                "При вводе массива [1], метод должен вернуть массив [1] - '"
                        + Arrays.toString(ArrayUtilsShiftElements.shiftElements(new int[]{1}))
                        + "'");
    }
}
