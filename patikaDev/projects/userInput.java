package projects;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName,password;
        System.out.println("Username : ");
        userName = input.nextLine();

        System.out.println("Password : ");
        password = input.nextLine();

        if(userName.equals("erimsah")&& password.equals("java123")){
            System.out.println("Login successful ");
        }
        else {
            System.out.println("Wrong username or password");
        }

    }

}
