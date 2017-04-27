package module012.task121;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by IGOR.LAZNIUK on 24.04.2017.
 */
public class ArrayHolder {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> arrayList = new ArrayList<>();


    ArrayList creator(int arraySize) {
arrayList.clear();
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter element " + i + " of " + arraySize + ": ");
            arrayList.add(i, scanner.nextLine());
        }
        return arrayList;
    }

    int search() {
        System.out.println("Метод search выполнен");
        return 0;
    }

    ArrayList sort(ArrayList arrayList) {
        Collections.sort(arrayList);
        return arrayList;
    }


}
