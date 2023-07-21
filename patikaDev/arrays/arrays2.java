package arrays;

import java.util.Arrays;

public class arrays2 {
    public static void main(String[] args) {
        int[][] distance = {{0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}};

        System.out.println(distance.length + " " + distance[0].length);

        for (int i = 0; i < distance.length; i++) {
            for (int j = 0; j < distance[i].length; j++) {
                System.out.print(distance[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
