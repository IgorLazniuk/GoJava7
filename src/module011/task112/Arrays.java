package module011.task112;

/**
 * Created by IGOR.LAZNIUK on 14.04.2017.
 *
 Создать консольное приложение, которое просит пользователя ввести из консоли 5 чисел
 Все числа должны быть записаны в массив целых чисел.
 После этого, массив должен быть отсортирован по возрастанию и выведен консоль.
 Сначала начальная версия, далее - отсортированная.
 Пример:
 Enter number 1:5
 Enter number 2:4
 Enter number 3: 3
 Enter number 4: 2
 Enter number 5: 1
 Initial array: 5, 4, 3, 2, 1
 Sorted array: 1, 2, 3, 4, 5.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Когда используешь класс обертку в коллекции, указывай явно её при инициализации в дженерике
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Number " + i + " of 5: ");
            list.add(scanner.nextInt());
        }
        //сканнер закрой
        scanner.close();
        System.out.println("Initial array: " + list.toString());
        Collections.sort(list);

        System.out.println("Sorted array: " + list.toString());


    }
}
