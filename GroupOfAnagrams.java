import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupOfAnagrams {

    public List<List<String>> groupAnagram(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);

            String storeWord = new String(ch);
            if (!map.containsKey(storeWord)) {
                map.put(storeWord, new ArrayList<>());
            }

            map.get(storeWord).add(word);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupOfAnagrams goa = new GroupOfAnagrams();
        String[] input = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> result = goa.groupAnagram(input);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
