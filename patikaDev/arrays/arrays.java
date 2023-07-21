package arrays;

import java.util.List;

public class arrays {
    public static void main(String[] args) {
        int[] list = new int[10];


        for (int i = 0; i < list.length; i++) {
            list[i] = (i * 10) + 10;
            System.out.println(list[i]);
        }

        System.out.println("*#*#*#*#*#*#*#*#*#*#*#*#*");
        int[] kist = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};

        for (int j : kist) {
            System.out.println(j);
        }

        String[] days = {"Sunday","Monday","Tuesday"};
        String[] weekendDays = new String[]{"Friday","Saturday"};

        System.out.println(days.length);

        for(int i = 0;3>i;i++){
            System.out.println(days[i]);
        }


        int cars[], count=3;

        cars = new int[count];

        for(int i=0; i<cars.length; i++)

            cars[i] = (i+1)*2;

        for(int j=0; j<cars.length; j++)

            System.out.print(cars[j] + ",");




    }
}
