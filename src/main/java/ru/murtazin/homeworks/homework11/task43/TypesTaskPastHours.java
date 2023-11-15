package ru.murtazin.homeworks.homework11.task43;

/**
 * ДЗ (43)
 * Реализуйте метод, который принимает на вход количество секунд и
 * возвращает количество целых часов, прошедших с начала дня.
 * Если переданное количество секунд больше чем количество секунд в дне (86400) или меньше нуля -
 * метод должен вернуть 0.
 */
public class TypesTaskPastHours {
    private static final int SECONDS_IN_DAY = 86400;

    public static int pastHours(int second) {
        if (second > SECONDS_IN_DAY || second < 0) {
            return 0;
        } else {
            return second / 3600;
        }
    }

    private TypesTaskPastHours() {

    }

    public static void main(String[] args) {
        System.out.println("С начала дня прошло 2 часа: " + pastHours(125 * 60));
        System.out.println("С начала дня прошло 0 часа: " + pastHours(-10));
    }
}
