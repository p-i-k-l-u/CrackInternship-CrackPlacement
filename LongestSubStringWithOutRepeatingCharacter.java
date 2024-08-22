import java.util.HashMap;

public class LongestSubStringWithOutRepeatingCharacter {

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        int n = s.length();
        int len = 0;
        while (right < n) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            }
            map.put(s.charAt(right), right);
            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }

    public static void main(String[] args) {
        String str = "abcdebaszthyd";
        System.out.println(
                "The length of the longest substring without repeating characters is " + lengthOfLongestSubstring(str));
    }
}
