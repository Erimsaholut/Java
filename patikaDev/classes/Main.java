package classes;

public class Main {
    public static void main(String[] args) {

        Car audi = new Car("Sedan", "Audi",  20, 280);
        audi.printSpeed();
        audi.increaseSpeed(120);
        audi.printSpeed();


        Car mercedes = new Car("Sedan", "Mercedes", 120, 300);
        mercedes.speed = 180;
        mercedes.printSpeed();
        mercedes.decreaseSpeed(200);
        mercedes.printSpeed();


    }
}
