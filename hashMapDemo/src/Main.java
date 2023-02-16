import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> dictionary= new HashMap<String,String>();
        HashMap<String, String> dict = dictionary;

        dict.put("Book","Kitap");
        dict.put("Computer","Bilgisayar");
        dict.put("Dictionary","Sözlük");
        System.out.println(dict);

        System.out.println(dict.size());

        System.out.println("---------------");

        for(String key:dict.keySet())
            System.out.println(key);

        for(String value:dict.values())
            System.out.println(value);

        for(String item:dict.keySet())
            System.out.println("Key item: "+item+" Value: "+dict.get(item));



        System.out.println("---------------");

        //dict.clear();
        dict.remove("Book");
        System.out.println(dict.get("Book"));

    }
}