package packages;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        System.out.println(Math.pow(5, 2));
        System.out.println(Math.abs(-5));
        System.out.println(Math.cos(180));
        System.out.println(Math.log(2.71));
        System.out.println(Math.log10(100));
        System.out.println(Math.round(3.49));
        System.out.println(Math.round(3.51));

        String myString = "Mustafa Kemal Paşa  ";
        System.out.println(myString.charAt(2));
        System.out.println(Arrays.toString(myString.getBytes()));
        System.out.println(myString.concat(" Hazretleri"));
        System.out.println(myString.contains("aşa"));
        System.out.println(myString.replace("a", "_ß"));
        System.out.println(myString.startsWith("M"));
        System.out.println(myString.substring(8, 13));
        System.out.println(myString.trim());            // sağındaki solundaki boşlukları siliyor.


    }
}
