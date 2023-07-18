package boxing;


public class Main {
    public static void main(String[] args) {


        Fighter f1 = new Fighter("Ahmet", 120, 10, 100, 30);
        Fighter f2 = new Fighter("Muhammed", 130, 8, 100, 40);

        Match match = new Match(f1, f2, 90, 110);
        match.run();
    }
}
