package ru.murtazin.homeworks.homework17.task25;

import java.util.*;

/**
 * ДЗ (25)
 * Реализуйте метод, который получает коллекцию объектов, и на выходе возвращает коллекцию уникальных значений
 */
public class CollectionUtilsUniqueValues {
    public static <T> Collection<T> removeDuplicates(Collection<T> inputCollection) {
//TODO
        return List.of();
    }

    private CollectionUtilsUniqueValues() {

    }

    public static void main(String[] args) {
        System.out.println("При вводе коллекции (1, 2, 3, 3, 2, 4) метод должен вернуть (1, 2, 3, 4) - "
                + CollectionUtilsUniqueValues.removeDuplicates(List.of(1, 2, 3, 3, 2, 4)));
    }
}
