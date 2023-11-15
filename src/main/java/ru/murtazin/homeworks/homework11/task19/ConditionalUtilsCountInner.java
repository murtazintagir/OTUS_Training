package ru.murtazin.homeworks.homework11.task19;

/**
 * ДЗ (19)
 * Реализуйте метод, который принимает два положительных числа - двузначное и четырехзначное - и проверяет,
 * сколько раз двузначное число встречается как «внутреннее» по отношению к четырехзначному.
 */

public class ConditionalUtilsCountInner {
    public static int countInnerNumber(int base, int checkNumber) {
// TODO
        return 0;
    }

    private ConditionalUtilsCountInner() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе чисел 6522 и 22 метод должен вернуть 1 - "
                + ConditionalUtilsCountInner.countInnerNumber(2222, 22));
    }
}
