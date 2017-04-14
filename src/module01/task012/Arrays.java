package module01.task012;

/**
 * Created by IGOR.LAZNIUK on 14.04.2017.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Number " + i + " of 5: ");
            list.add(scanner.nextInt());

        }
        System.out.println("Initial array: " + list.toString());
        Collections.sort(list);
        System.out.println("Sorted array: " + list.toString());


    }
}
