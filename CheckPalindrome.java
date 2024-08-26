public class CheckPalindrome {

    public static boolean palindrome(int n) {
        int revNum = 0;// reverse of the number
        int dup = n;// duplicate variable

        while (n > 0) {
            int ld = n % 10;// extract the last digit of the number

            revNum = (revNum % 10) + ld;// build the reverse num
            // by appending the last digit

            n = n / 10;

        }

        // check if the original number is equal to its reverse
        if (dup == revNum) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int number = 4554;

        if (palindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
