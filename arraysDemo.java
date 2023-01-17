public class arraysDemo {
    public static void main(String[] args) {
        String myName = "Erim";
        //System.out.println(myName);

        String[] names = {"Ali", "Bugra", "Ceylin", "Deniz"};  //String names[] also works

        for (int i = 0; names.length > i; i++) {
            System.out.println(names[i]);
        }

        System.out.println("------------------");

        for (String name:names) {   //name in names
            System.out.println(name);
        }

        System.out.println("------------------");

        double[] mylist;


    }
}
