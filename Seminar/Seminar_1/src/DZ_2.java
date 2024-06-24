package src;

/**
 * Вывести простые числа
 * ****************
 * Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000,
 * каждое на новой строке.
 * <p>
 * Напишите свой код в методе printPrimeNums класса Answer.
 * ****************
 * Пример:
 * 2
 * 3
 * 5
 * 7
 * 11
 * ...
 */

public class DZ_2 {
    public static void main(String[] args) {
        printPrimeNums();
    }

    static void printPrimeNums() {

        int N = 1000;
        boolean[] isPrime = new boolean[N + 1];

        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= N; p++) {
            if (isPrime[p] == true) {
                for (int i = p * p; i <= N; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        for (int i = 2; i <= N; i++) {
            if (isPrime[i] == true) {
                System.out.println(i);
            }
        }
    }
}



/*
Решение с сайта:

class Answer {
       public static void printPrimeNums() {
        // Напишите свое решение ниже

        // Проход начинается с 2, т.к. это число является наименьшим простым
        for (int i = 2; i <= 1000; i++) {

            boolean isPrime = true;

            // Проверка, является ли число i простым
            // Проход по циклу до корня числа,
            // т.к. дальше нет смысла искать, делителей нет.
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            // Если число i простое, вывод его на экран
            if (isPrime)
                System.out.println(i);
        }
    }
}

public class Printer{
    public static void main(String[] args) {

      Answer ans = new Answer();
      ans.printPrimeNums();
    }
}

 */