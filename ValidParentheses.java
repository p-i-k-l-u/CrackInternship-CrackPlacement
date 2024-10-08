import java.util.Stack;

class ValidParentheses {

    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else {
                if (st.isEmpty())
                    return false;
                char ch = st.pop();
                if ((s.charAt(i) == ')' && ch == '(') ||
                        (s.charAt(i) == '}' && ch == '{') ||
                        (s.charAt(i) == ']' && ch == '['))
                    ;
                else
                    return false;
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        System.out.println("Example 1: " + vp.isValid("()")); // Output: true
        System.out.println("Example 2: " + vp.isValid("()[]{}")); // Output: true
        System.out.println("Example 3: " + vp.isValid("(]")); // Output: false
    }
}
