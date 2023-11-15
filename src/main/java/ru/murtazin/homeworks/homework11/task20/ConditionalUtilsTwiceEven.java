package ru.murtazin.homeworks.homework11.task20;

/**
 * ДЗ (20)
 * Реализуйте метод, который принимает трёхзначное число и проверяет, является ли оно "дважды чётным"
 * (сумма и произведение его цифр являются чётными)
 * Если переданное число имеет больше или меньше чисел чем 3 метод должен вернуть отрицательный результат.
 */


public class ConditionalUtilsTwiceEven {
    public static boolean isDoublePrime(int inputNumber) {
        int dozens, units, hundreds;
        if (inputNumber / 1000 != 0 || inputNumber / 100 == 0) {
            return false;
        } else {
            units = (inputNumber % 100) % 10;
            dozens = inputNumber % 100 / 10;
            hundreds = inputNumber / 100;
            System.out.println(hundreds + " " + dozens + " " + units);
            return (hundreds + dozens + units) % 2 == 0 && (hundreds * dozens * units) % 2 == 0;
        }
    }

    private ConditionalUtilsTwiceEven() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе числа 222 метод должен вернуть true - " + ConditionalUtilsTwiceEven.isDoublePrime(222));
        System.out.println("При вводе числа 123 метод должен вернуть true - " + ConditionalUtilsTwiceEven.isDoublePrime(123));
        System.out.println("При вводе числа 333 метод должен вернуть true - " + ConditionalUtilsTwiceEven.isDoublePrime(333));
        System.out.println("При вводе числа 3333 метод должен вернуть true - " + ConditionalUtilsTwiceEven.isDoublePrime(3333));
        System.out.println("При вводе числа 33 метод должен вернуть true - " + ConditionalUtilsTwiceEven.isDoublePrime(33));
        System.out.println("При вводе числа 3 метод должен вернуть true - " + ConditionalUtilsTwiceEven.isDoublePrime(3));
    }
}
