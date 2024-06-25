import java.util.logging.*;

public class Task_4 {
    public static void main(String[] args) {
/*
Логирование
--------------

Логи содержат системную информацию работы программного или аппаратного комплекса.
В них записываются действия разного приоритета от пользователя, или программного продукта.
Процесс ведения логов называют “логированием” (журналированием).

--------------------
Основы
--------------------
Использование
Logger logger = Logger.getLogger()

Уровни важности
INFO, DEBUG, ERROR, WARNING и др.

Вывод
ConsoleHandler info = new ConsoleHandler();
log.addHandler(info);

Формат вывода: структурированный, абы как*
XMLFormatter, SimpleFormatter

 */


        Logger logger = Logger.getLogger(Task_4.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
//SimpleFormatter sFormat = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
//ch.setFormatter(sFormat);
        ch.setFormatter(xml);
        logger.log(Level.WARNING, "Тестовое логирование");
        logger.info("Тестовое логирование");

    }
}
