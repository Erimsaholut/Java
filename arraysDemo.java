public class arraysDemo {
    public static void main(String[] args) {
        String myName = "Erim";
        //System.out.println(myName);

        String[] names = {"Ali", "Bugra", "Ceylin", "Deniz"};  //String names[] also works

        for (int i = 0; names.length > i; i++) {
            System.out.println(names[i]);
        }

        System.out.println("------------------");

        for (String name : names) {   //name in names
            System.out.println(name);
        }

        System.out.println("------------------");

        double[] mylist = {1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 9.0};
        double total = 0;
        double maks = mylist[0];

        for (double number : mylist) {                //for(number in mylist ) print(number)
            System.out.println(number);
            total += number;

            if (number > maks)
                maks = number;

        }
        System.out.println("Total: " + total);
        System.out.println("Maks: " + maks);

        System.out.println("------------------");
        // MULTİDİMENSİONAL ARRAYS
        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "manis";
        sehirler[0][1] = "izmir";
        sehirler[0][2] = "istan";
        sehirler[1][0] = "akhisar";
        sehirler[1][1] = "turgutlu";
        sehirler[1][2] = "saruhanlı";
        sehirler[2][0] = "bornova";
        sehirler[2][1] = "aliaga";
        sehirler[2][2] = "menemen";

        for(int i=0;3>i;i++){
            for(int j=0;3>j;j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }
}
