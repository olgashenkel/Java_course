package src;// Задание №1+
//В консоли запросить имя пользователя. В зависимости от
//текущего времени, вывести приветствие вида
//"Доброе утро, <Имя>!", если время от 05:00 до 11:59
//"Добрый день, <Имя>!", если время от 12:00 до 17:59;
//"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//"Доброй ночи, <Имя>!", если время от 23:00 до 4:59

import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var today = new Date();
        var hours = today.getHours();
        System.out.print("Введите ваше имя: ");
        String name = in.nextLine();

        if (hours > 5 && hours < 12) {
            System.out.printf("\nДоброе утро, %s!", name);
        } else if (hours > 12 && hours < 18) {
            System.out.printf("\nДобрый день, %s!", name);
        } else if (hours > 18 && hours < 23) {
            System.out.printf("\nДобрый вечер, %s!", name);
        } else {
            System.out.printf("\nДоброй ночи, %s!", name);
        }
    }
}