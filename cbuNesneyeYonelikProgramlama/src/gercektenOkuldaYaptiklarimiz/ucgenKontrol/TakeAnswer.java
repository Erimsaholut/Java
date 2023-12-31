package gercektenOkuldaYaptiklarimiz.ucgenKontrol;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TakeAnswer {

    private static final Scanner input = new Scanner(System.in);

    public static double takeAnswerDouble() {
        double result = 0.0;
        try {
            System.out.println("Lütfen deger giriniz");
            result = input.nextDouble();

        } catch (InputMismatchException e) {
            System.out.println("YanlisDegerGirdiniz");
            result = takeAnswerDouble();
        }
        return result;
    }


}
