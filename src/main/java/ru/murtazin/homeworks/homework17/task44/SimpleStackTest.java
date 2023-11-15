package ru.murtazin.homeworks.homework17.task44;

/**
 * ДЗ (44)
 * Реализуйте класс стека, который работает с целочисленными значениями.
 */
public class SimpleStackTest {
    private SimpleStackTest() {
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new SimpleStack();
        System.out.println("Вначале стек пуст: " + stack.isEmpty());
        System.out.println("Помещаем в стек 42: " + stack.push(42));
        System.out.println("После добавления элемента - не пуст: " + stack.isEmpty());
        System.out.println("Достали из стека последнее значение: " + stack.pop());
        System.out.println("После удаления элемента стек снова пуст: " + stack.isEmpty());
    }
}

interface Stack<T> {
    T push(T item);

    T pop();

    boolean isEmpty();
}

class SimpleStack implements Stack<Integer> {
    //TODO
}
