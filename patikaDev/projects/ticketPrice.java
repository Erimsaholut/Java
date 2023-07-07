package projects;

import java.util.Scanner;

public class ticketPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km, age, type,price,discount = 0;
        System.out.println("Please enter your travel distance as a km:");
        km = input.nextDouble();
        System.out.println("Please enter the age of passenger:");
        age = input.nextInt();
        System.out.println("Please enter your trip type (1 for one way ticket 2 for round trip):");
        type = input.nextInt();

        if (km >= 0 && age >= 0 && (type == 1 || type == 2)){
            price =(km*0.10);

            if (age < 12){
                price *= 0.50;
            }else if(age<24){
                price *= 0.90;
            }else if (age>65){
                price *= 0.70;
            }

            if(type==2){
                price *= 1.6;
            }

            System.out.println("Your price is"+( price)+ "₺");

        }else {
            System.out.println("You entered invalid value !");
        }






    }
}
