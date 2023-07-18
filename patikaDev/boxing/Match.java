package boxing;

import java.util.List;
import java.util.Random;

public class Match {

    Random rand = new Random();
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            boolean f1First = rand.nextBoolean(); // Rastgele sıra belirleme
            Fighter firstFighter;
            Fighter secondFighter;

            if (f1First) {
                firstFighter = f1;
                secondFighter = f2;
            } else {
                firstFighter = f2;
                secondFighter = f1;
            }

            while (firstFighter.health > 0 && secondFighter.health > 0) {
                secondFighter.health = firstFighter.hit(secondFighter);
                if (isWin()) {
                    break;
                }

                firstFighter.health = secondFighter.hit(firstFighter);
                if (isWin()) {
                    break;
                }
            }
        } else {
            System.out.println("Weights are not compatible");
        }
    }

    boolean isCheck() {
        return (this.f1.weight > minWeight && this.f1.weight < maxWeight && this.f2.weight > minWeight && this.f2.weight < maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(f2.name + " Win");
            return true;
        } else if (this.f2.health == 0) {
            System.out.println(f1.name + " Win");
            return true;
        } else {
            return false;
        }
    }


}
