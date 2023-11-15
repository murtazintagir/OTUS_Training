package ru.murtazin.homeworks.homework11.task20;

/**
 * ДЗ (20)
 * Реализуйте метод, который принимает трёхзначное число и проверяет, является ли оно "дважды чётным"
 * (сумма и произведение его цифр являются чётными)
 * Если переданное число имеет больше или меньше чисел чем 3 метод должен вернуть отрицательный результат.
 */


public class ConditionalUtilsTwiceEven {
    public static boolean isDoublePrime(int inputNumber) {
// TODO
        return false;
    }

    private ConditionalUtilsTwiceEven() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе числа 222 метод должен вернуть true - " + ConditionalUtilsTwiceEven.isDoublePrime(222));
    }
}
