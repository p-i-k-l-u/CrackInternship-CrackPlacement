import java.util.*;

public class GenerateParaenthesis {

    public List<String> generateParen(int n) {

        List<String> ans = new ArrayList<>();
        solve("", 0, 0, n, ans);
        return ans;

    }

    // recursive function
    private void solve(String curr, int open, int close, int total, List<String> ans) {
        if (curr.length() == 2 * total) {
            ans.add(curr);
            return;
        }

        if (open < total) {
            solve(curr + "(", open + 1, close, total, ans);
        }

        if (close < open) {
            solve(curr + ")", open, close + 1, total, ans);
        }
    }

    public static void main(String[] args) {

        GenerateParaenthesis gp = new GenerateParaenthesis();
        int n = 3;
        List<String> res = gp.generateParen(n);
        System.out.println(res);
    }

}
