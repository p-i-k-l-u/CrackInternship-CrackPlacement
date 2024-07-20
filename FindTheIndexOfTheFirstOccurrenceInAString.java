public class FindTheIndexOfTheFirstOccurrenceInAString {

    public boolean compare(String haystack, String needle, int idx) {
        int n1 = haystack.length();
        int n2 = needle.length();

        for (int i = 0; i < n2; i++) {
            if (idx >= n1)
                return false;
            if (haystack.charAt(idx++) != needle.charAt(i))
                return false;
        }
        return true;
    }

    public int findStringOccu(String haystack, String needle) {
        int n1 = haystack.length();
        for (int i = 0; i < n1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (compare(haystack, needle, i) == true)
                    return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FindTheIndexOfTheFirstOccurrenceInAString finder = new FindTheIndexOfTheFirstOccurrenceInAString();
        String haystack = "sadbutsad";
        String needle = "sad";
        int index = finder.findStringOccu(haystack, needle);
        System.out.println("The first occurrence of '" + needle + "' in '" + haystack + "' is at index: " + index);
    }

}
