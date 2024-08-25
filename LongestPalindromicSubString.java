public class LongestPalindromicSubString {

    public static String longestPalindrome(String str) {
        if (str.length() <= 1) {
            return str;
        }

        String LPS = "";

        for (int i = 1; i < str.length(); i++) {
            // consider odd length
            int low = i;
            int high = i;

            while (low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {
                low--;
                high++;
            }

            String palindrome = str.substring(low + 1, high);
            if (palindrome.length() > LPS.length()) {
                LPS = palindrome;
            }

            // consider even length
            low = i - 1;
            high = i;
            while (low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {
                low--;
                high++;
            }

            palindrome = str.substring(low + 1, high);
            if (palindrome.length() > LPS.length()) {
                LPS = palindrome;
            }
        }

        return LPS;
    }

    public static void main(String[] args) {
        String str = "babad";
        System.out.println("Longest Palindromic Substring of '" + str + "' is: " + longestPalindrome(str));

        str = "cbbd";
        System.out.println("Longest Palindromic Substring of '" + str + "' is: " + longestPalindrome(str));
    }
}
