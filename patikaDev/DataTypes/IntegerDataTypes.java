package DataTypes;

public class IntegerDataTypes {
    public static void main(String[] args) {
        byte myByte = 100;          //8 bit uzunluğunda      max 127 min -128 değerlerini alır.
        short myShort = 31000;      //16 bit uzunluğunda     max 32,767 min -32,768 değerlerini alır.
        int myInt = 2147483647;     //32 bit uzunluğunda     max 2,147,483,647 min -2,147,483,648 değerlerini alır.
        long myLong = 1234567891;          //64 bit uzunluğunda     her bir şeyi alıyor bu

        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
    }
}
