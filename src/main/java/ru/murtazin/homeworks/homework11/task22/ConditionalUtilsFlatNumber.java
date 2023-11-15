package ru.murtazin.homeworks.homework11.task22;

/**
 * ДЗ (22)
 * Реализуйте метод, который принимает трёхзначное число и проверяет, является ли оно плоским.
 * Пример плоских чисел: 111, 777, 333.
 * Если переданное число имеет больше или меньше чисел чем 3 метод должен вернуть отрицательный результат.
 */
public class ConditionalUtilsFlatNumber {
    public static boolean isDescendingNumber(int inputNumber) {
        int dozens, units, hundreds;
        if (inputNumber / 1000 != 0 || inputNumber / 100 == 0) {
            return false;
        } else {
            units = (inputNumber % 100) % 10;
            dozens = inputNumber % 100 / 10;
            hundreds = inputNumber / 100;
            return (hundreds == dozens && hundreds == units);
        }
    }

    private ConditionalUtilsFlatNumber() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе числа 777 метод должен вернуть true - " + ConditionalUtilsFlatNumber.isDescendingNumber(777));
        System.out.println("При вводе числа 777 метод должен вернуть true - " + ConditionalUtilsFlatNumber.isDescendingNumber(727));
    }
}
