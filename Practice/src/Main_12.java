import java.io.IOException;
import java.util.Scanner;

public class Main_12 {
    public static void main(String[] args)  throws IOException {

// *********************************
// Java: ЦИКЛЫ. Обход строк
// *********************************
//Циклы подходят не только для обработки чисел, но и при работе со строками.
// В первую очередь благодаря возможности получить конкретный символ по его индексу.

// Ниже пример кода, который распечатывает буквы каждого слова на отдельной строке:
//
//public static void printNameBySymbol(String name) {
//    var i = 0;
//    // Такая проверка будет выполняться до конца строки
//    // включая последний символ. Его индекс `length() - 1`.
//    while (i < name.length()) {
//        // Обращаемся к символу по индексу
//        System.out.println(name.charAt(i));
//        i += 1;
//    }
//}
//
//var name = "Arya";
//App.printNameBySymbol(name);
//// "A"
//// "r"
//// "y"
//// "a"
//Самое главное в этом коде — поставить правильное условие в while.
// Это можно сделать сразу двумя способами:
//
//i < name.length()
//i <= name.length() - 1
//Оба способа приводят к одному результату.

        Scanner in = new Scanner (System.in);
//        System.out.print("Задание 1. Введите любое слово: ");
//        String name = in.nextLine();
//        printReversedNameBySymbol(name);

        System.out.print("Задание 2. Введите любое слово: ");
        String str = in.nextLine();
        System.out.print("Задание 2. Введите любой символ для проверки ");
        String str_1 = in.nextLine();
        char ch = str_1.charAt(0);
        System.out.printf("Задание 2. Количество символов %c в данном слове = ", ch);

        System.out.println(countChars(str, ch));


        in.close();

    }

// Задание 1.
//Реализуйте статический метод App.printReversedNameBySymbol(),
// который печатает переданное слово посимвольно, как в примере из теории,
// но делает это в обратном порядке.
//
//var name = "Arya";
//App.printReversedNameBySymbol(name);
//// 'a'
//// 'y'
//// 'r'
//// 'A'

//    public static void printReversedNameBySymbol(String name) {
//        int i = name.length() - 1;
//        while (i >= 0) {
//            System.out.println(name.charAt(i));
//            i--;
//        }
//    }

// Задание 2.
//Метод из теории учитывает регистр букв. То есть A и a с его точки зрения разные символы.
// Реализуйте вариант этого же метода, так чтобы регистр букв был не важен:
//
//App.countChars("HexlEt", 'e'); // 2
//App.countChars("HexlEt", 'E'); // 2
//Character.toLowerCase() – переводит символ в нижний регистр


    public static int countChars(String str, char ch) {
        int i = 0;
        int count = 0;

        while (i < str.length()) {
            if (str.toLowerCase().charAt(i) == Character.toLowerCase(ch)) {
// Метод Character.toLowerCase() – в Java возвращает указанное значение типа char
// в нижнем регистре (строчной буквой).
                count++;
            }
            i++;
        }
        return count;
    }

}
