import java.util.Scanner;

public class Main_11 {
    public static void main(String[] args) {

// *********************************
// Java: ЦИКЛЫ. Агрегация данных (Числа)
// *********************************
//В программировании есть отдельный класс задач, который не может обойтись без циклов —
// он называется !!!агрегированием данных!!!.
//
//К таким задачам относятся поиск://
//Максимального значения
//Минимального значения
//Суммы
//Среднего арифметического

//Их главная особенность в том, что результат зависит от всего набора данных.
// Для расчета суммы нужно сложить все числа, для вычисления максимального нужно сравнить все числа.
//
//С этой темой хорошо знакомы все, кто занимаются числами.
// Например, с такими задачами часто работают бухгалтеры или маркетологи
// в таблицах наподобие Microsoft Excel или Google Sheets.
//
//Разберем самый простой пример — поиск суммы набора чисел.
// Реализуем функцию, которая складывает числа в указанном диапазоне, включая границы.
//
//В этом случае диапазоном называется ряд чисел от какого-то начала до определенного конца.
// Например, диапазон [1, 10] включает в себя все целые числа от 1 до 10:
//
//App.sumNumbersFromRange(5, 7); // 5 + 6 + 7 = 18
//App.sumNumbersFromRange(1, 2); // 1 + 2 = 3
//
//// Диапазон [1, 1] с одинаковым началом и концом – тоже диапазон
//// Он включает одно число — саму границу диапазона
//App.sumNumbersFromRange(1, 1); // 1
//App.sumNumbersFromRange(100, 100); // 100

// Общая структура цикла здесь стандартна:
//
//Счетчик, который инициализируется начальным значением диапазона
//Сам цикл с условием остановки при достижении конца диапазона
//Изменение счетчика в конце тела цикла
//Количество итераций в таком цикле равно finish - start + 1.
// Например, нужно 3 итерации, чтобы посчитать диапазон от 5 до 7:
//
//7 - 5 + 1 = 3
//Главные отличия от обычной обработки связаны с логикой вычислений результата.
// В задачах на агрегацию всегда есть какая-то переменная, которая хранит внутри себя результат
// работы цикла. В коде выше это sum.
//
//На каждой итерации цикла происходит ее изменение, прибавление следующего числа в диапазоне:
// sum = sum + i.


// *********************************
// Java: Агрегация данных (Строки)
// *********************************

//Агрегация применяется не только к числам, но и к строкам.
//
//При агрегации строка формируется динамически, то есть заранее неизвестно,
// какого она размера и что будет содержать. Представьте себе метод,
// который умеет умножать строку — то есть он повторяет ее указанное количество раз:
//
//App.repeat("hexlet", 3); // "hexlethexlethexlet"
//Принцип работы этого метода довольно простой.
// В цикле происходит наращивание строки указанное количество раз

        Scanner in = new Scanner(System.in);
        System.out.print("Задание 1, 2. Введите первое число: ");
        int start = in.nextInt();
        System.out.print("Задание 1, 2. Введите второе число: ");
        int finish = in.nextInt();
        System.out.print("Произведение чисел = ");
        System.out.println(multiplyNumbersFromRange(start, finish));
        System.out.print("Конкатенация чисел = ");
        System.out.println(joinNumbersFromRange(start, finish));

        in.close();

    }

// Задание 1.
//Реализуйте метод multiplyNumbersFromRange(),
// который перемножает числа в указанном диапазоне включая границы диапазона.
//
// Пример вызова://
//App.multiplyNumbersFromRange(1, 5); // 1 * 2 * 3 * 4 * 5 = 120
//App.multiplyNumbersFromRange(2, 3); // 2 * 3 = 6
//App.multiplyNumbersFromRange(6, 6); // 6

    public static int multiplyNumbersFromRange(int start, int finish) {
        int i = start;
        int work = 1;
        while (i <= finish) {
            work *= i;
            i++;
        }
        return work;
    }

// Задание 2.
//Реализуйте метод joinNumbersFromRange(), который объединяет все числа из диапазона в строку:
//
//App.joinNumbersFromRange(1, 1); // "1"
//App.joinNumbersFromRange(2, 3); // "23"
//App.joinNumbersFromRange(5, 10); // "5678910"

    public static String joinNumbersFromRange(int start, int finish) {
        int i = start;
        String str = "";
        while (i <= finish) {
            str += i;
            i++;
        }
        return str;
    }
}
