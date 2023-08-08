package praduationProject;

import java.util.Random;

public class MineSwapper {
    int rowNumber;
    int colNumber;

    public MineSwapper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
    }



    void run() {
        Random random = new Random();
        int bombCount = (rowNumber * colNumber) / 4;

        char[][] myArea = new char[rowNumber + 1][colNumber + 1];
        int[][] bombLocations = new int[bombCount][2];

        boolean isGameRunning = true;

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
        printPattern(myArea);


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
        System.out.print("\nBomb locs\n");
        for (int i = 0; i < bombCount; i++) {
            System.out.print(bombLocations[i][0]);
            System.out.print(bombLocations[i][1]);
            System.out.print("\t");
        }

        while (isGameRunning){
            if (guessNum()){

            }else {
                isGameRunning = false;
            }


        }

    }


    void printPattern(char[][] myArea){

        //Print pattern
        for (int i = 0; i < rowNumber + 1; i++) {
            for (int j = 0; j < colNumber + 1; j++) {
                System.out.print(myArea[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    boolean guessNum(){
        System.out.println("Sor soru ");
        return true;
    }


}