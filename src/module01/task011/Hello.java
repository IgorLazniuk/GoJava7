package module01.task011;

import java.util.Scanner;

/**
 * Created by IGOR.LAZNIUK on 14.04.2017.

 Создать консольное приложение, которое запрашивает имя пользователя. После ввода имени выводит строку: Hello, <введённое имя>
 Пример:
 Enter Your name:
 Eugene
 Hello, Eugene
 */

public class Hello {
    public static void main(String[] args) {
        System.out.print("Enter Your name: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, " + scanner.next());
        //сканнер закрой
        scanner.close();

    }
}
