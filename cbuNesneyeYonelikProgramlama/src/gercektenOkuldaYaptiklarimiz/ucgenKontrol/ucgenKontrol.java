package gercektenOkuldaYaptiklarimiz.ucgenKontrol;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ucgenKontrol {


    public static void main(String[] args) {
        Double birinci;
        Double ikinci;
        Double ucuncu;
        System.out.println("Ucgenin 1. kenarını giriniz.");
        birinci = TakeAnswer.takeAnswerDouble();
        System.out.println("Ucgenin 2. kenarını giriniz.");
        ikinci = TakeAnswer.takeAnswerDouble();
        System.out.println("Ucgenin 3. kenarını giriniz.");
        ucuncu = TakeAnswer.takeAnswerDouble();

        if (birinci>=(ikinci+ucuncu)&&birinci<=(ikinci-ucuncu)){
            System.out.println("Aaaaa");
        }

    }


}

