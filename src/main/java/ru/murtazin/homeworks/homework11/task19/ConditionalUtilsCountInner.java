package ru.murtazin.homeworks.homework11.task19;

/**
 * ДЗ (19)
 * Реализуйте метод, который принимает два положительных числа - двузначное и четырехзначное - и проверяет,
 * сколько раз двузначное число встречается как «внутреннее» по отношению к четырехзначному.
 */

public class ConditionalUtilsCountInner {
    public static int countInnerNumber(int base, int checkNumber) {
        int base1, base2, base3, num = 0;
        base1 = base / 100;
        base2 = (base % 1000) / 10;
        base3 = base % 100;
        if (base1 == checkNumber) {
            num++;
        }
        if (base2 == checkNumber) {
            num++;
        }
        if (base3 == checkNumber) {
            num++;
        }
        return num;
    }

    private ConditionalUtilsCountInner() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе чисел 6522 и 22 метод должен вернуть 1 - "
                + ConditionalUtilsCountInner.countInnerNumber(6522, 22));
        System.out.println("При вводе чисел 2222 и 22 метод должен вернуть 1 - "
                + ConditionalUtilsCountInner.countInnerNumber(2222, 22));
    }
}
