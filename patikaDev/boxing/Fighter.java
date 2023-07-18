package boxing;
import java.util.Random;
public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Random rand = new Random();

    Fighter(String name, int health, int damage, int weight, int dodge){
        this.name = name;
        this.damage = damage;
        this.weight = weight;
        this.health = health;
        this.dodge = dodge;
    }


    int hit(Fighter oppement) {

        if(rand.nextInt(100)>=oppement.dodge){
            System.out.println(this.name + " => " + oppement.name + " " + this.damage + " damage given");
            System.out.println(oppement.name + " health is : " + (oppement.health - this.damage) + "\n");
            return oppement.health - this.damage;
        }else {
            System.out.println(this.name + " didn't hit." + oppement.name +" dodged. ");
            System.out.println(oppement.name + " health is : " + (oppement.health) + "\n");
            return oppement.health;
        }

    }

}
