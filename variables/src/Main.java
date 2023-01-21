public class Main {
    public static void main(String[] args) {
        int number = 10;
        String message = "Number is -> ";
        byte maks = 127;
        double dabil = 31.3; //mostly its using more than float in java
        char harf = 'a';
        boolean doru = true;
        boolean yannis = false;
        // System.out.println(message + number);
        if (maks == number)
            System.out.println("maks and number is equal");

        else if (maks>number)
            System.out.println("Maks is bigger");

        else
            System.out.println("number is bigger");

        if (dabil>=22){
            System.out.println("Abi");
        }
    }

}
