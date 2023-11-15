package ru.murtazin.homeworks.homework11.task38;

/**
 * ДЗ (38)
 * Реализуйте метод, который принимает произвольное количество целых чисел и возвращает максимальное из них.
 */
public class FunctionUtilsGetMax {
    public static int getMax(int... numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    private FunctionUtilsGetMax() {

    }

    public static void main(String[] args) {
        System.out.println(
                "При вводе массива [1, 6, 9, 0, 15, 3], метод должен вернуть число 15 - '"
                        + FunctionUtilsGetMax.getMax(1, 6, 9, 0, 15, 3)
                        + "'"
        );
    }
}
