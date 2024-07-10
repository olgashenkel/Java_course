// Задание № 5.

//Взять набор строк, например,

// Мороз и солнце день чудесный
// Еще ты дремлешь друг прелестный
// Пора красавица проснись.

//Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с
//одинаковой длиной не должны “потеряться”.

import java.util.Map;
import java.util.TreeMap;

public class Task_6_dop {
    public static void main(String[] args) {

        String strings_1 = "Мороз и солнце день чудесный";
        String strings_2 = "Еще ты дремлешь друг прелестный";
        String strings_3 = "Пора красавица проснись.";
//        stringsLength(strings_1, strings_2, strings_3);
        System.out.printf("Отсортированные строки по длине:\n %s",
                stringsLength(strings_1, strings_2, strings_3).values());



    }

    public static Map<Integer, String> stringsLength(String strings_1, String strings_2, String strings_3) {
        Map<Integer, String> map = new TreeMap<>();

        int length_1 = strings_1.length();
        int length_2 = strings_2.length();
        int length_3 = strings_3.length();

        if (length_1 == length_2 && length_2 == length_3) {
            map.put(length_1, strings_1);
            map.put(length_2 + 1, strings_2);
            map.put(length_3 + 2, strings_3);
        } else if (length_1 == length_2 || length_1 == length_3) {
            map.put(length_1 + 1, strings_1);
            map.put(length_2, strings_2);
            map.put(length_3, strings_3);
        } else if (length_2 == length_3) {
            map.put(length_1, strings_1);
            map.put(length_2, strings_2);
            map.put(length_3 + 1, strings_3);
        } else {
            map.put(length_1, strings_1);
            map.put(length_2, strings_2);
            map.put(length_3, strings_3);
        }
        return map;
    }

}
