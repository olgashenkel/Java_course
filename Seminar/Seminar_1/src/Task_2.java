// Задание №1
//📌 Написать программу, которая запросит пользователя ввести
//<Имя> в консоли.
//📌 Получит введенную строку и выведет в консоль сообщение
//“Привет, <Имя>!”

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = inputScanner.nextLine();
        System.out.printf("Привет, %s", name);
        inputScanner.close();   // Закрытие Scanner inputScanner = new Scanner(System.in);


    }
}
