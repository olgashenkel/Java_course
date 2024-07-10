// Задача № 2.
// Написать программу, определяющую правильность расстановки скобок в выражении.
//Пример 1: a+(d*3) - истина
//Пример 2: [a+(1*3) - ложь
//Пример 3: [6+(3*3)] - истина
//Пример 4: {a}[+]{(d*3)} - истина
//Пример 5: <{a}+{(d*3)}> - истина
//Пример 6: {a+]}{(d*3)} - ложь


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Task_3 {
    public static void main(String[] args) {

        String[] str = {"a+(d*3)", "[a+(1*3)", "[6+(3*3)] ", "{a}[+]{(d*3)}", "<{a}+{(d*3)}>", "{a+]}{(d*3)}"};

        for (String string : str) {
            boolean isValid = isBracketsCorrect(string);
            System.out.println(string + " --> "+ isValid);
        }
    }

    public static Map<Character, Character> getBrecketsMap() {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');
        brackets.put('>', '<');

        return brackets;
    }


    public static boolean isBracketsCorrect(String expression) {
        Map<Character, Character> brackets = getBrecketsMap();

        Stack<Character> stack = new Stack<>(); // создаем Stack для хранения открывающих скобок
        for (Character c : expression.toCharArray()) {
            if (brackets.containsValue(c)) {
                stack.push(c);
            } else if (brackets.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
