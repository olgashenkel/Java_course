// Сортировка слиянием
//
//Внутри класса MergeSort напишите метод mergeSort,
// который принимает массив целых чисел, реализует алгоритм
// сортировки слиянием. Метод должен возвращать отсортированный массив.
//
//Пример
//
//a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]

// Сортировка слиянием Java
//Сортировка слиянием — это алгоритм сортировки, который делит массив на подмассивы,
// сортирует каждый из них, а затем объединяет отсортированные подмассивы,
// что в результате дает отсортированный массив.

// Объяснение
//Сортировка осуществляется путём сравнения наименьших элементов каждого подмассива.
// Первые элементы каждого подмассива сравниваются первыми.
// Наименьший элемент перемещается в результирующий массив.
// Счётчики результирующего массива и подмассива, откуда был взят элемент,
// увеличиваются на один.
//
//Сложность алгоритма: O(n log n)


import java.util.Arrays;

class MergeSort {
    public static int[] mergeSort(int[] a) {
        // Напишите свое решение ниже

        // Создаем массивы для сортировки:
        int[] buffer_1 = Arrays.copyOf(a, a.length);
        int[] buffer_2 = new int[a.length];
        int[] result = mergeSortInner(buffer_1, buffer_2, 0, a.length);

        return result;
    }

    public static int[] mergeSortInner(int[] buffer_1, int[] buffer_2, int startIndex, int endIndex) {
        // Проверяем не нулевой ли массив, а также не один ли элемент в массиве:
        if (startIndex >= endIndex - 1) {
            return buffer_1;
        }

        // уже отсортирован:
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted_1 = mergeSortInner(buffer_1, buffer_2, startIndex, middle);
        int[] sorted_2 = mergeSortInner(buffer_1, buffer_2, middle, endIndex);

        // Слияние:
        int index_1 = startIndex;
        int index_2 = middle;
        int destIndex = startIndex;
        int[] result = sorted_1 == buffer_1 ? buffer_2 : buffer_1;

        while (index_1 < middle && index_2 < endIndex) {
            result[destIndex++] = sorted_1[index_1] < sorted_2[index_2] ? sorted_1[index_1++] : sorted_2[index_2++];
        }

        while (index_1 < middle) {
            result[destIndex++] = sorted_1[index_1++];
        }

        while (index_2 < endIndex) {
            result[destIndex++] = sorted_2[index_2++];
        }

        return result;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class DZ_1 {
    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{8, 1, 6, 4, 7};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}

// ************************************
/*
Решение с сайта:

import java.util.Arrays;

class MergeSort {
    public static int[] mergeSort(int[] a) {
        int n = a.length;
        if (n < 2) {
            return a;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        l = mergeSort(l);
        r = mergeSort(r);

        return merge(l, r);
    }

    public static int[] merge(int[] l, int[] r) {

        int left = l.length;
        int right = r.length;
        int[] a = new int[left + right];
        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }

        return a;
    }
}

public class Printer{
    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}

 */
