// Stack
// *****************
// Stack и Vector не рекомендованы к использованию!!!

// Stack представляет собой обработку данных по принципу LIFO.
//Расширяет Vector пятью операциями, которые позволяют рассматривать
//вектор как стек.
//push(E item)
//pop()

// Современные программисты сейчас практически не используют Stack, который слишком прост и не очень гибок.
// Тем не менее, изучить его стоит, может именно он вам и пригодится.
//
//Stack является подклассом класса Vector, который реализует простой механизм типа
// "последний вошёл - первый вышел" (LIFO). Можно представить процесс в виде детской пирамидки,
// когда вы по одному нанизываете диск на колышек. И снять диски вы сможете только по порядку, начиная с верхнего.

// Внутри наших методов вызываются методы класса Stack:
//push() — добавляет элемент на верх стека. Когда мы отправляем карту в сброс,
//          она ложится поверх сброшенных ранее карт;
//pop() — удаляет верхний элемент из стека и возвращает его.
//          Этот метод идеально подходит для реализации механики “игрок берет карту”
//peek() — возвращает верхний элемент стека, но не удаляет его из стека

import java.util.Stack;


public class Task_4 {

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {

//        Stack<Integer> stack = new Stack<>();
//        stack.push(1); // Метод push() помещает объект в стек.
//        stack.push(12);
//        stack.push(123);
//        System.out.println(stack);
//        System.out.println(stack.pop()); // 123 // // Метод pop() вытаскивает объект из стека.
//        System.out.println(stack.pop()); // 12
//        System.out.println(stack.pop()); // 1


        // Вычислить значение выражения в постфиксной форме записи
        //1 + 2 * 3 (1 + 2) * 3
        //1 2 3 * + 1 2 + 3 *
        // * +
        // СТЕК
        // 3
        // 2
        // 1

        // СТЕК
        // 3 * 2
        // 1

        // СТЕК
        // 6 + 1 -> 7

//        var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
        //var exp = "20 30 - 10 *".split(" "); // (20-30)*10
        var exp = "1 2 - 3 *".split(" "); // (1 + 2) * 3


        int res = 0;
        System.out.println(exp);

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < exp.length; i++) {
        if (isDigit(exp[i])) {
                st.push(Integer.parseInt((exp[i])));
            }
            else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res = st.pop() / st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());
    }
}
