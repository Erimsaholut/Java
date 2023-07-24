package arrays;

public class writeLetter {
    public static void main(String[] args) {

        String[][] letter = new String[6][4];

        for (int i = 0; i < letter.length; i++) {

            for (int j = 0; j < letter[i].length; j++) {

                if (i == 0 || i == 2) {
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }

        for (String[] i : letter) {
            for (String j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("\n##################\n");


        String[][] letter2 = new String[7][5];

        for (int i = 0; i < letter2.length; i++) {

            for (int j = 0; j < letter2[i].length; j++) {

                if ((i == 0 || i == 3 || i == 6)) {
                    if (j == 4) {
                        letter2[i][j] = "   ";
                    } else {
                        letter2[i][j] = " * ";
                    }

                } else if ((j == 0 || j == 3 || j == 4)) {
                    if (j == 3){
                        letter2[i][j] = "   ";
                    }else {
                        letter2[i][j] = " * ";
                    }

                } else {
                    letter2[i][j] = "   ";
                }
            }
        }


        for (String[] i : letter2) {
            for (String j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("\n##################\n");


    }
}