package ru.murtazin.homeworks.homework11.task10;

import java.util.Arrays;

/**
 * ДЗ (10)
 * Дано число. Реализуйте метод, который вычисляет числа Фибоначчи (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...),
 * находит их сумму и возвращает её в виде строки. Формула расчёта чисел: Fn = Fn-1 + Fn-2 -
 * где n переданное в метод число.
 * Например, для n=5 сумма будет равна 7, а для n=2 сумма будет равна 1.
 * Если в метод передано отрицательное число - он должен вернуть 0.
 */

public class FibonacciUtils {
    public static String getFibonacciSum(byte limit) {
        int sum = 0;
        if (limit <= 0 || limit == 1) {
            return "0";
        } else {
            int[] f = new int[limit];
            f[0] = 0;
            f[1] = 1;
            for (int i = 2; i < limit; ++i) {
                f[i] = f[i - 1] + f[i - 2];
            }
            for (int i = 0; i < f.length; i++) {
                sum += f[i];
            }
        }

        return "" + sum;
    }

    private FibonacciUtils() {

    }

    public static void main(String[] args) {
        System.out.println("Сумма чисел фибоначчи до 5 должна равняться 7 - " + FibonacciUtils.getFibonacciSum((byte) 5));
        System.out.println("Сумма чисел фибоначчи до -1 - " + FibonacciUtils.getFibonacciSum((byte) -1));
        System.out.println("Сумма чисел фибоначчи до 0 - " + FibonacciUtils.getFibonacciSum((byte) 0));
        System.out.println("Сумма чисел фибоначчи до 1 - " + FibonacciUtils.getFibonacciSum((byte) 1));
        System.out.println("Сумма чисел фибоначчи до 2 - " + FibonacciUtils.getFibonacciSum((byte) 2));
        System.out.println("Сумма чисел фибоначчи до 3 - " + FibonacciUtils.getFibonacciSum((byte) 3));
        System.out.println("Сумма чисел фибоначчи до 4 - " + FibonacciUtils.getFibonacciSum((byte) 4));
    }
}
