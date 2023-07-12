import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Akhisar");
        cities.add("İzmir");
        cities.add("Ankara");
        cities.add("bursa");
        cities.remove("Ankara");
        Collections.sort(cities);

        for(String city:cities){
            System.out.println(city);
        }

    }
}