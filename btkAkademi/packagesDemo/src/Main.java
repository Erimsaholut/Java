import math.Operations;
import math.Power;
// import math.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's ur name ?");

        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        Operations operations = new Operations();
        Power power = new Power();
        System.out.println(power.logarithmCalc(3, 4));



    }
}