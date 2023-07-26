package game;

public class Palindromic {

    static boolean isPalindrome(String str) {
        int k = str.length();
        boolean isPali = true;

        for (int i = 0; str.length() > i; i++) {
            for (int j = k-1; j > 0;) {

                if (str.charAt(i) == str.charAt(j)) {
                    k--;
                    break;
                }else {
                    k--;
                    isPali = false;
                    break;
                }


            }
        }


        return isPali;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("abcdcba"));

    }
}
