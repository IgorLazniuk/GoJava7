package module012.task121;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by IGOR.LAZNIUK on 24.04.2017.
 */
public class ConsoleHelper {


    void run() {
        String input = "";
        ArrayHolder arrayHolder = new ArrayHolder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("To quit press - q");
        System.out.println("To continue press any key");


        while (!input.equals("q")) {
            input = scanner.nextLine();
            switch (input) {
                case "0": {
                    System.out.print("Enter array size: ");
                    input = scanner.nextLine();
                    if (input.matches("3")) {
                        arrayHolder.creator(Integer.valueOf(input));
                        System.out.println("Entered array:");
                        System.out.println(arrayHolder.arrayList);
                    }

                    else {
                        ConsoleHelper.menu();
                    }

                    break;
                }
                case "1": {
                    arrayHolder.sort(arrayHolder.arrayList);
                    System.out.println("Sorted array:");
                    System.out.println(arrayHolder.arrayList);
                    break;
                }
                default: {
                    ConsoleHelper.menu();
                }
            }

        }

    }

    static void menu() {
        System.out.println();
        System.out.println("To enter NEW array press - 0");
        System.out.println("To sort array press - 1");
        System.out.println("To find array element index press - 2");
        System.out.println("To quit press - q");
        System.out.println();
        System.out.print("Make your choice: ");

    }
}
