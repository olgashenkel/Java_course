// еализация очереди
//
//В классе MyQueueInt реализуйте очередь для типа данных Integer с помощью LinkedList
// со следующими методами:
//
//enqueue() - помещает элемент в конец очереди
//dequeue() - возвращает первый элемент из очереди и удаляет его
//first() - возвращает первый элемент из очереди, не удаляя
//getElements() - возвращает все элементы в очереди
//Пример
//
//
//queue.enqueue(1);
//queue.enqueue(10);
//queue.enqueue(15);
//queue.enqueue(5);
//System.out.println(queue.getElements());
//Результат:
//
//[1, 10, 15, 5]
//queue.dequeue();
//queue.dequeue();
//System.out.println(queue.getElements());
//Результат:
//
// [15, 5]
//System.out.println(queue.first());
//Результат:
//
//15


import java.util.LinkedList;

class MyQueue<T> {
    // Напишите свое решение ниже
    private LinkedList<T> queue = new LinkedList<>();

    public void enqueue(T element){
        // Напишите свое решение ниже
        queue.addLast(element);
    }

    public T dequeue(){
        // Напишите свое решение ниже
        return queue.remove();
    }

    public T first(){
        // Напишите свое решение ниже
        return queue.get(0);
    }

    public LinkedList<T> getElements() {
        // Напишите свое решение ниже
        return queue;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class DZ_2 {
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

//         System.out.println(queue.getElements());

//         System.out.println(queue.dequeue());
//         queue.dequeue();
//         System.out.println(queue.getElements());

//         System.out.println(queue.first());
        System.out.println(queue.getElements());
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());
        System.out.println(queue.first());
    }
}


// ****************************
/*
Решение с сайта:

import java.util.LinkedList;

class MyQueueInt {
    private LinkedList<Integer> elements = new LinkedList<>();

    public void enqueue(int element) {
        elements.add(element);
    }

    public int dequeue() {
        return elements.removeFirst();
    }

    public int first() {
        return elements.getFirst();
    }

    public LinkedList<Integer> getElements() {
        return elements;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        MyQueueInt queue;
        queue = new MyQueueInt();

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}

 */