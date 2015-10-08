/**
 * Created by William on 2015/7/1.
 */
public class Palindrome {

    public static boolean isPalindrome(String s) {
        int N = s.length();
        for (int i = 0; i < N / 2; i++)
            if (s.charAt(i) != s.charAt(N - 1 - i)) {
                return false;
            }
        return true;


    }


    public static void main(String[] args) {


        if (isPalindrome(args[0]))
            System.out.println("True!");

        else System.out.println("False!");

    }
}
