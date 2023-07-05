package projects;
import java.util.Scanner;

public class TaxiMeter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float priceByKm = 2.20f,price;
        int openingPrice = 10;

        System.out.print("Enter your distance: ");
        int km = input.nextInt();

        price = openingPrice + priceByKm*km;
        if(price<=20){
            System.out.println("Price: 20");
        }else {
            System.out.println("Price: " + price);
        }



    }
}
