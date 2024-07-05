// Анализатор списка
//
//Реализуйте метод, который принимает на вход целочисленный массив arr:
//- Создаёт список ArrayList, заполненный числами из исходого массива arr.
//- Сортирует список по возрастанию и выводит на экран.
//- Находит минимальное значение в списке и выводит на экран - Minimum is {число} -
// Находит максимальное значение в списке и выводит на экран - Maximum is {число}
//- Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
//Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает
// на вход один параметр:
//
//Integer[] arr - массив целых чисел.
//
//Пример.
//Исходный массив:
//
//4, 2, 7, 5, 1, 3, 8, 6, 9
//Результаты:
//
//[1, 2, 3, 4, 5, 6, 7, 8, 9]
//Minimum is 1
//Maximum is 9




import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Answer_3 {
    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже

        ArrayList<Integer> list = new ArrayList<>(arr.length);
        double sum = 0;
        for (Integer elem : arr) {
            list.add(elem);
            sum += elem;
        }

        Collections.sort(list);
        int max = list.get(list.size() - 1);
        int min = list.get(0);
        double avg = sum / list.size();

        System.out.println(list);
        System.out.println("Minimum is " + min);
        System.out.println("Maximum is " + max);
        System.out.println("Average is " + avg);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class DZ_3{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer_3 ans = new Answer_3();
        ans.analyzeNumbers(arr);
    }
}

// ************************************
/*
Решение с сайта:

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

class Answer {
    public static void analyzeNumbers(Integer[] arr) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(nums); // сортировка списка по возрастанию
        System.out.println(nums); // вывод списка на экран
        System.out.println("Minimum is " + nums.get(0)); // нахождение минимального значения в списке и вывод на экран
        System.out.println("Maximum is " + nums.get(nums.size()-1)); // нахождение максимального значения в списке и вывод на экран

        int sum = 0;
        for(int i : nums){ // вычисление суммы всех элементов списка
            sum += i;
        }
        System.out.println("Average is " + (double) sum / nums.size()); // вычисление среднего арифметического значений списка и вывод на экран
    }
}

public class Printer{
    public static void main(String[] args) {
      Integer[] arr = {};

      if (args.length == 0) {
        arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }

      Answer ans = new Answer();
      ans.analyzeNumbers(arr);
    }
}

 */