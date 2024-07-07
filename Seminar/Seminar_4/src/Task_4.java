// Задание № 3.
// 1) Написать метод, который принимает массив элементов, помещает их в стэк
//и выводит на консоль содержимое стэка.
//2) Написать метод, который принимает массив элементов, помещает их в
//очередь и выводит на консоль содержимое очереди.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Task_4 {
    public static void main(String[] args) {
        int[] num = {0, 1, 2, 5, 8, 9, 10, 15, 16};
        System.out.println("Stack. Выводится в обратном порядке (\"последний вошёл - первый вышел\" (LIFO))");
        printStack(num);
        System.out.println("\n");
        System.out.println("Queue. Выводится в прямом порядке (по принципу FIFO (first in - first out)");
        printQueue(num);
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

    public static void printQueue(int[] num) {
        Queue<Integer> queue = new LinkedList<>();
        for (Integer elem : num) {
            queue.add(elem);
        }
        while (!queue.isEmpty()) {  // !queue.isEmpty() - пока очередь не пуста (!)
            System.out.print(queue.remove() + " ");    // получить следующий элемент из очереди можно только удалив предшествущий!
        }
    }

}
