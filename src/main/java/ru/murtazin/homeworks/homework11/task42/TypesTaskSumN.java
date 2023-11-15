package ru.murtazin.homeworks.homework11.task42;

/**
 * ДЗ (42)
 * Реализуйте метод, который выводит сумму всех целых чисел от 1 до указанного числа.
 * Если переданное число меньше 1, метод должен вернуть 0.
 */
public class TypesTaskSumN {
    public static long sumN(int input) {
        int sum = 0;
        if (input > 0) {
            for (int i = 1; i <= input; i++) {
                sum += i;
            }
        }
        return sum;
    }

    private TypesTaskSumN() {

    }

    public static void main(String[] args) {
        System.out.println(
                "Ввод меньше 1 должен вернуть 0: " +
                        sumN(-1)
        );
        System.out.println(
                "Сумма от 1 до 7: " +
                        sumN(7)
        );
        System.out.println(
                "Сумма от 1 до 7: " +
                        sumN(1)
        );
    }
}
