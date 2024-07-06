// Задание № 1.
//📌 Заполнить список десятью случайными числами.
//📌 Отсортировать список методом sort() класса Collections
// и вывести его на экран.


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task_2 {



    public static void main(String[] args) {

        ArrayList<Integer> randomList = new ArrayList<>(); // создаем список из случайных чисел
        int count = 10; // количество случайных чисел в списке
        int min = 1; // минимальное значение числа в списке
        int max = 100; // максимальное значение числа в списке
        fillRandomList(randomList, count, min, max); // вызов метода и передача в него входных данных
        System.out.println("Исходный список:\n" + randomList);
        Collections.sort(randomList); // сортировка метода
        System.out.println("Отсортированный список:\n" + randomList);

    }


    private static void fillRandomList(ArrayList<Integer> randomList, int count, int min, int max) {
        Random rnd = new Random();
        for(int i = 0; i < count; i++) {
            randomList.add(rnd.nextInt(min, max));
        }
    }
}
