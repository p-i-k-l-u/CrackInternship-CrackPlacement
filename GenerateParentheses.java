import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public List<String> generateParentheses(int n) {
        List<String> ans = new ArrayList<>();
        recurSlove("", 0, 0, n, ans);
        return ans;
    }

    private void recurSlove(String curr, int open, int closed, int total, List<String> ans) {

        if (curr.length() == 2 * total) {
            ans.add(curr);
            return;
        }

        if (open < total) {
            recurSlove(curr + "(", open + 1, closed, total, ans);
        }

        if (closed < open) {
            recurSlove(curr + ")", open, closed + 1, total, ans);
        }
    }

    public static void main(String[] args) {
        GenerateParentheses gp = new GenerateParentheses();
        int n = 3;
        List<String> result = gp.generateParentheses(n);
        System.out.println("The combinations of well-formed parentheses are: " + result);
    }

}
