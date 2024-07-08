// Задание № 4.
// Реализовать стэк с помощью массива.
//Нужно реализовать методы:
//size(), empty(), push(), peek(), pop().


import java.util.Stack;

public class Task_5 {

    private static int[] stackArray;   // переменные уровня class - называются полями

    private static int capacity;

    private static int topIndex;

    public static void main(String[] args) {
        capacity = 5;
        stackArray = new int[capacity];
        topIndex = -1;


        System.out.println("Размер массива = " + size());
        System.out.println("Возвращает значение true, если стек пуст, в ином случае false: " + empty());

        push(5);
        push(15);
        push(11);
        push(-1);
        push(0);

        System.out.println("Размер массива после добавления элементов = " + size());
        System.out.println("Stack. Выводится в обратном порядке (\"последний вошёл - первый вышел\" (LIFO)): ");
        printStack(stackArray);
        System.out.println();

        System.out.println("Возвращает значение true, если стек пуст, в ином случае false: " + empty());
        System.out.println("peek() — возвращает верхний элемент стека, но не удаляет его из стека: " + peek());
        System.out.println("pop() — удаляет верхний элемент из стека и возвращает его: " + pop());
        System.out.println("pop() — удаляет верхний элемент из стека и возвращает его: " + pop());
        System.out.println("Размер массива после удаления элементов = " + size());

    }

    public static void printStack(int[] num) {
        Stack<Integer> stack = new Stack<>();

        for (Integer elem : num) {
            stack.push(elem);
        }
//        System.out.println(stack); // особенность java - данный метод System.out.println(stack) выведет стэк как массив!
        while (!stack.isEmpty()) {  // !stack.isEmpty() - пока стэк не пустой (!)
            System.out.print(stack.pop() + " ");    // получить следующий элемент из стэка можно только удалив предшествущий!
        }
    }

    public static int size() {
        return topIndex + 1;
    }

    public static boolean empty() {
        return topIndex == -1;
    }

    public static void push(int num) {
            stackArray[++topIndex] = num;
    }


    public static int peek() {
        return stackArray[topIndex];
    }

    public static int pop() {
        return stackArray[topIndex--];
    }
}
