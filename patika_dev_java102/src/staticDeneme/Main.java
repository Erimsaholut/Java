package staticDeneme;

public class Main {
    public static void main(String[] args) {

        Player p1, p2, p3;

        p1 = new Player("Süleyman Çakır", 98);
        System.out.println(p1.counter);
        System.out.println(p1.staticCounter);
        System.out.println(Player.staticCounter);

        System.out.println("##########");

        p2 = new Player("Polat Alemdar", 98);
        System.out.println(p2.counter);
        System.out.println(p2.staticCounter);
        System.out.println(Player.staticCounter);

        System.out.println("##########");

        p3 = new Player("Memati Baş", 98);
        System.out.println(p3.counter);
        System.out.println(p3.staticCounter);
        System.out.println(Player.staticCounter);

        System.out.println("##########");

        System.out.println(isStaticVariableExitsWhenNobodyCallsIt.myStaticVariable);
        isStaticVariableExitsWhenNobodyCallsIt.isItAlsoTrueForFunctions();


        isStaticVariableExitsWhenNobodyCallsIt.myStaticVariable = "I changed it";
        System.out.println(isStaticVariableExitsWhenNobodyCallsIt.myStaticVariable);

        Kitap book = new Kitap("Harry Potter", 500, "JK Rowling");
    }
}
