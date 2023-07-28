package praduationProject;

public class MineSwapper {
    int rowNumber;
    int colNumber;


    public MineSwapper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
    }

    void run() {

        char[][] myArea = new char[rowNumber + 1][colNumber + 1];

        for (int i = 0; i < rowNumber + 1; i++) {
            for (int j = 0; j < colNumber + 1; j++) {
                if (i == 0) {
                    myArea[i][j] = (char) (j+48);
                } else if (j == 0) {
                    myArea[i][j] = (char) (i+48);
                } else {
                    myArea[i][j] = '-';
                }

            }
        }

        //[a 1 2 3 4] [b 1 2 3]

        // a b b b b
        // a 1 2 3 4
        // a 1 2 3 4
        // a 1 2 3 4


        for (int j = 0; j < rowNumber + 1; j++) {
            for (int i = 0; i <= colNumber + 1; i++) {
                System.out.print(myArea[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}