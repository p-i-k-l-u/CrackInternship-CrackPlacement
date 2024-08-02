import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxLength = 0;
        int maxRepeatCount = 0;
        int len = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < len; right++) {
            char curr = s.charAt(right);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
            maxRepeatCount = Math.max(maxRepeatCount, map.get(curr));
            int nonRepeat = (right - left + 1) - maxRepeatCount;

            if (nonRepeat > k) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement solution = new LongestRepeatingCharacterReplacement();
        String s = "AABABBA";
        int k = 1;
        int result = solution.characterReplacement(s, k);
        System.out.println("The length of the longest substring after replacement is: " + result);
    }
}
