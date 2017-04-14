package module01.task011;

import java.util.Scanner;

/**
 * Created by IGOR.LAZNIUK on 14.04.2017.
 */
public class Hello {
    public static void main(String[] args) {
        System.out.print("Enter Your name: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, " + scanner.next());

    }
}
