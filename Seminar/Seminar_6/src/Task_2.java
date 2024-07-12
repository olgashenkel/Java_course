// Задание № 1
// 1. Напишите метод, который заполнит массив из 1000 элементов случайными
//числами от 0 до 500
//2. Создайте метод, в который передайте заполненный выше массив и с
//помощью Set вычислите процент уникальных значений в данном массиве и
//верните его в виде числа с плавающей запятой.
//Для вычисления процента используйте формулу:
//процент уникальных чисел = количество уникальных чисел * 100 / общее
//количество чисел в массиве.


import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task_2 {
    public static void main(String[] args) {

        int count = 1000;
        int start = 0;
        int end = 500;

        int[] arr = getIntArray(count, start, end);
        double uniqEls = getPercentUniqElems(arr);


//        System.out.println(Arrays.toString(arr));
        System.out.println("процент уникальных чисел = " + uniqEls);


    }

    public static int[] getIntArray(int count, int start, int end) { // создаем метод, count - количество элементов, start - начальное значение, end - конечное значение
// 1. Напишите метод, который заполнит массив из 1000 элементов случайными
//числами от 0 до 500
        int[] arr = new int[count];     // создаем пустой массив с размером count
        Random rnd = new Random();      // создаем Random для заполнения массива случайными числами
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(start, end + 1); // заполняем массив случайными числами в диапазоне от start до end
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static double getPercentUniqElems(int[] arr) {
//2. Создайте метод, в который передайте заполненный выше массив и с
//помощью Set вычислите процент уникальных значений в данном массиве и
//верните его в виде числа с плавающей запятой.
        Set<Integer> set = new HashSet<>();
        for (int el : arr) {
            set.add(el);
        }
        double uniqEls = set.size() * 100.0 / arr.length;
        return uniqEls;
    }

}
