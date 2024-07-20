import java.util.Arrays;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i]) {
                break;
            }
            res.append(first[i]);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] strs = { "flower", "flow", "flight" };
        String prefix = lcp.longestCommonPrefix(strs);
        System.out.println("The Longest common Prefis is :" + prefix);
    }
}
