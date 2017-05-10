package module013;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by IGOR.LAZNIUK on 10.05.2017.
 */
public class Game {

    public static void start() {
        System.out.println("Game Started!!!");
        printField();
        while (CheckGame() == ' ' && canMove()) {
            humanMove();
            compMove();
            printField();
        }
        if (CheckGame() == 'X') {
            System.out.println("YOU WIN!");
        }
        if (CheckGame() == '0') {
            System.out.println("YOU LOSE!");
        }
        if (CheckGame() == ' ' && !canMove()) {
            System.out.println("STANDOFF!");
        }

    }

    public static void humanMove() {
        Scanner scanner = new Scanner(System.in);

        int x, y;
        System.out.println("Enter y (1..3):");

        x = Integer.parseInt(scanner.nextLine()) - 1;
        System.out.println("Enter x (1..3):");
        y = Integer.parseInt(scanner.nextLine()) - 1;
        while (Field.field[x][y] == '0' || Field.field[x][y] == 'X' || x < 0 || x > 2
                || y < 0 || y > 2) {
            System.out.println("Enter x:");
            x = Integer.parseInt(scanner.nextLine()) - 1;
            System.out.println("Enter y:");
            y = Integer.parseInt(scanner.nextLine()) - 1;
        }
        Field.field[x][y] = 'X';
    }

    public static void compMove() {
        int x = (int) (Math.random() * 3), y = (int) (Math.random() * 3);
        while (Field.field[x][y] == '0' || Field.field[x][y] == 'X') {
            x = (int) (Math.random() * 3);
            y = (int) (Math.random() * 3);
        }
        Field.field[x][y] = '0';
    }

    public static boolean canMove() {
        boolean p = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Field.field[i][j] == '+') {
                    p = true;
                    break;
                }
            }
            if (p = true) {
                break;
            }
        }
        return p;
    }

  public static void printField() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Field.field[i][j]);
            }
            System.out.println();
        }
    }

    public static char CheckGame() {
        char winner = ' ';
        // Horizontal Check
        for (int i = 0; i < 3; i++) {
            if (Field.field[i][0] == Field.field[i][1] && Field.field[i][1] == Field.field[i][2]
                    && Field.field[i][0] != '+') {
                winner = Field.field[i][0];
                break;
            }
        }

        // Vertical Check
        if (winner == ' ') {
            for (int i = 0; i < 3; i++) {
                if (Field.field[0][i] == Field.field[1][i] && Field.field[1][i] == Field.field[2][i]
                        && Field.field[0][i] != '+') {
                    winner = Field.field[0][i];
                    break;
                }
            }
        }

        // Right Diagonal Check
        if (winner == ' ') {
            if (Field.field[0][0] == Field.field[1][1] && Field.field[1][1] == Field.field[2][2]
                    && Field.field[0][0] != '+') {
                winner = Field.field[0][0];
            }
        }

        // Left Diagonal Check
        if (winner == ' ') {
            if (Field.field[0][2] == Field.field[1][1] && Field.field[1][1] == Field.field[2][0]
                    && Field.field[0][2] != '+') {

                winner = Field.field[0][2];
            }
        }
        return winner;
    }
}


