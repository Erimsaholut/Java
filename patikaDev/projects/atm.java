package projects;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int wrongPass = 0;
        int balance = 1500;
        int userChoice = 0;
        int moneyBox;


        while (wrongPass < 3) {
            System.out.println("Enter Your User Name");
            String userName = input.nextLine();
            System.out.println("Enter Your Password");
            String password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("You are logged in");
                System.out.println("Welcome to XY Bank\nPlease select what action you want to do:");
                do {
                    System.out.println("""
                            1) Withdraw
                            2) Deposit process
                            3) Balance inquiry
                            4) Log out""");
                    userChoice = input.nextInt();

                    switch (userChoice) {
                        case 1 -> {
                            System.out.println("Enter the amount of money you want to withdraw");
                            moneyBox = input.nextInt();
                            if (moneyBox > balance) {
                                System.out.println("You haven't got $" + moneyBox);
                            } else {
                                balance -= moneyBox;
                                System.out.println("Withdraw successful");
                                System.out.println("Your remaining balance is $" + balance);
                            }
                        }
                        case 2 -> {
                            System.out.println("Enter the amount of money you want to deposit");
                            moneyBox = input.nextInt();
                            balance += moneyBox;
                            System.out.println("Deposit successful");
                            System.out.println("Your new balance is $" + balance);
                        }
                        case 3 -> System.out.println("Your balance is" + balance);
                        case 4 -> {
                            System.out.println("System closing");
                            System.out.println("Have a good day !");
                        }
                        default -> System.out.println("You entered wrong value please try again.");
                    }




                } while (userChoice != 4);


                break;
            } else {
                wrongPass++;
                System.out.println("Wrong password entered " + wrongPass + " times.");
                if (wrongPass == 3) {
                    System.out.println("Your account has been blocked. Please contact with bank.");
                } else {
                    System.out.println("You have " + (3 - wrongPass) + " change left");
                }
            }
        }

    }

}
