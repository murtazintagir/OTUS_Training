package ru.murtazin.homeworks.homework11.task40;

/**
 * ДЗ (40)
 * Реализуйте метод, который принимает букву и возвращает ту же букву, но в обратно регистре.
 * Пример: при y - вернёт Y Если передана не буква - вернуть переданный символ без изменений.
 */
public class TypesTaskChangeCase {
    public static char changeCase(char input) {
//TODO
        return '0';
    }

    private TypesTaskChangeCase() {

    }

    public static void main(String[] args) {
        System.out.println(
                "Ввод G в верхнем регистре, должны получить в нижнем: " +
                        changeCase('G')
        );
        System.out.println(
                "Ввод g в нижнем регистре, должны получить в верхнем: " +
                        changeCase('g')
        );
    }
}
