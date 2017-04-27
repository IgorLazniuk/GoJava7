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


        menu();
        while (!input.equals("q")) {
            input = scanner.nextLine();
            switch (input) {

                case "0": {
                    arrayHolder.creator();
                    break;
                }

                case "1": {
                    arrayHolder.sort();
                    break;
                }

                case "2": {
                    arrayHolder.search();
                    break;
                }

                default: {
                    break;
                }

            }

        }

    }

    static void menu() {
        System.out.println("To enter NEW array press - 0");
        System.out.println("To sort array press - 1");
        System.out.println("To find array element index press - 2");
        System.out.println("To quit press - q");
        System.out.print("Make your choice: ");

    }
}
