package ru.murtazin.homeworks.homework11.task21;

/**
 * ДЗ (21)
 * Реализуйте метод, который принимает номер года и проверяет високосный ли он или нет.
 */
public class ConditionalUtilsLeapYear {
    public static boolean isLeapYear(int inputYear) {
        if (inputYear % 400 == 0 || inputYear % 4 == 0 && inputYear % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }

    private ConditionalUtilsLeapYear() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе числа 2004, метод должен вернуть true - " + ConditionalUtilsLeapYear.isLeapYear(200));
    }
}
