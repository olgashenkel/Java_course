// Реализация очереди
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

class MyQueueInt {
    // Напишите свое решение ниже

    private LinkedList<Integer> elem = new LinkedList<>();


    public void enqueue(int element){
        // Напишите свое решение ниже

        elem.offer(element);

    }

    public int dequeue(){
        // Напишите свое решение ниже

        return elem.poll();

    }

    public int first(){
        // Напишите свое решение ниже

        return elem.peek();

    }

    public LinkedList<Integer> getElements() {
        // Напишите свое решение ниже

        return elem;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class DZ_2 {
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


//// ****************************
///*
//Решение с сайта:
//
//import java.util.LinkedList;
//
//class MyQueueInt {
//    private LinkedList<Integer> elements = new LinkedList<>();
//
//    public void enqueue(int element) {
//        elements.add(element);
//    }
//
//    public int dequeue() {
//        return elements.removeFirst();
//    }
//
//    public int first() {
//        return elements.getFirst();
//    }
//
//    public LinkedList<Integer> getElements() {
//        return elements;
//    }
//}
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Printer {
//    public static void main(String[] args) {
//        MyQueueInt queue;
//        queue = new MyQueueInt();
//
//        if (args.length == 0) {
//        // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            queue.enqueue(1);
//            queue.enqueue(10);
//            queue.enqueue(15);
//            queue.enqueue(5);
//        } else {
//            queue.enqueue(Integer.parseInt(args[0]));
//            queue.enqueue(Integer.parseInt(args[1]));
//            queue.enqueue(Integer.parseInt(args[2]));
//            queue.enqueue(Integer.parseInt(args[3]));
//        }
//
//        System.out.println(queue.getElements());
//
//        queue.dequeue();
//        queue.dequeue();
//        System.out.println(queue.getElements());
//
//        System.out.println(queue.first());
//    }
//}
//
// */
