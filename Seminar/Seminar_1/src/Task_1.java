package src;
/*
Задание №0. Настроим VS Code
Скачать и установить: https://code.visualstudio.com/download
Настроить проект, вывести в консоль “Hello world!”.
Вывести в консоль системные дату и время.
 */

import java.time.LocalDate;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(LocalDate.now());

        int n = 34534; // Integer
        double d = 5.65; // Double
        String s = "Привет!";
        char c = 't';
        boolean b = true;

        String[] str = new String[]{"ere", "345"};
        String[] str1 = {"ere", "345"};

        int[] nums = {5, 7, 9};

        if (5 > 4) {

        }

// while (b) {

// }

        for (int i = 0; i < nums.length; i++) {

        }

        for (int elem : nums) {
            System.out.print(elem + " ");
        }

        System.out.println(name("Андрей"));

    }

    public static String name(String name) {

        return "Привет, " + name + "!";

    }
}