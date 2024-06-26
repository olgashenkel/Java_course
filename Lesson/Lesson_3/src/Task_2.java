public class Task_2 {
    public static void main(String[] args) {
/*
Чем меньше преобразований из Object или в Object, тем выше производительность (тем быстрее выполняется код)
!!! Использовать упаковку и распаковку (Object) желательно в очень крайнем случае!!!
 */
        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.0, 2));
        System.out.println(Sum(1, 2.0));
        System.out.println(Sum(1.2, 2.1));
    }

    static Object Sum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double) {   // если a instanceof (принадлежит) типу Double и b instanceof (принадлежит) типу Double, то
            return (Object) ((Double) a + (Double) b);
        } else if (a instanceof Integer && b instanceof Integer) {   // если a instanceof (принадлежит) типу Integer и b instanceof (принадлежит) типу Integer, то
            return (Object) ((Integer) a + (Integer) b);
        } else return 0;
    }

}
