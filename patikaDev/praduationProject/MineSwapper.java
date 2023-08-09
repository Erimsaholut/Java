package praduationProject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSwapper {
    int rowNumber;
    int colNumber;

    public MineSwapper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
    }


    void run() {
        char[][] myArea = new char[rowNumber + 1][colNumber + 1];
        int tileCount = (rowNumber * colNumber);
        int bombCount = tileCount / 4;
        int[][] bombLocations = new int[bombCount][2];
        Scanner input = new Scanner(System.in);
        boolean isGameRunning = true;
        Random random = new Random();
        int userFound = 0;


        //Make pattern
        for (int i = 0; i < rowNumber + 1; i++) {
            for (int j = 0; j < colNumber + 1; j++) {
                if (i == 0) {
                    myArea[i][j] = (char) (j + 48);
                } else if (j == 0) {
                    myArea[i][j] = (char) (i + 48);
                } else {
                    myArea[i][j] = '-';
                }
            }
        }
        //Define bombs
        for (int i = 0; i < bombCount; ) {
            int x = random.nextInt(colNumber) + 1;
            int y = random.nextInt(rowNumber) + 1;

            for (int j = 0; j < bombCount; j++) {
                if (bombLocations[j][0] == y && bombLocations[j][1] == x) {
                    break;
                } else if (j == bombCount - 1) {
                    bombLocations[i][0] = y;
                    bombLocations[i][1] = x;
                    i++;
                }
            }

        }

        //print bombs Locations
        /*
        System.out.print("\nBomb locs\n");
        for (int i = 0; i < bombCount; i++) {
            System.out.print(bombLocations[i][0]);
            System.out.print(bombLocations[i][1]);
            System.out.print("\t");
        }
        */

        while (isGameRunning) {
            System.out.println();
            printPattern(myArea);
            int bombAround = 0;
            int userY;
            int userX;

            //user select
            do {
                System.out.println("\nLütfen Satır Seçiniz");
                userY = input.nextInt();
                System.out.println("Lütfen Sütun Seçiniz");
                userX = input.nextInt();
                if ((userX <= 0 || userX > colNumber) || (userY <= 0 || userY > rowNumber)) {
                    System.out.println("Lütfen bölgenin dışındaki değerleri seçmeyiniz");
                    printPattern(myArea);
                }

            } while (
                    (userX <= 0 || userX > colNumber)
                            ||
                            (userY <= 0 || userY > rowNumber)
            );


            // is exploded
            for (int i = 0; i < bombCount; i++) {
                if (userY == bombLocations[i][0] && userX == bombLocations[i][1]) {
                    System.out.println("BOOOOOOOOOOOOMM");
                    isGameRunning = false;
                    myArea[userY][userX] = '*';
                    printPattern(myArea);
                    break;
                }
            }

            if (myArea[userY][userX] != '-') {
                System.out.println("You already selected here");
            }else {
                //if not find bomb count around the selection
                for (int i = -1; i < 2; i++) {
                    for (int j = -1; j < 2; j++) {
                        for (int k = 0; k < bombCount; k++) {
                            if (((userY + j) == bombLocations[k][0]) && ((userX + i) == bombLocations[k][1])) {
                                bombAround++;
                            }
                        }
                    }
                }

                myArea[userY][userX] = (char) (bombAround + 48);
                userFound++;
            }

            if (userFound == (tileCount - bombCount)) {
                printPattern(myArea);
                System.out.println("Oyunu Kazandınız Tebrikler !!! ");
                isGameRunning = false;

            }


        }
    }


    void printPattern(char[][] myArea) {

        //Print pattern
        for (int i = 0; i < rowNumber + 1; i++) {
            for (int j = 0; j < colNumber + 1; j++) {
                System.out.print(myArea[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }


}