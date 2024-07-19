import java.util.ArrayList;
import java.util.List;

class Permutation {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultset = new ArrayList<>();
        backtrack(resultset, new ArrayList<>(), nums);
        return resultset;
    }

    private void backtrack(List<List<Integer>> resultlist, ArrayList<Integer> templist, int[] nums) {
        // if we match the length , it is a permutation

        if (templist.size() == nums.length) {
            resultlist.add(new ArrayList<>(templist));
            return;
        }

        for (int number : nums) {
            // skip if we get same element

            if (templist.contains(number))
                continue;

            // add the new element
            templist.add(number);

            backtrack(resultlist, templist, nums);

            // remove the element

            templist.remove(templist.size() - 1);
        }
    }

    public static void main(String[] args) {
        Permutation obj = new Permutation();
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> result = obj.permute(nums);
        System.out.println("The permutations of the array are: " + result);
    }

}
