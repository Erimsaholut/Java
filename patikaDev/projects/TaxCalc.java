package projects;
import java.util.Scanner;

public class TaxCalc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter the price of the product: ");
        double price = input.nextDouble();

        System.out.println("Price without taxes: "+price);
        System.out.println("Price with taxes: "+price*1.18);
        System.out.println("Taxes: "+price*0.18);

    }
}
