import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        try {
            int[] nums = new int[]{0, 1, 2, 3};
            System.out.println(nums[5]);

        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("An error has been occured:\n" + exception);

        } catch (ArrayIndexOutOfBoundsException exception1) {
            System.out.println("An error has been occured:\n" + exception1);
        } finally {
            System.out.println("ErimsahCode.com");
        }

    }
}