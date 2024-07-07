// Задание № 2
// Реализовать консольное приложение, которое:
//1. Принимает от пользователя и “запоминает” строки.
//2. Если введено print, выводит строки так, чтобы последняя введенная
//была первой в списке, а первая - последней.
//3. Если введено revert, удаляет предыдущую введенную строку из памяти.


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        List<String> list = new LinkedList<>();

        while (true) {
            System.out.println();
            System.out.println("Введите текст для сохранения в списке.");
            System.out.println("Введите 'print' для изменения порядка списка (обратный прядок).");
            System.out.println("Введите 'revert' для удаления предыдущей введенной строки из памяти.");
            System.out.println("Для выхода из цикла нажмите 'q'!");
            String input = in.nextLine();

            if (input.equals("q")) {
                System.out.println("До встречи!");
                break;
            }

            if (input.equals("print")) {
                if (list.isEmpty()) {
                    System.err.println("Список пуст!");
                } else {
                    for (int i = list.size() - 1; i >= 0; i--) {
                        System.out.print(list.get(i) + " ");
                    }
                }
            } else if (input.equals("revert")) {
                if (list.isEmpty()) {
                    System.err.println("Список пуст!");
                } else {
                    System.out.println("Уаляем элемент '" + list.removeLast() + "'" + " из списка");
                    System.out.println(list);
                }
            } else {
                list.add(input);
                System.out.println("Добавляем элемент '" + input + "'" + " в список");
                System.out.println(list);
            }

        }
        in.close();
    }
}
