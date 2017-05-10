package module012.task121;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by IGOR.LAZNIUK on 24.04.2017.
 */
public class ArrayHolder {
    Scanner scanner = new Scanner(System.in);
   private ArrayList<String> arrayList = new ArrayList<>();

    void creator() {
        arrayList.clear();
        System.out.print("Enter array size: ");
        String input = scanner.nextLine();
        if (input.matches("[0-9]*")) {
            for (int i = 0; i < Integer.valueOf(input); i++) {
                System.out.print("Enter element " + i + " of " + input + ": ");
                arrayList.add(i, scanner.nextLine());
            }
            System.out.println("Entered array:");
            System.out.println(arrayList);



        }
    }

    void search() {
        System.out.print("Enter element your are looking for: ");
        String input = scanner.nextLine();
        if (arrayList.contains(input)) {
            System.out.println("The number your are looking for is in your array with the index - " + arrayList.indexOf(input));
        } else System.out.println("The number your are looking for is absent your array.");


    }

    void sort() {
        Collections.sort(arrayList);
        System.out.println("Sorted array:");
        System.out.println(arrayList);

    }


}
