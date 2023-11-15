package ru.murtazin.homeworks.homework11.task23;

/**
 * ДЗ (23)
 * Реализуйте метод, который принимает три числа и проверяет, могут ли они являться длинами сторон треугольника.
 */
public class ConditionalUtilsTriangleSides {
    public static boolean isTriangleSides(int aSide, int bSide, int cSide) {
        return aSide >= 0 && bSide >= 0 && cSide >= 0 &&
                aSide < bSide + cSide && bSide < aSide + cSide && cSide < aSide + bSide;
    }

    private ConditionalUtilsTriangleSides() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе сторон треугольника 1, 2 и 3, метод должен вернуть false - "
                + ConditionalUtilsTriangleSides.isTriangleSides(1, 2, 3));
    }
}
