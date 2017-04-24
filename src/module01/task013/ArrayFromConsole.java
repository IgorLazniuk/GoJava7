package module01.task013;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by IGOR.LAZNIUK on 20.04.2017.
 * <p>
 * Консольное приложение:
 * - ввод размера массива int
 * - ввод элементов массива
 * - меню с возможными операциями над ним:
 * - поиск чила по значению
 * - сортировка
 */
public class ArrayFromConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        System.out.print("Enter array size: ");
        int arraySize = scanner.nextInt();
        for (int i = 1; i <= arraySize; i++) {
            System.out.print("Enter array element " + i + " of " + arraySize + ": ");
            arrayList.add(scanner.nextInt());
        }
        System.out.println("Entered array:");
        System.out.println(arrayList.toString());
        System.out.println("To sort array enter - 1 to find element in array enter - 0.");
        System.out.print("Please make your choice: ");
        int scan = scanner.nextInt();
        if (scan == 1) {
            Collections.sort(arrayList);
            System.out.println("Sorted array:");
            System.out.println(arrayList.toString());

        }

        if (scan == 0) {
            System.out.print("Enter the number you are looking for in your array: ");
            scan = scanner.nextInt();
            if (arrayList.contains(scan)) {
                System.out.println("The number your are looking for is in your array with the index - " + arrayList.indexOf(scan));
            } else System.out.println("The number your are looking for is absent your array.");


        }

        scanner.close();

    }
}
