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


class Answer_2 {
    public void printPrimeNums(){
        // Напишите свое решение ниже

        boolean isprime;
        for(int i = 2; i <= 1000; i++) {
            isprime = true;
            // проверить, делится ли число без остатка
            for(int j = 2; j <= Math.sqrt(i); j++) {
                // если число делится без остатка, значит, оно не простое
                if((i % j) == 0) isprime = false;
            }
            if(isprime) System.out.println(i);
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class DZ_2{
    public static void main(String[] args) {

        Answer_2 ans = new Answer_2();
        ans.printPrimeNums();
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