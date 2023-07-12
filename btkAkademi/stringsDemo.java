public class stringsDemo {
    public static void main(String[] args) {
        String message = "The weather is nice today";
        System.out.println(message);
        System.out.println("char amount: " + message.length());

        System.out.println("4th character: " + message.charAt(4));
        // charAt shows character by index

        System.out.println(message.concat(". Hurrah!"));
        // concat concatenates two strings

        System.out.println("------------------------------");

        System.out.println(message.startsWith("B"));
        System.out.println(message.startsWith("T"));
        System.out.println(message.endsWith("B"));
        System.out.println(message.endsWith("y"));
        // these two commands checking the string starts or ends with this character

        char[] myChars = new char[20];
        message.getChars(0, 17, myChars, 3);
        System.out.println(myChars);
        // getChars(startGeting,enGetting,saveHere,startSavingİndex)

        System.out.println("------------------------------");

        System.out.println(message.indexOf("d"));
        System.out.println(message.indexOf("day"));
        System.out.println(message.indexOf("m"));
        System.out.println(message.lastIndexOf('r'));
        //Returns the index of the first occurrence of the specified character.
        //if this character does not exit in array, code returns -1.


        String newMessage = message.replace(' ','_');
        System.out.println(newMessage);
        // its name explains itself

        System.out.println(message.substring(4));
        System.out.println(message.substring(4,14));
        // write in this range

        System.out.println("------------------------------");

        for (String kelime:message.split(" "))
            System.out.println(kelime);

        System.out.println("------------------------------");

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        String space = "   The space is nice today.   ";
        System.out.println(space.trim());
    }
}