package loops;

import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isLogged = false;
        do{
            System.out.println("Please enter your password");
            int password = input.nextInt();
            if (password==12345)
                isLogged=true;
        }while (!isLogged);
    }
}
