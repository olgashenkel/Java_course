package src;// Калькулятор
//
//Реализуйте простой калькулятор
//
//В методе calculate класса Calculator реализовать калькулятор,
// который будет выполнять математические операции (+, -, *, /)
// над двумя целыми числами и возвращать результат вещественного типа.
//
//В классе Printer необходимо реализовать проверку переданного оператора,
// при некорректном операторе программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".
//**************************************************
// Аргументы, передаваемые в метод/функцию:
// '3'
//'+'
//'7'
//************
// На выходе:
//
//
//10.0
//**************************************************


import java.io.IOException;
import java.util.Scanner;

public class DZ_3 {
    public static void main(String[] args) throws IOException {

        System.out.print("Введите операцию для выполнения (+, -, *, /): ");
        char op = (char) System.in.read();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();

        System.out.println(calculate(op, a, b));

    }

    static double calculate(char op, int a, int b) {
        double result = 0;
        switch (op) {
            case '*':
                result = a * b;
                break;
            case '/':
                result = (double) a / b;
                break;
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
        }
        return result;
    }
}



// ****************************************************
// Решение с сайта:
// class Calculator {
//    public double calculate(char op, int a, int b) {
//        // Введите свое решение ниже
//        double result = 0;
//        switch (op) {
//            case '+':
//                result = add(a, b);
//                break;
//            case '-':
//                result = minus(a, b);
//                break;
//            case '*':
//                result = mult(a, b);
//                break;
//            case '/':
//                result = divide(a, b);
//                break;
//        }
//        return result;
//    }
//
//    private double divide(int a, int b) {
//        if (b != 0)
//            return (double) a / b;
//        return -1;
//    }
//
//    private int mult(int a, int b) {
//        return a * b;
//    }
//
//    private int minus(int a, int b) {
//        return a - b;
//    }
//
//    private int add(int a, int b) {
//        return a + b;
//    }
//}
//
//// Не удаляйте этот класс!
//// Он нужен для вывода результатов на экран и проверки
//public class Printer {
//    public static void main(String[] args) {
//        int a = 0;
//        char op = ' ';
//        int b = 0;
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            a = 7;
//            op = '+';
//            b = 3;
//        } else {
//            a = Integer.parseInt(args[0]);
//            op = args[1].charAt(0);
//            b = Integer.parseInt(args[2]);
//        }
//
//        // Ниже добавить проверку оператора на корректность
//        if (op != '+' && op != '-' && op != '*' && op != '/') {
//            System.out.println("Некорректный оператор: " + op);
//            return;
//        }
//
//        Calculator calculator = new Calculator();
//        double result = calculator.calculate(op, a, b);
//        System.out.println(result);
//    }
//}
