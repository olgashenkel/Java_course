// Задание № 1.
// Реализовать консольное приложение, которое:
//1. Принимает от пользователя строку вида
//text~num
//2. Нужно рассплитить строку по ~, сохранить text в связный список на
//позицию num.
//3. Если введено print~num, выводит строку из позиции num в связном
//списке и удаляет её из списка.

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> str = new LinkedList<>();

        while (true) {
            System.out.println();
            System.out.println("Введите строку вида 'text~num' для добавления в список.");
            System.out.println("Введите строку вида 'print~num' для вывода и удаления строки из списка.");
            System.out.println("Для выхода из цикла нажмите 'q'!");
            String input = in.nextLine();

            if (input.equals("q")) {
                System.out.println("Good bye!");
                break;
            }
            String[] inputSplit = input.split("~");
            String text = inputSplit[0];
            int num = Integer.parseInt(inputSplit[1]);

            if (text.equals("print")) {
                if (num >= 0 && num < str.size()) {
                    System.out.println(str.get(num));
                    str.remove(num);
                } else {
                    System.out.println("Некорректный индекс");
                }
                System.out.println(str);

            } else {
                if (num >= 0 && num <= str.size()) {
                    str.add(num, text);
                }
                System.out.println(str);
            }

        }
        in.close();
    }
}
