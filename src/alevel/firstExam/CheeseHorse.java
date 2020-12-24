/*Ход коня по шахматной доске.
Вводится текущее положение коня и клетка
в которую пробуют его передвинуть за 1 ход.
Программа должна проверить, возможно ли это сделать.*/


package alevel.firstExam;

import java.util.Scanner;

public class CheeseHorse {

    public static void main(String[] args) {


        movement(inputStart(), inputFinal());



    }

    public static char[] inputStart(){
        char[] inputPosition = new char[2];
        String input;
        char startPositionX;
        char startPositionY;
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("введите начальное положение коня: ");

            input = scanner.nextLine();
            startPositionY = input.charAt(0);
            startPositionX = input.charAt(1);
            if (startPositionX < '1' ||
                    startPositionX > '8' ||
                    startPositionY < 'A' ||
                    startPositionY > 'H')
                System.out.println("Неправильное значение");
            else break;
        }
        inputPosition[0] = startPositionY;
        inputPosition[1] = startPositionX;
        return inputPosition;
    }

    public static char[] inputFinal(){
        char[] inputPosition = new char[2];
        String input;
        char finalPositionX;
        char finalPositionY;
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("введите конечное положение коня: ");

            input = scanner.nextLine();
            finalPositionY = input.charAt(0);
            finalPositionX = input.charAt(1);
            if (finalPositionX < '1' ||
                    finalPositionX > '8' ||
                    finalPositionY < 'A' ||
                    finalPositionY > 'H')
                System.out.println("Неправильное значение");
            else break;
        }
        inputPosition[0] = finalPositionY;
        inputPosition[1] = finalPositionX;
        return inputPosition;
    }
    public static void movement(char[] startPos, char[] finalPos){

        int moveY;
        int moveX;

        moveX = ((finalPos[1] - startPos[1]) >= 0) ? (finalPos[1] - startPos[1]) : -(finalPos[1] - startPos[1]);
        moveY = ((finalPos[0] - startPos[0]) >= 0) ? (finalPos[0] - startPos[0]) : -(finalPos[0] - startPos[0]);

        if (moveX == 1 || moveY == 2)
            System.out.println("Так ходить можно");
        else if (moveX == 2 || moveY == 1)
            System.out.println("Так ходить можно");
        else System.out.println("Так ходить нельзя");


    }
}
