package ru.murtazin.homeworks.homework11.task13;

/**
 * ДЗ (13)
 * Дано число. Реализуйте метод, который принимает число и возвращает в виде строки все чётные числа
 * от 1 до переданного числа включительно. Если передано отрицательное число метод должен вернуть пустую строку.
 * Если передан 0, то метод должен вернуть 1. Пример вывода для числа 5: 1245
 */


public class MathUtilArray {
    public static String getEvenNumbersUpTo(byte number) {
        StringBuilder result = new StringBuilder();
        if (number == 0) {
            return result.append("1").toString();
        } else if (number > 0) {
            result.append("1");
            for (int i = 1; i < number; i++) {
                if (i % 2 == 0) {
                    result.append(i);
                }
            }
            result.append(number);
        }
        return result.toString();
    }


    private MathUtilArray() {

    }

    public static void main(String[] args) {
        System.out.println("Если передать число 5, то метод должен вернуть строку 1245 - " + MathUtilArray.getEvenNumbersUpTo((byte) 10));
        System.out.println("Если передать число 5, то метод должен вернуть строку 1245 - " + MathUtilArray.getEvenNumbersUpTo((byte) -1));
    }
}
