public class switchDemo {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("Congratulations you pass");
                break;
            case 'B':
                System.out.println("Passed");
                break;

            case 'C':
                System.out.println("Meeeeehhh not bad you passed");
                break;

            case 'F':
                System.out.println(":D you failed :D");
                break;

            default:
                System.out.println("Can't you even entry your grade");

        }
    }
}