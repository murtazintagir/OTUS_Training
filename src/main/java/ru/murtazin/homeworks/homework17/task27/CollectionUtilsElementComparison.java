package ru.murtazin.homeworks.homework17.task27;

import java.util.List;

/**
 * ДЗ (27)
 * Реализуйте метод, который принимает два списка и сравнивает равны ли множества их элементов
 */
public class CollectionUtilsElementComparison {
    public static boolean isValuesMatch(List<?> leftList, List<?> rightList) {
//TODO
        return true;
    }

    private CollectionUtilsElementComparison() {

    }

    public static void main(String[] args) {
        System.out.println(
                "При вводе массивов: (1, 2, 3) и (4, 5, 6), метод должен вернуть false - '"
                        + CollectionUtilsElementComparison.isValuesMatch(List.of(1, 2, 3), List.of(4, 5, 6))
                        + "'"
        );
    }
}
