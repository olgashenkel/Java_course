import java.util.Scanner;

public class Main_17 {
    public static void main(String[] args) {

// *********************************
// Java: Цикл For
// *********************************

//Цикл while идеален для ситуаций, когда количество итераций неизвестно заранее,
// например, при поиске простого числа.
//
//Когда количество итераций известно, предпочтительнее использовать цикл for.

// Посмотрим реализацию переворота строки через цикл for:
//
//public static String reverseString(String str) {
//    var result = "";
//    // Счетчик увеличивается с помощью инкремента.
//    // Об этой операции мы поговорим ниже.
//    for (var i = 0; i < str.length(); i++) {
//        result = str.charAt(i) + result;
//    }
//
//    return result;
//}
//
//Этот код можно описать так://
//Цикл с индексом i повторяется, пока i < str.length(), а также после каждого шага увеличивает i на 1
//
//В определении цикла for есть:
//
//Начальное значение счетчика. Этот код выполняется ровно один раз перед первой итерацией
//Предикат — условие повторения циклов. Выполняется на каждой итерации. Точно так же как и в while
//Описание изменения счетчика. Этот код выполняется в конце каждой итерации
//В остальном принцип работы точно такой же, как у цикла while.
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String str = in.nextLine();
        System.out.println(encrypt(str));


    }

// Задание 1.
//Сэмвелл обнаружил, что его сообщения перехватываются в замке «Близнецы» и там читаются.
// Из-за этого их атаки перестали быть внезапными. Немного подумав, он разработал программу,
// которая бы шифровала сообщения по следующему алгоритму. Она бы брала текст
// и переставляла в нем каждые два подряд идущих символа.
//
//App.encrypt("move"); // "omev"
//App.encrypt("attack"); // "taatkc"
//// Если число символов нечётное
//// то последний символ остается на своем месте
//App.encrypt("go!"); // "og!"
//Реализуйте статический метод App.encrypt(), который принимает на вход исходное сообщение
// и возвращает зашифрованное.


    public static String encrypt(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i = i + 2) {
            if (str.length() % 2 == 0) {
                result = result + str.charAt(i + 1) + str.charAt(i);
            } else {
                while (i < str.length() - 1){
                    result = result + str.charAt(i + 1) + str.charAt(i);
                    i = i + 2;
                }
                result = result + str.charAt(i);
            }
        }
        return result;
    }


// Решение с сайта:

//public static String encrypt(String str) {
//    // BEGIN
//    var result = "";
//    for (var i = 0; i < str.length(); i += 2) {
//        var nextSymbol = (i + 2 > str.length()) ? "" : str.charAt(i + 1);
//        result = result + nextSymbol + str.charAt(i);
//    }
//
//    return result;
//    // END
//}
}
