import java.util.Scanner;

public class Main_04 {
    public static void main(String[] args) {

/*
Циклы
Еще одним видом управляющих конструкций являются циклы.
Циклы позволяют в зависимости от определенных условий выполнять определенное
действие множество раз. В языке Java есть следующие виды циклов:
1)	for
2)	while
3)	do...while
 */

////////////////////////////////

//// Вопрос 1
//// Сколько раз выполнится следующий цикл и почему:
//        int i = 5;
//        while (i > 0) {
//            i *= 3;
//            i *= -2;
//        }
//        System.out.println(i);  // 1 раз


////////////////////////////////

//// Вопрос 2
////Дан следующий цикл:
//
//        int j = 2;
//        int count = 0;
//        for (int i = 1; i < 100; i = i + 2) {
//            j = j - 1;
//            count++;
//            while (j < 15) {
//                j = j + 5;
//            }
//
//        }
////Сколько раз в этом цикле будет выполняться строка j = j - 1;
//        System.out.printf("count = %d; j = %d", count, j);      // 50 раз


////////////////////////////////

//// Вопрос 3
////Дан следующий цикл:
//
//        int j = 2;
//        int count = 0;
//        for (int i = 2; i < 32; i = i * 2) {
//            while (i < j) {
//                j = j * 2;
//            }
//            i = j - i;
//            count++;
//        }
////Сколько раз в этом цикле будет выполняться строка i = j - i;
//        System.out.printf("count = %d; j = %d", count, j);      // 1 раз, далее программа зациклится на while


////////////////////////////////

//// Вопрос 4
////Что будет выведено на консоль в результате выполнения следующего цикла:
//        for (int i = 1; i < 3; i++) {
//            switch (i) {
//                default:
//                    System.out.printf("i = %d \n", i++);    //•	Консоль будет иметь вывод:  i = 1
//                    break;
//            }
//        }
//
////Варианты ответов:
////•	Программа не скомпилируется
////•	Ничего не будет выведено на консоль
////•	Консоль будет иметь вывод:  i = 1
////•	Консоль будет иметь вывод:  i = 1, i = 2


////////////////////////////////

//// Упражнение 1
////В стране XYZ население равно 10 миллионов человек.
//// Рождаемость составляет 14 человек на 1000 человек, смертность - 8 человек.
//// Рассчитайте, какая численность населения будет через 10 лет, принимая во внимание,
//// что показатели рождаемости и смертности постоянны.
//
////Решение:
//
//        int population = 10_000_000;
//        int birthrate = 14;
//        int mortality = 8;
//        int increase = birthrate - mortality;
//        for (int i = 0; i < 10; i++) {
//            population += population * increase / 1000;
//        }
//        System.out.println(population);
//


////////////////////////////////

//// Упражнение 2
////В стране XYZ население равно 10 миллионов человек.
//// Рождаемость составляет 14 человек на 1000 человек, смертность - 8 человек.
//// Каждый год рождается и умирает на 1 человек, меньше чем в предыдущий год.
//// Рассчитайте, какая численность населения будет через 10 лет, учитывая,
//// что рождаемость не может быть меньше 7 человек на 1000 человек,
//// а смертностность не может быть меньше 6 человек на 1000 человек.
//
////Решение:
//
//        int population = 10_000_000;
//        int birthrate = 14;
//        int mortality = 8;
//        for (int i = 1; i <= 10; i++) {
//            population += population * (birthrate - mortality) / 1000;
//            if (birthrate >= 7) birthrate--;
//            if (mortality >= 6) mortality--;
//            System.out.printf("Численность населения через %d года/лет составит: %d человек\n", i, population);
//        }
//        System.out.printf("Численность населения через 10 лет составит: %d человек", population);
//
////        int population = 10000000;
////        int born = 14;
////        int death = 8;
////        for (int i = 1; i <= 10; i++) {
////            if (born > 7) born -= 1;
////            if (death > 6) death -= 1;
////            population += population * (born - death) / 1000;
////        }
////        System.out.println(population);


////////////////////////////////

//// Упражнение 3
//// За каждый месяц банк начисляет к сумме вклада 7% от суммы. Напишите консольную программу,
//// в которую пользователь вводит сумму вклада и количество месяцев.
//// А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
////Для вычисления суммы с учетом процентов используйте цикл for.
//// Пусть сумма вклада будет представлять тип float.
//
////Пример работы программы:
////Введите сумму вклада: 100
////Введите срок вклада в месяцах: 1
////После 1 месяцев сумма вклада составит 107,000000
//
////Решение:
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите сумму вклада: ");
//        float sum_vkl = in.nextInt();
//        System.out.print("Введите срок вклада в месяцах: ");
//        int months = in.nextInt();
//
//        for (int i = 0; i < months; i++) {
//            sum_vkl += sum_vkl * 0.07;
//        }
//        System.out.printf("После %d месяцев сумма вклада составит - %.2f", months, sum_vkl);
//        in.close();


////////////////////////////////

//// Упражнение 4
//// Перепишите предыдущую программу, только вместо цикла for используйте цикл while
//
////Пример работы программы:
////Введите сумму вклада: 100
////Введите срок вклада в месяцах: 1
////После 1 месяцев сумма вклада составит 107,000000
//
////Решение:
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите сумму вклада: ");
//        float sum_vkl = in.nextInt();
//        System.out.print("Введите срок вклада в месяцах: ");
//        int months = in.nextInt();
//        int count = months;
//
//        while (count > 0) {
//            sum_vkl += sum_vkl * 0.07;
//            count--;
//        }
//        System.out.printf("После %d месяцев сумма вклада составит - %.2f", months, sum_vkl);
//        in.close();


////////////////////////////////

//// Упражнение 5
////Напишите программу, которая выводит на консоль таблицу умножения
////Пример работы программы:
////1	2	3	4	5	6	7	8	9
////2	4	6	8	10	12	14	16	18
////3	6	9	12	15	18	21	24	27
////4	8	12	16	20	24	28	32	36
////5	10	15	20	25	30	35	40	45
////6	12	18	24	30	36	42	48	54
////7	14	21	28	35	42	49	56	63
////8	16	24	32	40	48	56	64	72
////9	18	27	36	45	54	63	72	81
//
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10; j++) {
////                System.out.print((i * j) + "\t");   // 1-ый способ
//                System.out.printf("%d\t", i * j);   // 2-ой способ
//            }
//            System.out.println();
//        }



////////////////////////////////

// Упражнение 6
//В цикле программа просит у пользователя ввести два числа и выводит результат их умножения.
//После вывода результата умножения программа спрашивает, надо ли завершить выполнение.
// И если пользователь введет число 1, то программа завершает цикл.
// Если введено любое другое число, то программа продолжает спрашивать у пользователя два числа и умножать их

        Scanner in = new Scanner(System.in);
        int i = 0;

        while (i != 1) {
            System.out.print("Введите первое число: ");
            int num_1 = in.nextInt();
            System.out.print("Введите второе число: ");
            int num_2 = in.nextInt();
            System.out.printf("%d * %d = %d\n", num_1, num_2, num_1 * num_2);
            System.out.print("Для выхода из программы нажмите 1. Для продолжения работы - любое другое число.\n" +
                    "Введите число: ");
            i = in.nextInt();

            if (i == 1) System.out.print("Программа завершает свою работу...");
        }
        in.close();


    }
}