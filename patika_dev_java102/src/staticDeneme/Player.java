package staticDeneme;

public class Player {
    public String name;
    public int idNo;

    public static int staticCounter = 0;
    public int counter = 0;

    public Player(String name, int idNo) {
        this.name = name;
        this.idNo = idNo;
        this.counter++;
        this.staticCounter++;
    }
}
